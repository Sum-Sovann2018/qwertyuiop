/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GoldOne
 */
public class ValidateView extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("user");
       
        
        student s = new student();
        s.setId(id);
        s.setName(name);
        
        DBOperation db = new DBOperation();
        if (db.UpdateRecord (s)){
            PrintWriter out = response.getWriter();
            out.print("ID: "+id+"Name: "+name);
            request.setAttribute("student",s);
        }else{
            System.out.print("Fail");
        }
       
       
    }

    

}
