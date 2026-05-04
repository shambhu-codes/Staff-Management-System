package frontend;

import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CreateUser extends javax.swing.JFrame {

    public CreateUser() {
        initComponents();
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Admin", "Clerk"}));
        loadTable();
        userId.setText("Auto Generated");
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
        userName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        role = new javax.swing.JComboBox<>();
        password = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        userId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 82, 241));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("User Creation");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 20, 180, 31);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UserId");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(91, 74, 90, 29);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UserName");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 120, 120, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 176, 70, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Role");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 240, 70, 30);
        jPanel1.add(userName);
        userName.setBounds(220, 130, 190, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 80, 110, 40);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 140, 110, 40);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(this::jButton3ActionPerformed);
        jPanel1.add(jButton3);
        jButton3.setBounds(510, 190, 110, 40);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(this::jButton4ActionPerformed);
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 20, 110, 40);

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Clerk" }));
        role.addActionListener(this::roleActionPerformed);
        jPanel1.add(role);
        role.setBounds(220, 242, 190, 30);

        password.addActionListener(this::passwordActionPerformed);
        jPanel1.add(password);
        password.setBounds(220, 180, 190, 30);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setText("Save");
        jButton5.setEnabled(false);
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jPanel1.add(jButton5);
        jButton5.setBounds(510, 250, 110, 40);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserId", "UserName", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 480, 370);

        userId.setEditable(false);
        userId.setEnabled(false);
        jPanel1.add(userId);
        userId.setBounds(220, 82, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminDashboard().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mode = "ADD";

        userId.setText("Auto Generated");
        userName.setText("");

        password.setText(generatePassword());
        password.setEditable(false);   // Admin cannot type password

        role.setSelectedIndex(0);

        jButton5.setEnabled(true);

        JOptionPane.showMessageDialog(this, "Enter details and click Save");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // EDIT MODE
        mode = "EDIT";

        if (userId.getText().equals("") || userId.getText().equals("Auto Generated")) {
            JOptionPane.showMessageDialog(this, "Select a user first!");
            return;
        }

        jButton5.setEnabled(true);
        password.setEditable(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // DELETE
        if (userId.getText().equals("") || userId.getText().equals("Auto Generated")) {
            JOptionPane.showMessageDialog(this, "Select a user first!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure?");
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            Connection conn = DB.DBConnection.conn;
            conn.setAutoCommit(false);

            String q = "DELETE FROM login_table WHERE uid=?";
            PreparedStatement ps = conn.prepareStatement(q);
            ps.setInt(1, Integer.parseInt(userId.getText()));

            int count = ps.executeUpdate();

            if (count > 0) {
                conn.commit();
                JOptionPane.showMessageDialog(this, "Deleted Successfully");
            } else {
                conn.rollback();
            }

            conn.setAutoCommit(true);
            loadTable();
            resetForm();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // SAVE (ADD / EDIT)

        String name = userName.getText();
        String userRole = role.getSelectedItem().toString();

        if (name.isEmpty() || userRole.equals("Select")) {
            JOptionPane.showMessageDialog(this, "All fields required!");
            return;
        }

        try {
            Connection conn = DB.DBConnection.conn;
            conn.setAutoCommit(false);

            String checkQuery = "SELECT * FROM login_table WHERE user_name=?";
            PreparedStatement checkPs = conn.prepareStatement(checkQuery);
            checkPs.setString(1, name);
            ResultSet rs = checkPs.executeQuery();

            if (mode.equals("ADD")) {

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Username already exists!");
                    return;
                }

                // ✅ AUTO PASSWORD
                String pass = generatePassword();

                String q = "INSERT INTO login_table (user_name, password, role) VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(q);

                ps.setString(1, name);
                ps.setString(2, pass);
                ps.setString(3, userRole);

                ps.executeUpdate();
                conn.commit();

                JOptionPane.showMessageDialog(this, "User Added!\nPassword: " + pass);

            } else if (mode.equals("EDIT")) {

                int uid = Integer.parseInt(userId.getText());

                if (rs.next()) {
                    int existingId = rs.getInt("uid");

                    if (existingId != uid) {
                        JOptionPane.showMessageDialog(this, "Username already used!");
                        return;
                    }
                }

                password.setText(generatePassword());
                password.setEditable(false);
                password.setEnabled(false);

                String q = "UPDATE login_table SET user_name=?,role=? WHERE uid=?";
                PreparedStatement ps = conn.prepareStatement(q);

                ps.setString(1, name);
                ps.setString(2, userRole);
                ps.setInt(3, uid);

                ps.executeUpdate();
                conn.commit();

                JOptionPane.showMessageDialog(this, "User Updated!");
            }

            conn.setAutoCommit(true);
            loadTable();
            resetForm();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int i = Table.getSelectedRow();

        userId.setText(Table.getModel().getValueAt(i, 0).toString());
        userName.setText(Table.getModel().getValueAt(i, 1).toString());
        password.setText(generatePassword());
        String dbRole = Table.getModel().getValueAt(i, 2).toString();

        // ✅ Case-insensitive matching
        for (int j = 0; j < role.getItemCount(); j++) {
            if (role.getItemAt(j).equalsIgnoreCase(dbRole)) {
                role.setSelectedIndex(j);
                break;
            }
        }

        password.setEnabled(false);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_TableMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_passwordActionPerformed
    public void loadTable() {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();

        try {
            model.setRowCount(0);

            Connection conn = DB.DBConnection.conn;
            String query = "SELECT * FROM login_table";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("uid"),
                    rs.getString("user_name"),
                    rs.getString("role")
                });
            }
            password.setEnabled(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetForm() {
        userId.setText("Auto Generated");
        userName.setText("");
        password.setText("");
        role.setSelectedIndex(0);

        password.setEditable(true);
        jButton1.setEnabled(true);
        jButton5.setEnabled(false);
    }

    public String generatePassword() {
        java.time.LocalDateTime now = java.time.LocalDateTime.now();

        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        int year = now.getYear();
        int hour = now.getHour();
        int minute = now.getMinute();

        return "U@" + day + month + year + hour + minute;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JTextField userId;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
    String mode = "";
}
