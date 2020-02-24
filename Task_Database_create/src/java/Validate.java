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

public class Validate extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//        String select = request.getParameter("call");
//        
//        if(select.equals("View")){
//            
//          
//        }
        PrintWriter out = response.getWriter();
        out.println("helo");
        String select = request.getParameter("call");
        if (select.equals("View")){
            RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
            rd.forward(request, response);
        }else if (select.equals("Update")){
             RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
            rd.forward(request, response);   
        }else if (select.equals("Delete")){
             RequestDispatcher rd = request.getRequestDispatcher("Delete.jsp");
            rd.forward(request, response);
        }else if (select.equals("Insert")){
             RequestDispatcher rd = request.getRequestDispatcher("Insert.jsp");
            rd.forward(request, response);
        }  else if (select.equals("ViewAll")){
             RequestDispatcher rd = request.getRequestDispatcher("ViewAll.jsp");
            rd.forward(request, response);
        }  
    }

   

}
