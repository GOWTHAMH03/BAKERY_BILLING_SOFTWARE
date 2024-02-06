
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gowtham
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        passwor = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, -1, -1));

        user.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 360, 147, -1));

        passwor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passwor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passworActionPerformed(evt);
            }
        });
        getContentPane().add(passwor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 410, 147, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 500, -1, -1));

        close.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        close.setText("close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 500, -1, -1));

        check.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        check.setText("show password");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 450, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login ani.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, 252, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 560, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login background.PNG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passworActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passworActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passworActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
 int close=JOptionPane.showConfirmDialog(null,"Do you want to exit","select",JOptionPane.YES_NO_OPTION);
 if (close==0)
 {
     System.exit(0);
 }
        // TODO add your handling code here:
    }//GEN-LAST:event_closeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      String username=user.getText();
      String password=String.valueOf(passwor.getPassword());
String query="SELECT * FROM `user_details` WHERE `User_name`=? AND `Pass_word`=?";

PreparedStatement ps;
ResultSet rs;
    
try{
    ps=MyConnection1.getConnection().prepareStatement(query);
    
      ps.setString(1,username);
    ps.setString(2,password);
    rs=ps.executeQuery();
    
     if(rs.next())
     {
         home s=new home();
      s.setVisible(true);
      this.setVisible(false);
     }
     else{
     
             JOptionPane.showMessageDialog(null,"username and password do not match");
             }
}
catch(Exception ex)
{
    
            System.out.println(ex);
}
     // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
       if(check.isSelected())
       {
         passwor.setEchoChar((char)0);
       }
       else
          passwor.setEchoChar('*'); 
    }//GEN-LAST:event_checkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
register s=new register();
      s.setVisible(true);
      this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check;
    private javax.swing.JButton close;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwor;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
