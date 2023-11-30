package PasswordManager;

import java.sql.*;
import javax.swing.JOptionPane;

public class Unlock extends javax.swing.JFrame {

    private Connection connection;

    public Unlock() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        unlockButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(183, 183, 183), 1, true));

        jLabel2.setForeground(new java.awt.Color(183, 183, 183));
        jLabel2.setText("PASSWORD");

        passwordField.setForeground(new java.awt.Color(67, 67, 67));
        passwordField.setBorder(null);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        unlockButton.setBackground(new java.awt.Color(0, 204, 204));
        unlockButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        unlockButton.setForeground(new java.awt.Color(255, 255, 255));
        unlockButton.setText("Unlock");
        unlockButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        unlockButton.setBorderPainted(false);
        unlockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        unlockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unlockButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Don't have an account?");

        forgotPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(0, 204, 204));
        forgotPassword.setText("Forgot Password?");
        forgotPassword.setBorder(null);
        forgotPassword.setBorderPainted(false);
        forgotPassword.setContentAreaFilled(false);
        forgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordActionPerformed(evt);
            }
        });

        showPassword.setBackground(new java.awt.Color(255, 255, 255));
        showPassword.setForeground(new java.awt.Color(67, 67, 67));
        showPassword.setText("Show Password");
        showPassword.setContentAreaFilled(false);
        showPassword.setMargin(new java.awt.Insets(0, 0, 0, 0));
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("WELCOME");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(67, 67, 67));
        jLabel6.setText("Please unlock to continue");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(unlockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(showPassword)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(forgotPassword))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)))
                        .addGap(36, 36, 36)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showPassword)
                    .addComponent(forgotPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unlockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unlockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unlockButtonActionPerformed
        String enteredPassword = new String(passwordField.getPassword());
        if (!enteredPassword.isEmpty()) {
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT password FROM set_password");

                boolean isPasswordCorrect = false;

                while (resultSet.next()) {
                    String storedPassword = resultSet.getString("password");
                    if (storedPassword.equals(enteredPassword)) {
                        isPasswordCorrect = true;
                        Dashboard dashboardScreen = new Dashboard();
                        dashboardScreen.setVisible(true);

                        connection.close(); // Close the connection after use
                        this.dispose(); // Close the current window
                        break; // Exit the loop after finding the correct password
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect password!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error accessing the database.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter your password.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Clear the password field after unlock attempt
        passwordField.setText("");


    }//GEN-LAST:event_unlockButtonActionPerformed

    private void forgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordActionPerformed
        // TODO add your handling code here:
        ForgotPassword forgotPasswordForm = new ForgotPassword();
        forgotPasswordForm.setVisible(true);

        // Close the current window
        this.dispose();
    }//GEN-LAST:event_forgotPasswordActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            passwordField.setEchoChar((char) 0); // Show the password
        } else {
            passwordField.setEchoChar('\u2022'); // Hide the password
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Unlock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Unlock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Unlock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unlock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Unlock().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgotPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JButton unlockButton;
    // End of variables declaration//GEN-END:variables
}
