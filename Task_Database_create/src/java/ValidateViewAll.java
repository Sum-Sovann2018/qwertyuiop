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
public class ValidateViewAll extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            DBOperation db = new DBOperation();
            PrintWriter out = response.getWriter();
            out.print(db.ViewAll());
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
          
      
       
    }

   

}
