<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="s" uri="/struts-tags" %> 
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Untitled Document</title>
        <style type="text/css">
            <!--
            .style3 {
                font-family: Arial, Helvetica, sans-serif;
                font-size: 36px;
                color: #FFFFFF;
            }
            .style4 {color: #FFFFFF}
            -->
        </style>
    </head>

    <body>
        <s:form action="Reg" >
        <table width="100%" border="0" cellpadding="0" cellspacing="0" background="images/bge.jpg">
            <!--DWLayoutTable-->
            <tr>
                <td width="497" height="19">&nbsp;</td>
                <td width="332">&nbsp;</td>
                <td width="471">&nbsp;</td>
            </tr>
            <tr>
                <td height="559">&nbsp;</td>
                <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                        <!--DWLayoutTable-->
                        <tr>
                            <td height="41" colspan="3" valign="top"><div align="center"><span class="style3">REGISTER NOW </span></div></td>
                        </tr>
                        <tr>
                            <td width="266" height="19">&nbsp;</td>
                            <td width="56">&nbsp;</td>
                            <td width="6">&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="41" colspan="3" valign="top"><label><span class="style4">USERNAME:</span><br />
                                        <input type="text" name="username" />
                                  
                                </label></td>
                        </tr>
                        <tr>
                            <td height="19">&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="41" colspan="3" valign="top"><label><span class="style4">FULL NAME:</span><br />
                                    <s:textfield name="fullname" />
                                </label></td>
                        </tr>
                        <tr>
                            <td height="18"></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td height="42" colspan="3" valign="top"><label><span class="style4">EMAIL ID: </span><br />
                                    <s:textfield name="email" />
                                </label></td>
                        </tr>

                        <tr>
                            <td height="19">&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="41" colspan="3" valign="top"><label><span class="style4">INSTITUTE NAME:</span><br />
                                    <s:textfield name="institutename" />
                                </label></td>
                        </tr>

                        <tr>
                            <td height="19">&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="41" colspan="3" valign="top"><label><span class="style4">PASSWORD:</span><br />
                                    <s:password name="password" />
                                </label></td>
                        </tr>

                        <tr>
                            <td height="19">&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="60" colspan="3" valign="top"><label><span class="style4">RE-ENTER <br />
                                        PASSWORD:</span><br />
                                        <s:password name="rpassword" />
                                </label></td>
                        </tr>

                        <tr>
                            <td height="19">&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="24">&nbsp;</td>
                            <td valign="top"><label>
                                    <s:submit value="submit" />
                                </label></td>
                            <td>&nbsp;</td>
                        </tr>







                    </table>    </td>
                <td>&nbsp;</td>
            </tr>
        </s:form>
        </table>
    </body>
</html>