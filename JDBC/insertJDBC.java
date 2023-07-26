import java.sql.*;
public class insertJDBC {
    public static void main(String[] args) {
        try {
            // load driver
            Class.forName("com.mysql.jdbc.Driver");

            // create connection
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="system";
            String password="system";
            Connection con=DriverManager.getConnection(url, username, password);

            // if(con.isClosed()){
            //     System.out.println("Connection closed");
            // }
            // else{
            //     System.out.println("Connection established");
            // }


            // create a query
            String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
            

            // create statement
            Statement stmt=con.createStatement();

            stmt.executeUpdate(q);
            System.out.println("Table 1 created in database");
            con.close();

        } catch (Exception e) {
           
            e.printStackTrace();
        }

        
    }
}
