<%-- 
    Document   : index
    Created on : 23-Jun-2024, 13:34:50
    Author     : icbt
--%>

<%@page import="web.Utils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String username = request.getParameter("username"); 
            String password = request.getParameter("password"); 
        %>
        
        
        <h1><% 
            if(Utils.authenticate(username, password)) {
                 String sessionID = "123";
                 session.setAttribute(sessionID, username);
                 Cookie cookie = new Cookie("sesId", sessionID);
                 response.addCookie(cookie);
            } else {
                
                for (Cookie cookie : request.getCookies()) {
                    if (cookie.getName().equals("sesId")) {
                       username = session.getAttribute(cookie.getValue()).toString();
                       break;
                    }
                }
                
                if (username == null) {
                    response.sendRedirect("login.jsp");
                    
                } 
            }
            out.print("Hello " + username);
            %></h1>
    </body>
</html>
