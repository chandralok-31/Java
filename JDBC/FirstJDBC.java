import java.sql.*;
public class FirstJDBC {
    public static void main(String[] args) {
        try{
            // load the driver
            Class.forName("com.mysql.jdbc.Driver");

            // creating a connection
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="system";
            String password="system";
            Connection con=DriverManager.getConnection(url, username, password);
            if(con.isClosed()){
                System.out.println("connection closed");
            }
            else{
                System.out.println("connection established...");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
