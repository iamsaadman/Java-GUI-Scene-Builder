import javax.imageio.IIOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",1234);

        String clientData,serverData;

        clientData = "[This is a message from the client]";

        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        outputStream.writeUTF(clientData);

        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        serverData=inputStream.readUTF();


        System.out.println("Server message :"+serverData);

    }
}
