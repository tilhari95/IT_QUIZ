<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib  prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style2 {
	font-family: "Times New Roman", Times, serif;
	font-weight: bold;
	font-size: 36px;
	color: #FFFFFF;
}
.style3 {color: #FFFFFF}
-->
</style>
</head>

<body>
    <s:form action="administrator">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" background="images/bge.jpg">
  <!--DWLayoutTable-->
  
  <tr>
    <td width="420" height="31">&nbsp;</td>
    <td width="459">&nbsp;</td>
    <td width="388">&nbsp;</td>
  </tr>
  <tr>
    <td height="282">&nbsp;</td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="103" height="24" bordercolor="#FFFFFF" bordercolordark="#FFFFFF">&nbsp;</td>
        <td width="58">&nbsp;</td>
        <td width="152" valign="top"><div align="center" class="style3" > <strong>Administrator </strong></div></td>
        <td width="31">&nbsp;</td>
        <td width="26">&nbsp;</td>
        <td width="56">&nbsp;</td>
        <td width="33">&nbsp;</td>
      </tr>
      <tr>
        <td height="49">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="41">&nbsp;</td>
        <td colspan="3" valign="top"><label><span class="style3">KEY:</span><br />
                <s:password name="userid" />
        </label></td>
    <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="37">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="41">&nbsp;</td>
        <td colspan="3" valign="top"><label><span class="style3">PASSWORD:</span><br />
        <s:password name="password" />
        </label></td>
    <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="67">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="24">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td valign="top"><label>
          <input type="submit" name="Submit" value="Submit" />
        </label></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="19">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      
      
      
      
      
      
      
      
      
      
      
    </table>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="58">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
        <tr>
        <font color="red" /> ${requestScope.msg}
        </tr>
</s:form>
</table>
</body>
</html>