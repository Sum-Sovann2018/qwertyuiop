/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GoldOne
 */
public class ValidateDelete extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("ID");
       
       
        student s = new student();
        s.setId(id);
       
        
        DBOperation db = new DBOperation();
        if (db.DeleteRecord(s)){
            PrintWriter out = response.getWriter();
            out.print("data delete success...");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
           
        }else{
            System.out.print("Fail");
        }
       
    }

   

}
