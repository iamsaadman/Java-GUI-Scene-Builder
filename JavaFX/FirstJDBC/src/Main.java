
import java.sql.*;
class FirstJDBC
{
    public static void main(String[] args) {
        try {
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");

            //create a connection

            String url = "jdbc:mysql://localhost:3306/saadman";
            String username = "root";
            String password ="root";

            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("Connection is closed");
            }else{
                System.out.println("Connection Created");
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
    }

}