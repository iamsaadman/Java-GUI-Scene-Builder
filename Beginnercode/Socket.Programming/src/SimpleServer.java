import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {

      ServerSocket serverSocket = new ServerSocket(1234);

        System.out.println("Server is waiting to accept a new connection");

        Socket socket = serverSocket.accept();

        System.out.println("Connection Established");

        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        String ClientData,serverData;

        ClientData = inputStream.readUTF();
        System.out.println("Client sent the data :"+ClientData);

        serverData = "[This is a message from the server]";
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

        outputStream.writeUTF(serverData);
    }
}