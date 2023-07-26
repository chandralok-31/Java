import java.sql.*;
public class insertPreparedStatement {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="system";
            String password="system";
            Connection con=DriverManager.getConnection(url, username, password);
            // create query
            String q="insert into table1(tName,tCity) values(?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);

            // set the value to query
            pstmt.setString(1, "lok");
            pstmt.setString(2, "kolkata");

            pstmt.executeUpdate();
            System.out.println("inserted");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
