<%-- 
    Document   : rate
    Created on : Jul 19, 2015, 11:10:32 PM
    Author     : Suyash
--%>
<%@taglib prefix="s" uri="/struts-tags" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="session.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="rr" >
        <h4>Rate out of ten...</h4>
        <s:textfield label="Marks" name="rate" />
        </br>
        <s:textfield label="Name" name="username" />
        <s:submit value="Submit" />
        </s:form>
    </body>
</html>
