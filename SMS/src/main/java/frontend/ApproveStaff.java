package frontend;

public class ApproveStaff extends javax.swing.JFrame {

    public ApproveStaff() {
        initComponents();
        loadStaffTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 82, 241));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff Id", "Staff Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(170, 120, 604, 402);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Approve");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1);
        jButton1.setBounds(254, 596, 99, 45);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2);
        jButton2.setBounds(565, 597, 92, 44);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Staff Approval Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 40, 260, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminDashboard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            java.sql.Connection con = DB.DBConnection.conn;

            javax.swing.table.DefaultTableModel model
                    = (javax.swing.table.DefaultTableModel) jTable1.getModel();

            for (int i = 0; i < model.getRowCount(); i++) {

                Boolean isChecked = (Boolean) model.getValueAt(i, 2);

                if (isChecked != null && isChecked) {

                    int id = Integer.parseInt(model.getValueAt(i, 0).toString());

                    String query = "UPDATE staff SET status='Approved' WHERE id=?";
                    java.sql.PreparedStatement ps = con.prepareStatement(query);
                    ps.setInt(1, id);
                    ps.executeUpdate();
                }
            }

            javax.swing.JOptionPane.showMessageDialog(this, "Selected Staff Approved");

            loadStaffTable();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loadStaffTable() {
        try {
            java.sql.Connection con = DB.DBConnection.conn;

            String query = "SELECT id, name, status FROM staff WHERE status='Pending'";
            java.sql.PreparedStatement ps = con.prepareStatement(query);
            java.sql.ResultSet rs = ps.executeQuery();

            javax.swing.table.DefaultTableModel model
                    = (javax.swing.table.DefaultTableModel) jTable1.getModel();

            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    false // checkbox for approval
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
