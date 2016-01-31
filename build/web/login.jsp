<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib  prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style2 {font-family: "Courier New", Courier, monospace; font-weight: bold; font-size: 24px;}
.style3 {color: #FFFFFF}
-->
</style>
</head>

<body>
    <s:form action="loginauth">
<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" background="images/bge.jpg">
  <!--DWLayoutTable-->
  
  <tr>
    <td width="409" height="31">&nbsp;</td>
    <td width="512">&nbsp;</td>
    <td width="363">&nbsp;</td>
  </tr>
  <tr>
    <td height="403"></td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="102" height="49" bordercolor="#000000" bordercolordark="#FFFFFF">&nbsp;</td>
          <td width="58">&nbsp;</td>
          <td width="200" valign="top"><div align="center" class="style2"><img src="images/logpic.png" width="200" height="149" /></div></td>
          <td width="30">&nbsp;</td>
          <td width="25">&nbsp;</td>
          <td width="60">&nbsp;</td>
          <td width="37">&nbsp;</td>
        </tr>
      <tr>
        <td height="27" bordercolor="#000000" bordercolordark="#FFFFFF">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      
      <tr>
        <td height="41">&nbsp;</td>
          <td colspan="3" valign="top"><label><span class="style3">LOGIN ID :</span><br />
                  <s:textfield name="userid" />
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
            <s:password  name="password" />
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
            <s:submit value="Submit" />
          </label></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="17"></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>

    </table></td>
    <td></td>
  </tr>
  <tr>
    <td height="18"></td>
    <td></td>
    <td></td>
  </tr>
            <tr>
        <font color="red" /> ${requestScope.msg}
        </tr>
</s:form>
</table>
</body>
</html>