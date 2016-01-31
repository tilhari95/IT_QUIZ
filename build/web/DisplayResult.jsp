<%-- 
    Document   : session
    Created on : Jul 13, 2015, 12:05:52 AM
    Author     : Suyash
--%>
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <h6>Welcome ${sessionScope.username}</h6>
        <h2>QUIZ FINISHED..... YOUR RESULT IS ${sessionScope.result}</h2>
        </body>
</html> 
