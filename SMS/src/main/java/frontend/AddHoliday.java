
package frontend;

import DB.DBConnection;
import java.sql.Connection;

public class AddHoliday extends javax.swing.JFrame {
   
    public AddHoliday() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        eventName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        event_Date = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(51, 82, 241));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 82, 241));
        jPanel1.setLayout(null);

        jLabel1.setText("Event");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 60, 115, 40);
        jPanel1.add(eventName);
        eventName.setBounds(320, 60, 162, 40);

        jLabel2.setText("Date");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 130, 115, 32);
        jPanel1.add(event_Date);
        event_Date.setBounds(320, 120, 162, 40);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1);
        jButton1.setBounds(245, 196, 75, 31);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2);
        jButton2.setBounds(396, 196, 81, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new HolidayDeclare().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String event = eventName.getText();
        String date = event_Date.getText();

        if (event.isEmpty() || date.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill all fields");
            return;
        }

        try {
            Connection con = DBConnection.conn;

            String query = "INSERT INTO holidays(event, holiday_date) VALUES (?, ?)";
            java.sql.PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, event);
            ps.setString(2, date);

            ps.executeUpdate();

            javax.swing.JOptionPane.showMessageDialog(this, "Holiday Added Successfully");

            // Clear fields
            eventName.setText("");
            event_Date.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eventName;
    private javax.swing.JTextField event_Date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
