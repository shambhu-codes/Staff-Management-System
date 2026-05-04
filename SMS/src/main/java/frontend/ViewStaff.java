package frontend;

import entity.User;
import javax.swing.JOptionPane;

public class ViewStaff extends javax.swing.JFrame {

    public ViewStaff() {
        initComponents();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Staff Id", "Staff Name", "Father Name", "DOB", "Address", "Phone", "Email", "Education", "Designation", "Aadhar Number"
                }
        ) {
            public boolean isCellEditable(int row, int column) {
                return column != 0; // ID not editable
            }
        });
        loadStaffIds();
        loadAllStaff();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(51, 82, 241));
        setPreferredSize(new java.awt.Dimension(1130, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 82, 241));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 900));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff Id", "Staff Name", "Father Name", "DOB", "Address", "Phone", "Email", "Education", "Designation", "Aadhar Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setPreferredSize(new java.awt.Dimension(900, 900));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 160, 1050, 620);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 100, 109, 36);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Print");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 100, 93, 36);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(this::jButton3ActionPerformed);
        jPanel1.add(jButton3);
        jButton3.setBounds(290, 100, 87, 36);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.setBorder(new javax.swing.border.MatteBorder(null));
        jButton4.addActionListener(this::jButton4ActionPerformed);
        jPanel1.add(jButton4);
        jButton4.setBounds(540, 100, 89, 36);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search By Staff Id");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 50, 139, 32);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(210, 50, 215, 32);

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jPanel1.add(jButton5);
        jButton5.setBounds(410, 100, 87, 36);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Staff List");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 10, 130, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 1130, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        User user = new User();
        String userRole = user.getRole();

        if (userRole != null && userRole.equalsIgnoreCase("admin")) {
            setVisible(false);
            new AdminDashboard().setVisible(true);
        } else if (userRole != null && userRole.equalsIgnoreCase("clerk")) {
            setVisible(false);
            new ClerkDashboard().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid role");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String selectedId = jComboBox1.getSelectedItem().toString();

            java.sql.Connection con = DB.DBConnection.conn;

            String query = "SELECT * FROM staff WHERE id=?";
            java.sql.PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(selectedId));

            java.sql.ResultSet rs = ps.executeQuery();

            javax.swing.table.DefaultTableModel model
                    = (javax.swing.table.DefaultTableModel) jTable1.getModel();

            model.setRowCount(0);

            if (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("father_name"),
                    rs.getDate("dob"),
                    rs.getString("address"),
                    rs.getString("phone"),
                    rs.getString("email"),
                    rs.getString("education"),
                    rs.getString("designation"),
                    rs.getString("aadhar")
                });
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No Record Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            java.text.MessageFormat header = new java.text.MessageFormat("Staff List");
            java.text.MessageFormat footer = new java.text.MessageFormat("Page {0}");

            jTable1.print(
                    javax.swing.JTable.PrintMode.FIT_WIDTH,
                    header,
                    footer
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a row first");
            return;
        }

        try {
            javax.swing.table.DefaultTableModel model
                    = (javax.swing.table.DefaultTableModel) jTable1.getModel();

            int id = Integer.parseInt(model.getValueAt(row, 0).toString());

            String name = model.getValueAt(row, 1).toString();
            String father = model.getValueAt(row, 2).toString();
            String dob = model.getValueAt(row, 3).toString();
            String address = model.getValueAt(row, 4).toString();
            String phone = model.getValueAt(row, 5).toString();
            String email = model.getValueAt(row, 6).toString();
            String education = model.getValueAt(row, 7).toString();
            String designation = model.getValueAt(row, 8).toString();
            String aadhar = model.getValueAt(row, 9).toString();

            java.sql.Connection con = DB.DBConnection.conn;

            String query = "UPDATE staff SET name=?, father_name=?, dob=?, address=?, phone=?, email=?, education=?, designation=?, aadhar=? WHERE id=?";
            java.sql.PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, father);
            ps.setString(3, dob);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setString(6, email);
            ps.setString(7, education);
            ps.setString(8, designation);
            ps.setString(9, aadhar);
            ps.setInt(10, id);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Updated Successfully");

            loadAllStaff();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a row first");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this staff?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            javax.swing.table.DefaultTableModel model
                    = (javax.swing.table.DefaultTableModel) jTable1.getModel();

            int id = Integer.parseInt(model.getValueAt(row, 0).toString());

            java.sql.Connection con = DB.DBConnection.conn;

            String query = "DELETE FROM staff WHERE id=?";
            java.sql.PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Deleted Successfully");

            loadAllStaff();
            loadStaffIds();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void loadStaffIds() {
        try {
            java.sql.Connection con = DB.DBConnection.conn;

            String query = "SELECT id FROM staff";
            java.sql.PreparedStatement ps = con.prepareStatement(query);
            java.sql.ResultSet rs = ps.executeQuery();

            jComboBox1.removeAllItems();

            while (rs.next()) {
                jComboBox1.addItem(rs.getString("id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadAllStaff() {
        try {
            java.sql.Connection con = DB.DBConnection.conn;

            String query = "SELECT * FROM staff";
            java.sql.PreparedStatement ps = con.prepareStatement(query);
            java.sql.ResultSet rs = ps.executeQuery();

            javax.swing.table.DefaultTableModel model
                    = (javax.swing.table.DefaultTableModel) jTable1.getModel();

            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("father_name"),
                    rs.getDate("dob"),
                    rs.getString("address"),
                    rs.getString("phone"),
                    rs.getString("email"),
                    rs.getString("education"),
                    rs.getString("designation"),
                    rs.getString("aadhar")
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
