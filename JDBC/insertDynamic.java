import java.sql.*;
import java.util.*;
import java.io.*;
public class insertDynamic {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
             
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="system";
            String password="system";
            Connection con=DriverManager.getConnection(url, username, password);

            String q="insert into table1(tName,tCity) values(?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            // Scanner sc=new Scanner(System.in);
            // System.out.println("enter name: ");
            // String name=sc.next();
            // System.out.println("enter city: ");
            // String city=sc.next();

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name: ");
            String name=br.readLine();
            System.out.println("enter city: ");
            String city=br.readLine();

            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.executeUpdate();
            System.out.println("Updated");
            con.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
