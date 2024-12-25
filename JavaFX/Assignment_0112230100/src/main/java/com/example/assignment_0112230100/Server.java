package com.example.assignment_0112230100;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private static final int PORT = 8888;
    private static final String LOG_FILE_PATH = "logs.txt";
    private List<String> logs = new ArrayList<>();

    public static void main(String[] args) {
        Server server = new Server();
        server.startServer();
    }
    public void startServer() {
        loadLogsFromFile();

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Accepted connection from " + clientSocket.getInetAddress());

                handleClient(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleClient(Socket clientSocket) {
        try (ObjectInputStream input = new ObjectInputStream(clientSocket.getInputStream());
             ObjectOutputStream output = new ObjectOutputStream(clientSocket.getOutputStream())) {

            Object request = input.readObject();

            if (request instanceof Request) {
                Request arithmeticRequest = (Request) request;
                double result = performArithmeticOperation(arithmeticRequest);
                output.writeObject(new Response(result));

                logToFile(arithmeticRequest.toString());
            } else if (request instanceof GetAllLogsRequest) {
                List<String> logs = readLogsFromFile();
                output.writeObject(logs);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private double performArithmeticOperation(Request request) {
        double number1 = request.getNum1();
        double number2 = request.getNum2();
        String operation = request.getOperation();

        switch (operation) {
            case "Addition":
                return number1 + number2;
            case "Subtraction":
                return number1 - number2;
            case "Multiplication":
                return number1 * number2;
            case "Division":
                return number1 / number2;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }

    private void logToFile(String logEntry) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true))) {
            writer.write(logEntry + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadLogsFromFile() {
        File logFile = new File(LOG_FILE_PATH);
        if (logFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    logs.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private List<String> readLogsFromFile() {
        List<String> logs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logs.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logs;
    }
}
