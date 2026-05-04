
package entity;

public class User {

    private static int uid;
    private static String userName;
    private static String pswd;
    private static String role;

    

    public static int getUid() {
        return User.uid;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPswd() {
        return this.pswd;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPswd(String dbPassword) {
        pswd = dbPassword;
    }

    public void setUserName(String dbUserName) {
        userName = dbUserName;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
