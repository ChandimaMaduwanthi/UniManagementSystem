/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import java.awt.Color;

/**
 *
 * @author ASUS
 */
public class Start extends javax.swing.JFrame {
    
    
     
    
     
    /**
     * Creates new form Home
     */
    public Start() {
        initComponents();
        
        //btnSignin.setBackground(Color.yellow);
       
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
        btnSigninL = new javax.swing.JButton();
        btnSignupL = new javax.swing.JButton();
        btnSigninS = new javax.swing.JButton();
        btnSignupS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University Management System");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(178, 196, 201));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 94, 218));
        jLabel1.setText("Welcome to University Management System");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 30, 580, 49);

        btnSigninL.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnSigninL.setText("Sign in as a Lecturer");
        btnSigninL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninLActionPerformed(evt);
            }
        });
        jPanel1.add(btnSigninL);
        btnSigninL.setBounds(140, 220, 359, 51);

        btnSignupL.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnSignupL.setText("Sign up as a Lecturer");
        btnSignupL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupLActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignupL);
        btnSignupL.setBounds(140, 400, 359, 51);

        btnSigninS.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnSigninS.setText("Sign in as a Student");
        btnSigninS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninSActionPerformed(evt);
            }
        });
        jPanel1.add(btnSigninS);
        btnSigninS.setBounds(140, 130, 359, 51);

        btnSignupS.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnSignupS.setText("Sign up as a Student");
        btnSignupS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupSActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignupS);
        btnSignupS.setBounds(140, 310, 359, 51);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\online-communication_1098-15842.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 80, 720, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupSActionPerformed
        // TODO add your handling code here:
        Student_Signup stdSignup=new Student_Signup();
        stdSignup.setVisible(true);
        
    }//GEN-LAST:event_btnSignupSActionPerformed

    private void btnSigninSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninSActionPerformed
        // TODO add your handling code here:
        Student_Signin stdSignin=new Student_Signin();
        stdSignin.setVisible(true);
        
    }//GEN-LAST:event_btnSigninSActionPerformed

    private void btnSignupLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupLActionPerformed
        // TODO add your handling code here:
        Lecturer_Signup lecSignup=new Lecturer_Signup();
        lecSignup.setVisible(true);
        
    }//GEN-LAST:event_btnSignupLActionPerformed

    private void btnSigninLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninLActionPerformed
        // TODO add your handling code here:
        Lecturer_Signin lecSignin=new Lecturer_Signin();
        lecSignin.setVisible(true);
        
    }//GEN-LAST:event_btnSigninLActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSigninL;
    private javax.swing.JButton btnSigninS;
    private javax.swing.JButton btnSignupL;
    private javax.swing.JButton btnSignupS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
