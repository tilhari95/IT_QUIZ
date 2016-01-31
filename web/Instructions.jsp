<%@taglib  prefix="s" uri="/struts-tags" %>
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style1 {font-weight: bold}
-->
</style>
</head>

<body>
    <%@include file="session.jsp" %>
<div align="center">
  <p><img src="images/notpad.png" width="800" height="613" alt="" /></p>
  <p>&nbsp;</p>
</div>
<p align="center">
  
  <label>
   <s:a action="startexam">Start Exam</s:a>
  </label>
<span class="style1">  </span></p>
</body>

</html>