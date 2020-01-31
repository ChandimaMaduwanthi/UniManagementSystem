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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lab_2.Course;
import lab_2.Lecturer;

/**
 *
 * @author ASUS
 */
public class LecControl {
    public void lecSignUp(int id,String lecName, int lecAge, String userName, String passowrd, ArrayList<Course> subjectList) throws ClassNotFoundException, SQLException{
        JFrame frame=new JFrame();
        Connection connection=DataBaseConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert Into lecturer_details Values(?,?,?,?,?);");

       
                        stm.setObject(1, id);
                        stm.setObject(2, lecName);
                        stm.setObject(3, lecAge);
                        stm.setObject(4, userName);
                        stm.setObject(5, passowrd);
                        
        stm.executeUpdate();
   
        for(Course subject:subjectList){
            PreparedStatement st=connection.prepareStatement("Insert Into lec_courses Values(?,?)");
            st.setObject(1, subject.getId());
            st.setObject(2, id);
            
            st.executeUpdate();
        }
        JOptionPane.showMessageDialog(null, "Lecturer Details Successfully saved");
        
                        
    }
    
    public Lecturer lecSignIn(String userName,String password) throws ClassNotFoundException, SQLException{
       
        Lecturer lecturer=new Lecturer();
        Connection connection=DataBaseConnection.getInstance().getConnection();
        Statement  stmt=connection.createStatement();
        ResultSet rst=stmt.executeQuery( "select * from lecturer_details where L_Username='"+userName+"'and L_Password='"+password+"';");
        
        if(rst.next()){
            lecturer=new Lecturer(rst.getInt("L_id"), rst.getString("L_Name"), rst.getInt("L_Age"), rst.getString("L_Username"), rst.getString("L_Password"));
            return lecturer;
        }else{
            return null;
        }
    }
    public ArrayList<Course> lecRegedSubjects(String userName,String password) throws SQLException, ClassNotFoundException{
        Connection connection=DataBaseConnection.getInstance().getConnection();
        Statement  stmt=connection.createStatement();
        ArrayList<Course> subList=new ArrayList<>();
        ResultSet rst=stmt.executeQuery("SELECT * from courses where id in (SELECT C_Id from lec_courses where L_Id=(Select L_id from lecturer_details where L_userName='"+userName+"'and L_password='"+password+"'));");
        while(rst.next()){
            Course subject=new Course();
            subject.setId(rst.getInt("id"));
            subject.SetCourse(rst.getString("Course_Name"));
            subList.add(subject);
        }
        return subList;
    }
}
