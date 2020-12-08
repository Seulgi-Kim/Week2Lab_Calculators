<%-- 
    Document   : agecalculator
    Created on : Dec 8, 2020, 9:32:29 AM
    Author     : 813116
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method ="post" action="age">
            <label>Enter your age:</label><input type="text" name="age" value="${age}">
            <br>
            <input type ="submit" value="Age next birthday">
            <p>${message}</p>
            <p>${message1}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
        
    </body>
</html>
