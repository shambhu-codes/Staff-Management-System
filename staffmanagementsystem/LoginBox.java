/*LoginFrame class */
package staffmanagementsystem.com;
import java.awt.*;
public class LoginBox extends Frame{
    LoginBox(String t){
        setTitle(t);
        setLayout(null);
        setSize(400,400);
        setBackground(Color.DARK_GRAY);
        Label l1=new Label("UserName:");
        l1.setBounds(60,60,100,30);
        TextField t1=new TextField();
        t1.setBounds(170,60,100,30);
        Label l2=new Label("UserName:");
        l2.setBounds(60,100,100,30);
        TextField t2=new TextField();
        t2.setBounds(170,100,100,30);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
    }
}