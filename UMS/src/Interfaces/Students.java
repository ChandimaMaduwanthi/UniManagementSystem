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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lab_2.Course;
import lab_2.Student;
import lab_2.Subject;

/**
 *
 * @author ASUS
 */
public class Students extends javax.swing.JFrame {
    
    private Start st=new Start();

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String Username;
    String Password;
    
    private Student stu;
    
    /**
     * Creates new form Student
     */
    public Students(Student stu) throws ClassNotFoundException, SQLException {
        this.stu=stu;
        initComponents();
       //ShowUser();
       loadStudent();
        
    }

    Students() {
        
    }

    
    
        public void loadStudent() throws ClassNotFoundException, SQLException{
        StuControl stdControl=new StuControl();
        Student tpstudent=stdControl.stdSignIn(stu.GetUsername(), stu.GetPassword());
        
        lblSid.setText(Integer.toString(tpstudent.GetId()));
        lblSname.setText(tpstudent.GetName());
        lblSAge.setText(Integer.toString(tpstudent.GetAge()));
        
        ArrayList<Course> subList=stdControl.stdRegedSubjects(stu.GetUsername(), stu.GetPassword());
        DefaultTableModel dtm=(DefaultTableModel) tblStudentDetails.getModel();
        dtm.setRowCount(0);
        for(Course subject:subList){
            Object[] rowdata={subject.getId(),subject.GetCourse()};
            dtm.addRow(rowdata);
        }
                
    }

   /* public Student() {
        
    }

    
    



    public void Show_details(String Username,String Password) throws ClassNotFoundException, SQLException{
        String Query="select * from Student_details where S_Username='"+Username+"';";
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/University_database", "root","");
            pst=con.prepareStatement(Query);
            rs=pst.executeQuery();
            while(rs.next()){
               lblSid.setText(rs.getString(1));
               lblSname.setText(rs.getString(2));
               lblSAge.setText(rs.getString(3));
            }
           
    }*/
    
    /*public void userList(String username, String password) throws ClassNotFoundException, SQLException{
        ArrayList<Student> usersList=new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/University_database", "root","");
        //String q="SELECT * FROM Student_Details where S_Username='"+username+"' and S_Password='"+password+"';";
        String q="SELECT * FROM Student_Details;";
        Statement st=conn.createStatement();
        ResultSet rs= st.executeQuery(q);
        Student stu;
        while(rs.next()){
            lblSid.setText(rs.getString("S_id"));
               lblSname.setText(rs.getString("S_Name"));
               lblSAge.setText(rs.getString("S_Age"));
           // stu=new Student();
           // usersList.add(stu);
          
        }
        //return usersList;
    }
    
    /*public void ShowUser() throws ClassNotFoundException, SQLException{
        ArrayList<Student> list=userList(Username,Password);
        DefaultTableModel model=(DefaultTableModel) tblStudentDetails.getModel();
        Object[] row=new Object[3];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).GetId();
            row[1]=list.get(i).GetName();
            row[2]=list.get(i).GetAge();
            model.addRow(row);
        }
    }*/
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentDetails = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University Management System");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(800, 730));
        setPreferredSize(new java.awt.Dimension(800, 730));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Student Profile");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 230, 42);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(63, 128, 110, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(63, 187, 142, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student Age:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(63, 248, 124, 28);

        tblStudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course_Id", "Course_Name"
            }
        ));
        jScrollPane1.setViewportView(tblStudentDetails);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 360, 710, 179);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(570, 580, 89, 51);

        lblSid.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblSid);
        lblSid.setBounds(240, 130, 412, 28);

        lblSname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblSname);
        lblSname.setBounds(240, 190, 412, 28);

        lblSAge.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblSAge);
        lblSAge.setBounds(239, 248, 412, 28);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\New folder\\wallpapers\\green-1072828__480.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 50, 760, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JLabel lblSAge = new javax.swing.JLabel();
    public static final javax.swing.JLabel lblSid = new javax.swing.JLabel();
    public static final javax.swing.JLabel lblSname = new javax.swing.JLabel();
    private javax.swing.JTable tblStudentDetails;
    // End of variables declaration//GEN-END:variables
}
