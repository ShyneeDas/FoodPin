<%-- 
    Document   : Dashboardcompany
    Created on : 16 Nov, 2017, 11:59:44 AM
    Author     : shynee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
           <%="Welcome to Dashboard"%>
        <%
   session.setAttribute("email",null);
  // session.invalidate();
   response.sendRedirect("Home.html");
   
            %>
         <a href="LogoutTask.jsp">Logout</a>
    </body>
</html>
