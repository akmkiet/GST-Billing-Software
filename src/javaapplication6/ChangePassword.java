/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ajeet
 */
public class ChangePassword extends javax.swing.JFrame {
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aadha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        passa = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        repassa = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Password");
        setBounds(new java.awt.Rectangle(450, 70, 0, 0));

        jPanel1.setBackground(new java.awt.Color(93, 223, 225));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Waree", 1, 24), new java.awt.Color(29, 33, 37))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(14, 19, 43));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel1.setText("Aadhar No.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 40));

        aadha.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        jPanel1.add(aadha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 140, 40));

        jLabel2.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 40));

        jButton1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 130, 50));

        jButton2.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jButton2.setText("Change");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 50));

        passa.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jPanel1.add(passa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/log.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 40));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 13, 10));
        jLabel4.setText("Register");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 110, 40));

        jLabel5.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel5.setText("Re Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 40));

        repassa.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jPanel1.add(repassa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        aadha.setText("");
        passa.setText("");
        repassa.setText("");
        Login lg = new Login();
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String str="";
        while( str.equalsIgnoreCase(aadha.getText()))
        {
            JOptionPane.showMessageDialog(null,"Enter your Aadhar Number");
            return;
        }
        while( str.equalsIgnoreCase(passa.getText()))
        {
            JOptionPane.showMessageDialog(null,"Enter New Password");
            return;
        }
        while( str.equalsIgnoreCase(repassa.getText()))
        {
            JOptionPane.showMessageDialog(null,"Enter retype Password");
            return;
        }
        if((!str.equalsIgnoreCase(aadha.getText()))&&(!str.equalsIgnoreCase(passa.getText()))&&(!str.equalsIgnoreCase(repassa.getText()))&&passa.getText().equalsIgnoreCase(repassa.getText()))
        {
       
            String aadha1 = null;
            try
            {
                String sql = "SELECT `R_Aadhar` FROM `Register` WHERE `R_Id`>0";
                con = (Connection) DriverManager.getConnection("jdbc:sqlite:C:/sqllite/ajeet.db");
                pst = (PreparedStatement) con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    aadha1  = rs.getString(1);  
                }
                if(aadha1.equalsIgnoreCase(aadha.getText()))
                {
                   try{ 
                   String sql1 = "UPDATE `Register` SET `R_Password`=?,`R_Repassword`=? WHERE `R_Aadhar`=?";
                   con = (Connection) DriverManager.getConnection("jdbc:sqlite:C:/sqllite/ajeet.db");
                   pst = (PreparedStatement) con.prepareStatement(sql1);
                   pst.setString(3, aadha.getText());
                   pst.setString(1, passa.getText());
                   pst.setString(2, repassa.getText());
                   pst.executeUpdate();  
                   JOptionPane.showMessageDialog(null,"Successfully Changed Password");
                   }
                   catch(SQLException e)
                   {
                       JOptionPane.showMessageDialog(null,"Updation Problem");
                   }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Enter correct Aadhar Number!");
                }

            }
            catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Fault in Database!");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Register reg = new Register();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passa;
    private javax.swing.JPasswordField repassa;
    // End of variables declaration//GEN-END:variables
}
