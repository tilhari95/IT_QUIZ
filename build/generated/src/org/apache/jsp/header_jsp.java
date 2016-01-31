package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style11 {\n");
      out.write("\tfont-size: 12mm;\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\n");
      out.write("\tcolor: #000033;\n");
      out.write("}\n");
      out.write(".style13 {\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCFF\">\n");
      out.write("<!--DWLayoutTable-->\n");
      out.write("<tr>\n");
      out.write("<td width=\"255\" rowspan=\"5\" valign=\"top\"><img src=\"images/online exam 5.png\" width=\"255\" height=\"188\" /></td>\n");
      out.write("<td width=\"46\" height=\"21\">&nbsp;</td>\n");
      out.write("<td width=\"166\">&nbsp;</td>\n");
      out.write("<td width=\"331\">&nbsp;</td>\n");
      out.write("<td width=\"160\">&nbsp;</td>\n");
      out.write("<td width=\"49\">&nbsp;</td>\n");
      out.write("<td width=\"294\" rowspan=\"5\" valign=\"top\"><img src=\"images/students.jpg\" width=\"289\" height=\"186\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("  <td height=\"54\">&nbsp;</td>\n");
      out.write("  <td colspan=\"3\" valign=\"top\" bgcolor=\"#FFFFCC\"><div align=\"center\" class=\"style11\">Online IT Quiz </div></td>\n");
      out.write("<td>&nbsp;</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("  <td height=\"28\">&nbsp;</td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("<tr>\n");
      out.write("  <td height=\"35\">&nbsp;</td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("  <td valign=\"top\"><div align=\"center\"><span class=\"style13\">how much do you know...! </span></div></td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("  <td height=\"52\">&nbsp;</td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("  <td>&nbsp;</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("  <td height=\"2\"></td>\n");
      out.write("  <td></td>\n");
      out.write("  <td></td>\n");
      out.write("  <td></td>\n");
      out.write("  <td></td>\n");
      out.write("  <td></td>\n");
      out.write("  <td></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
