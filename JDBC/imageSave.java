import java.sql.*;
import java.io.*;
public class imageSave {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/youtube";
            String username="system";
            String password="system";
            Connection con=DriverManager.getConnection(url, username, password);


            String q="insert into images(pic) values(?)";
            PreparedStatement pstmt=con.prepareStatement(q);

            // pstmt.setString(1,value);   //use for value not for images
            FileInputStream fis=new FileInputStream("jdbc.jpg");
            pstmt.setBinaryStream(1, fis, fis.available());

            pstmt.executeUpdate();
            System.out.println("inserted");
            con.close();
        }
        catch(Exception e){
            System.out.println("error...");
        }
    }
}
