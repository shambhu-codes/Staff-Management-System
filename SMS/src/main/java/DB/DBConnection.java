
package DB;
import java.sql.*;


public class DBConnection {
    private String driver="com.mysql.cj.jdbc.Driver";
    private String URL="jdbc:mysql://localhost:3306/staff_management_system";
    private String user_Name="root";
    private String password="shambhu@2005";
    public static Connection conn;
    
    //DataBase Connection
    public DBConnection()throws ClassNotFoundException, SQLException{
        Class.forName(driver);  //Driver Load
        conn=DriverManager.getConnection(URL,user_Name,password); //Create Connection
        System.out.print("Database connected");
    }
}
