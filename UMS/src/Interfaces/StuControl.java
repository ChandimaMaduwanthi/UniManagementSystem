/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lab_2.Course;
import lab_2.Student;

/**
 *
 * @author ASUS
 */
public class StuControl {
    public void stdSignUp(int id,String stdName, int stdAge, String userName, String passowrd, ArrayList<Course> subjectList) throws ClassNotFoundException, SQLException{
        JFrame frame=new JFrame();
        Connection connection=DataBaseConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert Into Student_Details Values(?,?,?,?,?);");

       
                        stm.setObject(1, id);
                        stm.setObject(2, stdName);
                        stm.setObject(3, stdAge);
                        stm.setObject(4, userName);
                        stm.setObject(5, passowrd);
                        
        stm.executeUpdate();
   
        for(Course subject:subjectList){
            PreparedStatement st=connection.prepareStatement("Insert Into stu_courses Values(?,?)");
            st.setObject(1, subject.getId());
            st.setObject(2, id);
            
            st.executeUpdate();
        }
        JOptionPane.showMessageDialog(frame, "Student Details Successfully saved");
        
                        
    }
    
    public Student stdSignIn(String userName,String password) throws ClassNotFoundException, SQLException{
       
        Student student=new Student();
        Connection connection=DataBaseConnection.getInstance().getConnection();
        Statement  stmt=connection.createStatement();
        ResultSet rst=stmt.executeQuery( "select * from Student_details where S_username='"+userName+"'and S_password='"+password+"';");
        
        while(rst.next()){
            student=new Student(rst.getString("S_name"), rst.getInt("S_age"), rst.getString("S_userName"), rst.getString("S_password"),rst.getInt("S_id"));
            return student;
            /*Student stu=new Student();
            stu.SetId(rst.getInt("S_id"));
            stu.SetName(rst.getString("S_name"));
            stu.SetAge(rst.getInt("S_age"));
            stu.SetUsername(rst.getString("S_Username"));
            stu.SetPassword(rst.getString("S_Password"));*/
            
        }
        return null;
    }
    
    public ArrayList<Course> stdRegedSubjects(String userName,String password) throws SQLException, ClassNotFoundException{
        Connection connection=DataBaseConnection.getInstance().getConnection();
        Statement  stmt=connection.createStatement();
        ArrayList<Course> subList=new ArrayList<>();
        ResultSet rst=stmt.executeQuery("SELECT * from courses where id in (SELECT C_Id from stu_courses where S_Id=(Select S_id from student_details where S_userName='"+userName+"'and S_password='"+password+"'));");
        while(rst.next()){
            Course subject=new Course();
           // subject.setId(rst.getInt("id"));
            subject.SetCourse(rst.getString("Course_Name"));
            subList.add(subject);
        }
        return subList;
    }
}
