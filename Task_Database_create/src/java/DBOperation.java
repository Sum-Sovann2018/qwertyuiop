
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoldOne
 */
public class DBOperation {
    Connection con =null;
    
    public Connection getCon() throws ClassNotFoundException, SQLException{
        
        if(con==null){
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
        }
        return con;
    }
     public boolean insertRecord (student s){
        String id = s.getId();
        String name = s.getName();
        
        try{
            getCon();
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
            
            ps.setString(1, id);
            ps.setString(2, name); 
            ps.execute();
            
            return true;
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("Insert record error");
        }
        return false;
    }
     
       public boolean DeleteRecord (student s){
        String id = s.getId();
       
        try{
            getCon();
            Statement st = con.createStatement();
            
            st.executeUpdate("delete from student where id ='"+id+"'");
           
        
        return true;
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("Insert record error");
        }
        return false;
    }
    
        public boolean UpdateRecord (student s){
        String id = s.getId();
        String name = s.getName();
       
        try{
            getCon();
            Statement st = con.createStatement();
            
            st.execute(" update student set name='"+name+"' where id ='"+id+"' ");
           
        
        return true;
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("Insert record error");
        }
        return false;
    }
        
        
         public boolean ViewAll (){
   
        try{
            getCon();
            Statement st = con.createStatement();
            
            
            
            ResultSet rs = st.executeQuery("select * from student");
            while(rs.next()){
                System.out.println(rs.getString("id") + rs.getString("name"));
            }
        
        return true;
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("View all record error");
        }
        return false;
    }
    
}
