package Spring2023;

import java.io.*;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {

            try {
                BufferedWriter write = new BufferedWriter(new FileWriter("employee.txt"));
                Scanner sc = new Scanner(System.in);

                System.out.println("Give input for how many employee to give in loop.");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    System.out.println("Employee Number: "+i);
                    write.write("Employee Number: "+i+"\n");
                    String employee_name = sc.next();
                    int id = sc.nextInt();
                    double score = sc.nextDouble();
                    write.write(employee_name+"\n");
                    write.write(String.valueOf(id)+"\n");
                    write.write(String.valueOf(score)+"\n\n\n");

                }
                write.close();
                BufferedReader read = new BufferedReader(new FileReader("employee.txt"));
                String line;

             BufferedWriter writer2 = new BufferedWriter(new FileWriter("increament.txt"));
             while ((line = read.readLine())!=null){

                 writer2.write(line +"\n");
             }
             read.close();
             writer2.close();

            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }

