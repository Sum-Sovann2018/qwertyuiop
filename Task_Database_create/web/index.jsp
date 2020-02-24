<%-- 
    Document   : index
    Created on : Feb 20, 2020, 9:17:55 AM
    Author     : GoldOne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form action="Validate" method="post">
              
              <pre>
        <b> Rule:</b> <select name="call">
                      <option>Select</option>
                      <option value="Insert">Insert</option>                   
                      <option value="Delete">Delete</option>
                      <option value="Update">Update</option>
                      <option value="View">View</option>
                      <option value="ViewAll">View All</option>
            </select></br>
            
               <input type="submit" value="Click me...">
              </pre>
        </form>
       
       
    
    </body>
</html>
