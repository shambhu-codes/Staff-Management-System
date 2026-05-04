
import DB.DBConnection;

import frontend.LoginBox;

public class DriverClass {
    public static void main(String[] args) {
        try{
        DBConnection db_connect=new DBConnection();
        LoginBox login=new LoginBox();
        login.setVisible(true);
        }catch(Exception e){
            System.out.print("Database Can't connected");
        }  
    }
    
}
