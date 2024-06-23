<%-- 
    Document   : person
    Created on : 23-Jun-2024, 14:03:39
    Author     : icbt
--%>

<%@page import="web.Utils"%>
<%@page import="web.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.print("<table border='1'>");
            out.print("<tr><th>First Name</th><th>Last Name</th><th>NIC</th></tr>");
            for(Person person : Utils.getPersons()){
                out.print("<tr>");
                out.print("<td>" + person.getFirstName() + "</td>");
                out.print("<td>" + person.getLastName()+ "</td>");
                out.print("<td>" + person.getNic()+ "</td>");
                out.print("<tr>");
            }
            out.print("</table>");

        %>
    </body>
</html>
