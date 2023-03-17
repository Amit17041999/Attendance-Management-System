/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

/**
 *
 * @author fekede alemayehu
 */
public class Login_page extends javax.swing.JFrame {

    /**
     * Creates new form Login_page
     */
    public Login_page() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        role = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        warning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 130));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-illustrationedited (2).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 600, 400));

        jLabel2.setFont(new java.awt.Font("Italianate", 1, 36)); // NOI18N
        jLabel2.setText("Welcome to Jira ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Italianate", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Jira attendancy ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        jLabel4.setFont(new java.awt.Font("Italianate", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Welcome to ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Italianate", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Jira attendancy ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        jLabel10.setFont(new java.awt.Font("Toledo", 1, 24)); // NOI18N
        jLabel10.setText("Jira Attendancy");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 600, 460));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(153, 153, 255));
        jLabel5.setFont(new java.awt.Font("Italianate", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Role:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 190, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 190, -1));

        role.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        role.setForeground(new java.awt.Color(0, 102, 255));
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "admin", "teacher", "student" }));
        jPanel2.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 190, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 100, 30));

        warning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        warning.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 260, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 400, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  try{ 
      
      String id_no=username.getText();
      String password= this.password.getText();
      String role_type=(String)role.getSelectedItem();
      Connection con=ConnectionProvider.getCon();
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from login_credentials where id_number='"+id_no+"'  and password='"+password+"' and role_type='"+role_type+"'");
      if(rs.next()){
          setVisible(false);
          String id_number=username.getText();
          String name=rs.getString("name");
          String rol=(String)role.getSelectedItem();
          if(rol=="student"){
               new stud_page(id_number,name).setVisible(true);
          }else if(rol=="teacher"){
                
                new teacher_page(id_number,name).setVisible(true);
          }else if(rol=="admin"){
                new admin_page().setVisible(true);
          }
     }else
          warning.setText("Invalid Login Credentials");

  }catch(Exception e){
      System.out.println(e);

}            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JTextField username;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
