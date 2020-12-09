<%-- 
    Document   : arithmeticcalculator
    Created on : Dec 8, 2020, 10:19:11 AM
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
        <h1>Arithmetic Calculator</h1>
        <form method ="post" action="arithmetic">
            <label>First:</label><input type="text" name="first" value="${first}"><br>
            <label>Second:</label><input type="text" name="second" value="${second}"><br>
                <input type="submit"  name="plus" value="+">
                <input type="submit"  name="minus" value="-">
                <input type="submit"  name="multiply" value="*">
                <input type="submit"  name="modulo" value="%">
            <br>
            
            <p>Result:  ${plus} ${minus} ${multiply} ${modulo} ${wrong}</p>
            
            <a href="./age">Age Calculator</a>
        </form>
    </body>
</html>
