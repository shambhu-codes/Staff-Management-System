/*Main Menu Frame after Login the user  */
package staffmanagementsystem.com;

import java.awt.*;
public class MenuFrame extends Frame{
    MenuFrame(String t){
       setTitle(t);
       setSize(400,400);
       setLayout(null);
       setBackground(Color.DARK_GRAY);
       setVisible(true);
        // MenuBar
        MenuBar mb = new MenuBar();

        // Staff Menu 
        Menu staff = new Menu("Staff");

        // Teaching Staff
        Menu teaching = new Menu("Teaching Staff");
        MenuItem addTeach = new MenuItem("Add Staff");
        MenuItem viewTeach = new MenuItem("View Staff");
        MenuItem updateTeach = new MenuItem("Update Staff");

        teaching.add(addTeach);
        teaching.add(viewTeach);
        teaching.add(updateTeach);

        // Non-Teaching Staff
        Menu nonTeaching = new Menu("Non-Teaching Staff");
        MenuItem addNonTeach = new MenuItem("Add Staff");
        MenuItem viewNonTeach = new MenuItem("View Staff");
        MenuItem updateNonTeach = new MenuItem("Update Staff");

        nonTeaching.add(addNonTeach);
        nonTeaching.add(viewNonTeach);
        nonTeaching.add(updateNonTeach);

        staff.add(teaching);
        staff.add(nonTeaching);

        // Attendance 
        Menu attendance = new Menu("Attendance");
        MenuItem markAttend = new MenuItem("Mark Attendance");
        MenuItem viewAttend = new MenuItem("View Attendance");

        attendance.add(markAttend);
        attendance.add(viewAttend);

        //  Reports 
        Menu reports = new Menu("Reports");
        MenuItem teachStaffReport = new MenuItem("Teaching Staff Report");
        MenuItem nonTeachStaffReport = new MenuItem("Non-Teaching Staff Report");

        reports.add(teachStaffReport);
        reports.add(nonTeachStaffReport);

        // Admin 
        Menu admin = new Menu("Admin");
        MenuItem changePswd = new MenuItem("Change Password");
        MenuItem createUser = new MenuItem("Create User");

        admin.add(changePswd);
        admin.add(createUser);

        // Logout 
        Menu logout = new Menu("Logout");

        // Add menus to MenuBar 
        mb.add(staff);
        mb.add(attendance);
        mb.add(reports);
        mb.add(admin);
        mb.add(logout);

        setMenuBar(mb);
    }

    
}
