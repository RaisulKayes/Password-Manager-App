package PasswordManager;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class SetPassword extends javax.swing.JFrame {

    private Connection connection;

    public SetPassword() {
        initComponents();

        // Connect to the database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/securepass_db", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database. Please check your connection.", "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1); // Exit the application if database connection fails
        }
    }

    {
        Dashboard dashboardScreen = new Dashboard();

        // Add a WindowListener to listen for window close events
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dashboardScreen.setVisible(true);
                dispose();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        setPasswordButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        showPassword = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        recoveryWordField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Set Lock");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        setPasswordButton.setBackground(new java.awt.Color(0, 204, 204));
        setPasswordButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        setPasswordButton.setForeground(new java.awt.Color(255, 255, 255));
        setPasswordButton.setText("Set Lock");
        setPasswordButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        setPasswordButton.setBorderPainted(false);
        setPasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPasswordButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Don't have an account?");

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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(183, 183, 183), 1, true));

        jLabel3.setForeground(new java.awt.Color(183, 183, 183));
        jLabel3.setText("PASSWORD");

        passwordField.setBorder(null);
        passwordField.setPreferredSize(new java.awt.Dimension(64, 22));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(175, 175, 175))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(183, 183, 183), 1, true));

        jLabel6.setForeground(new java.awt.Color(183, 183, 183));
        jLabel6.setText("RECOVERY WORD");

        recoveryWordField.setBorder(null);
        recoveryWordField.setPreferredSize(new java.awt.Dimension(64, 22));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recoveryWordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recoveryWordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setPasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showPassword)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPasswordButtonActionPerformed
        String password = new String(passwordField.getPassword());
        String recoveryWord = recoveryWordField.getText();
        if (!password.isEmpty() && !recoveryWord.isEmpty()) {

            try {
                // Create a SQL insert statement
                String insertQuery = "INSERT INTO set_password (password, recoveryWord) VALUES (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

                // Set the values for the insert statement
                preparedStatement.setString(1, password);
                preparedStatement.setString(2, recoveryWord);

                // Execute the insert statement
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Lock setup is successful!");
                    Unlock unlockScreen = new Unlock();
                    unlockScreen.setVisible(true);

                    this.dispose(); // Close the current window                   
                } else {
                    JOptionPane.showMessageDialog(this, "Lock setup is failed. Please try again.");
                }

                connection.close(); // Close the database connection

                this.dispose(); // Close the current window

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "An error occurred while registering. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter both 'Password' and 'Recovery Word'.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_setPasswordButtonActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            passwordField.setEchoChar((char) 0); // Show the password
        } else {
            passwordField.setEchoChar('\u2022'); // Hide the password
        }
    }//GEN-LAST:event_showPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(SetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SetPassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField recoveryWordField;
    private javax.swing.JButton setPasswordButton;
    private javax.swing.JCheckBox showPassword;
    // End of variables declaration//GEN-END:variables
}
