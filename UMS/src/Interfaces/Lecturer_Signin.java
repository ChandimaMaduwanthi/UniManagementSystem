/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lab_2.Lecturer;

/**
 *
 * @author ASUS
 */
public class Lecturer_Signin extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    LecControl lecControl=new LecControl();
    Lecturer lec=new Lecturer();
    public static Lecturer_Signin lecSignIn=new Lecturer_Signin();
    /**
     * Creates new form Signup
     */
    public Lecturer_Signin() {
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
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSignin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University management System");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(680, 570));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("Lecturer Sign in Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 50, 342, 42);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 169, 123, 28);
        getContentPane().add(txtUsername);
        txtUsername.setBounds(220, 170, 260, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 268, 118, 28);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(220, 270, 260, 28);

        btnSignin.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnSignin.setText("Sign in");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignin);
        btnSignin.setBounds(158, 369, 135, 51);

        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(379, 369, 137, 51);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\stock-photo-wood-working-table-pencil-tablet-laptop-computer-notebook-top-view-72ca800d-ef9b-46fb-8600-efdf7051f038.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 20, 630, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        Start st=new Start();
        st.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        // TODO add your handling code here:
        String username=txtUsername.getText();
        String password=txtPassword.getText();
        
        try {
          /* Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/University_database", "root","");
           pst = null;
            String q="select S_Username,S_Password from Student_details where S_userName='"+username+"'; ";
            pst=con.prepareStatement(q);
            rs=pst.executeQuery();
            
            while (rs.next()) {
                    if(password.equals(rs.getString("S_Password"))){
                    Lecturer lp=new Lecturer();
                    lp.setVisible(true);
                    
                    }else{
                JOptionPane.showMessageDialog(null,"Username or Password Incorrect");
            }
                }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Student_Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       try{*/
            JFrame frame=new JFrame();
            String userName=txtUsername.getText();
            password=txtPassword.getText();
            lec=lecControl.lecSignIn(userName, password);
            if(lec!=null){
                Lecturers lecProfile=new Lecturers(lec);
                lecProfile.setVisible(true);
                this.setVisible(false);
                this.dispose();
                
          
            }else{
                JOptionPane.showMessageDialog(frame, "Login failed.Try again.");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lecturer_Signin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSigninActionPerformed

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
            java.util.logging.Logger.getLogger(Lecturer_Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecturer_Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecturer_Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecturer_Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecturer_Signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSignin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
