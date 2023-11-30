package PasswordManager;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    private Connection connection;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public Dashboard() {
        initComponents();

        // Connect to the database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/securepass_db", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database. Please check your connection.", "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1); // Exit the application if database connection fails
        }

        loadDataIntoTable();
    }

    private void loadDataIntoTable() {
        try {
            String query = "SELECT * FROM info";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                String platform = resultSet.getString("platform");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                model.addRow(new Object[]{platform, email, password});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error accessing the database.", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lockButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        deleteAllButton = new javax.swing.JButton();
        removeLockButton = new javax.swing.JButton();
        generatePasswordButton = new javax.swing.JButton();
        checkPasswordStrengthButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 360));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Platform", "Email", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 204, 204));
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
        }

        lockButton.setBackground(new java.awt.Color(0, 204, 204));
        lockButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lockButton.setForeground(new java.awt.Color(255, 255, 255));
        lockButton.setText("Lock");
        lockButton.setBorderPainted(false);
        lockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("SecurePass");

        addButton.setBackground(new java.awt.Color(0, 204, 204));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorderPainted(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 102, 102));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorderPainted(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        deleteAllButton.setBackground(new java.awt.Color(255, 102, 102));
        deleteAllButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteAllButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteAllButton.setText("Delete All");
        deleteAllButton.setBorderPainted(false);
        deleteAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllButtonActionPerformed(evt);
            }
        });

        removeLockButton.setBackground(new java.awt.Color(255, 102, 102));
        removeLockButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        removeLockButton.setForeground(new java.awt.Color(255, 255, 255));
        removeLockButton.setText("Remove Lock");
        removeLockButton.setBorderPainted(false);
        removeLockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLockButtonActionPerformed(evt);
            }
        });

        generatePasswordButton.setText("Generate Password");
        generatePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePasswordButtonActionPerformed(evt);
            }
        });

        checkPasswordStrengthButton.setText("Check Password Strength");
        checkPasswordStrengthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPasswordStrengthButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteAllButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lockButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeLockButton))
                            .addComponent(generatePasswordButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkPasswordStrengthButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(deleteButton)
                            .addComponent(deleteAllButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lockButton)
                            .addComponent(removeLockButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generatePasswordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPasswordStrengthButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockButtonActionPerformed
        // TODO add your handling code here:
        try {
            // Create a SQL query to count the rows in the table
            String query = "SELECT COUNT(*) FROM set_password"; // Change to your table name
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            // Retrieve the count
            if (resultSet.next()) {
                int rowCount = resultSet.getInt(1);
                if (rowCount == 0) {
                    SetPassword setPasswordScreen = new SetPassword();
                    setPasswordScreen.setVisible(true);

                    this.dispose(); // Close the current window
                } else {
                    Unlock unlockScreen = new Unlock();
                    unlockScreen.setVisible(true);

                    this.dispose(); // Close the current window
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error accessing the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lockButtonActionPerformed

    private void deleteAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllButtonActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete everything?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {

            try {
                PreparedStatement st = connection.prepareStatement("DELETE FROM info");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfully Deleted Everything.", "Success", JOptionPane.INFORMATION_MESSAGE);
                Dashboard dashboardScreen = new Dashboard();
                dashboardScreen.setVisible(true);
                this.dispose();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error deleting everything from the database.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteAllButtonActionPerformed

    private void removeLockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLockButtonActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove lock?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {

            try {
                PreparedStatement st = connection.prepareStatement("DELETE FROM set_password");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfully Removed Lock", "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error removing lock.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_removeLockButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Add addScreen = new Add();
        addScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        int column = jTable1.getSelectedColumn();

        if (row >= 0 && column >= 0) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String platform = model.getValueAt(row, 0).toString();
            String email = model.getValueAt(row, 1).toString();
            String password = model.getValueAt(row, 2).toString();

            // Update data in the database
            try {
                String query = "UPDATE info SET email=?, password=? WHERE platform=?";
                PreparedStatement st = connection.prepareStatement(query);
                st.setString(1, email);
                st.setString(2, password);
                st.setString(3, platform);
                st.executeUpdate();
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_jTable1PropertyChange

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow >= 0) {
            String platform = jTable1.getValueAt(selectedRow, 0).toString();
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the row?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                try {
                    String deleteQuery = "DELETE FROM info WHERE platform = ?";
                    preparedStatement = connection.prepareStatement(deleteQuery);
                    preparedStatement.setString(1, platform);

                    int rowsDeleted = preparedStatement.executeUpdate();
                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        loadDataIntoTable(); // Refresh the table after deletion.
                    } else {
                        JOptionPane.showMessageDialog(this, "No rows deleted. Check if the platform exists.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    // Handle SQL exception gracefully, show a message to the user.
                    JOptionPane.showMessageDialog(this, "Error deleting row.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void generatePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePasswordButtonActionPerformed
        // TODO add your handling code here:
        GeneratePassword generatePasswordScreen = new GeneratePassword();
        generatePasswordScreen.setVisible(true);
    }//GEN-LAST:event_generatePasswordButtonActionPerformed

    private void checkPasswordStrengthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPasswordStrengthButtonActionPerformed
        // TODO add your handling code here:
        CheckPasswordStrength checkPasswordStrengthScreen = new CheckPasswordStrength();
        checkPasswordStrengthScreen.setVisible(true);
    }//GEN-LAST:event_checkPasswordStrengthButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton checkPasswordStrengthButton;
    private javax.swing.JButton deleteAllButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton generatePasswordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton lockButton;
    private javax.swing.JButton removeLockButton;
    // End of variables declaration//GEN-END:variables
}
