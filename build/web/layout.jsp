<%@taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="100%" height="64" valign="top"><t:insertAttribute name="header" /><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td height="32" valign="top"><t:insertAttribute name="menu" /><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td height="232" valign="top"><t:insertAttribute name="body" /><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td height="46" valign="top"><t:insertAttribute name="footer" /><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
</table>
</body>
</html>
