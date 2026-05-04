package frontend;

import java.awt.event.ActionEvent;

public class AddStaffDetails extends javax.swing.JFrame {

    public AddStaffDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fathersName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        highestEducation = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        aadharNumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        doj = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(135, 205, 235));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(135, 205, 235));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 750));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Add Staff Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(339, 30, 228, 40);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 110, 72, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Date Of Birth");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 160, 120, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Address");
        jLabel4.setFocusTraversalPolicyProvider(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 230, 80, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("E-mail");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 290, 80, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Designation");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 350, 100, 40);
        jPanel1.add(name);
        name.setBounds(240, 100, 180, 40);
        jPanel1.add(dob);
        dob.setBounds(240, 160, 180, 40);
        jPanel1.add(address);
        address.setBounds(240, 230, 180, 40);
        jPanel1.add(email);
        email.setBounds(240, 290, 180, 40);
        jPanel1.add(designation);
        designation.setBounds(240, 360, 180, 40);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 510, 100, 30);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2);
        jButton2.setBounds(492, 513, 80, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Father's Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 100, 110, 40);
        jPanel1.add(fathersName);
        fathersName.setBounds(650, 100, 190, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Highest Education");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(500, 170, 150, 30);

        highestEducation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "BCA", "BBA", "B-Com", "B-Sc", "BE", "B-Tech", "MCA", "MBA", "M-Sc", "M-Com", "PHD", " " }));
        highestEducation.addActionListener(this::highestEducationActionPerformed);
        jPanel1.add(highestEducation);
        highestEducation.setBounds(650, 170, 190, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Phone");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(503, 236, 130, 40);
        jPanel1.add(phoneNumber);
        phoneNumber.setBounds(650, 242, 190, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Aadhar Number");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(500, 310, 130, 30);
        jPanel1.add(aadharNumber);
        aadharNumber.setBounds(650, 310, 190, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Date Of Joining");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(500, 366, 130, 40);
        jPanel1.add(doj);
        doj.setBounds(650, 370, 190, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(947, 757));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void highestEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highestEducationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_highestEducationActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ClerkDashboard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {

            // DATE FORMAT CHECK
            if (!dob.getText().matches("\\d{4}-\\d{2}-\\d{2}")
                    || !doj.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {

                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Date format must be:\nYYYY-MM-DD\nExample: 2026-04-30"
                );
                return;
            }

            java.sql.Connection con = DB.DBConnection.conn;

            String query = "INSERT INTO staff (name, father_name, dob, address, email, designation, education, phone, aadhar, joining_date, status) VALUES (?,?,?,?,?,?,?,?,?,?, 'Pending')";

            java.sql.PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name.getText());
            ps.setString(2, fathersName.getText());
            ps.setString(3, dob.getText());
            ps.setString(4, address.getText());
            ps.setString(5, email.getText());
            ps.setString(6, designation.getText());
            ps.setString(7, highestEducation.getSelectedItem().toString());
            ps.setString(8, phoneNumber.getText());
            ps.setString(9, aadharNumber.getText());
            ps.setString(10, doj.getText());

            ps.executeUpdate();

            javax.swing.JOptionPane.showMessageDialog(this, "Staff Added (Waiting for Admin Approval)");

            clearFields();

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearFields() {
        name.setText("");
        fathersName.setText("");
        dob.setText("");
        address.setText("");
        email.setText("");
        designation.setText("");
        phoneNumber.setText("");
        aadharNumber.setText("");
        doj.setText("");
        highestEducation.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadharNumber;
    private javax.swing.JTextField address;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField doj;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fathersName;
    private javax.swing.JComboBox<String> highestEducation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneNumber;
    // End of variables declaration//GEN-END:variables

}
