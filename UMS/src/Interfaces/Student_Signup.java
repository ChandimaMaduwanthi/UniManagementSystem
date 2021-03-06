/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lab_2.Course;
import lab_2.Student;
import lab_2.Subject;

/**
 *
 * @author ASUS
 */
public class Student_Signup extends javax.swing.JFrame {
    
    private int id;
    private String name;
    private int Age;
    private String Username;
    private String CPassword;
    private ArrayList<Course> sublist=new ArrayList<>();
    private StuControl StdControl=new StuControl();
    public static Student_Signup stdSignUp=new Student_Signup();
    private Student student=new Student();
    /**
     * Creates new form Student_Signup
     */
    public Student_Signup() {
        initComponents();
    }
    
    Connection con;
    PreparedStatement prst;

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtCPassword = new javax.swing.JPasswordField();
        btnSignup = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        checkC3 = new javax.swing.JCheckBox();
        checkC2 = new javax.swing.JCheckBox();
        checkC1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University Management System");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Student Registration Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 20, 409, 42);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name                      :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(65, 156, 204, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age                         :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 210, 204, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username               :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(65, 263, 204, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password                :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(65, 321, 204, 28);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(65, 379, 204, 28);
        getContentPane().add(txtName);
        txtName.setBounds(281, 159, 476, 28);
        getContentPane().add(txtAge);
        txtAge.setBounds(281, 208, 476, 28);
        getContentPane().add(txtUserName);
        txtUserName.setBounds(281, 263, 476, 28);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(281, 321, 476, 28);
        getContentPane().add(txtCPassword);
        txtCPassword.setBounds(281, 379, 476, 28);

        btnSignup.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnSignup.setText("Sign up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignup);
        btnSignup.setBounds(280, 650, 147, 51);

        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(620, 651, 137, 51);

        checkC3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        checkC3.setForeground(new java.awt.Color(255, 255, 255));
        checkC3.setText("SENG1113_Data_Structures_and_Algorithms");
        getContentPane().add(checkC3);
        checkC3.setBounds(174, 576, 499, 37);

        checkC2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        checkC2.setForeground(new java.awt.Color(255, 255, 255));
        checkC2.setText("SENG1112_Fundamantales_of_Engineering");
        getContentPane().add(checkC2);
        checkC2.setBounds(174, 508, 469, 37);

        checkC1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        checkC1.setForeground(new java.awt.Color(255, 255, 255));
        checkC1.setText("SENG1111_Introduction_to_Programming");
        checkC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkC1ActionPerformed(evt);
            }
        });
        getContentPane().add(checkC1);
        checkC1.setBounds(174, 444, 469, 37);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student Id              :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(65, 107, 204, 28);
        getContentPane().add(txtId);
        txtId.setBounds(281, 110, 476, 28);

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\New folder\\wallpapers\\Aqua-01-2.3.001-bigpicture_01_11.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 90, 720, 550);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 650, 140, 51);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        if(txtId.getText().length()==0){
              JOptionPane.showMessageDialog(this,"Please Enter Student Id");
        }
        else if(txtName.getText().length()==0){
              JOptionPane.showMessageDialog(this,"Please Enter Name");
        }
        else if(txtAge.getText().length()==0){
              JOptionPane.showMessageDialog(this,"Please Enter Age");
        }
        else if(txtUserName.getText().length()==0){
              JOptionPane.showMessageDialog(this,"Please Enter Username");
        }
        else if(txtPassword.getText().length()==0){
              JOptionPane.showMessageDialog(this,"Please Enter Password");
        }
        else if(txtPassword.getText().equals(txtCPassword.getText())==false){
            JOptionPane.showMessageDialog(this,"Password Not Matched");
        }
        else{
            try {
            // TODO add your handling code here:
            JFrame frame=new JFrame();
            id=Integer.parseInt(txtId.getText());
            Username=txtUserName.getText();
            name=txtName.getText();
            Age=Integer.parseInt(txtAge.getText());
            CPassword=txtPassword.getText();
            student=StdControl.stdSignIn(Username, CPassword);
            if(student!=null){
                JOptionPane.showMessageDialog(frame, "UserName and Password Already Taken Try another user..");
            
            }else{
                if(checkC1.isSelected()){
                Course subject1=new Course(String.valueOf(Subject.SENG1111_Introduction_to_Programming),1);
                sublist.add(subject1);
            }
            if(checkC2.isSelected()){
                Course subject2=new Course(String.valueOf(Subject.SENG1112_Fundamantales_of_Engineering),2);
                sublist.add(subject2);
            }
            if(checkC3.isSelected()){
                Course subject3=new Course(String.valueOf(Subject.SENG1113_Data_Structures_and_Algorithms),3);
                sublist.add(subject3);
            }
            StdControl.stdSignUp(id, name, Age, Username, CPassword, sublist);
            
            
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Student_Signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Student_Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnSignupActionPerformed
    }
    private void checkC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkC1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtUserName.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtPassword.setText("");
        txtCPassword.setText("");
        checkC1.setSelected(false);
        checkC2.setSelected(false);
        checkC3.setSelected(false);
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
            java.util.logging.Logger.getLogger(Student_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSignup;
    private javax.swing.JCheckBox checkC1;
    private javax.swing.JCheckBox checkC2;
    private javax.swing.JCheckBox checkC3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAge;
    private javax.swing.JPasswordField txtCPassword;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
