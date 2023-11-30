package PasswordManager;

import java.sql.*;
import javax.swing.JOptionPane;

public class SplashScreen extends javax.swing.JFrame {

    private Connection connection;
    private ResultSet resultSet = null;

    public SplashScreen() {
        initComponents();
        // Connect to the database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/securepass_db", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database. Please check your connection.", "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1); // Exit the application if database connection fails
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        getStartedButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SecurePass");

        getStartedButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getStartedButton.setForeground(new java.awt.Color(0, 204, 204));
        getStartedButton.setText("Get Started");
        getStartedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getStartedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(getStartedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(getStartedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getStartedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getStartedButtonActionPerformed
        try {
            // Create a SQL query to count the rows in the table
            String query = "SELECT COUNT(*) FROM set_password";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int rowCount = resultSet.getInt(1);
                if (rowCount == 0) {
                    Dashboard dashboardScreen = new Dashboard();
                    dashboardScreen.setVisible(true);

                    this.dispose(); // Close the current window

                } else {
                    Unlock unlockScreen = new Unlock();
                    unlockScreen.setVisible(true);

                    this.dispose(); // Close the current window
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error accessing the database.", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close database resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_getStartedButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SplashScreen().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getStartedButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
