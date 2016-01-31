package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginadmin1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_password_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_password_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_password_name_nobody.release();
    _jspx_tagPool_s_form_action.release();
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
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style2 {\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tfont-size: 36px;\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("}\n");
      out.write(".style3 {color: #FFFFFF}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("administrator");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\" background=\"images/bge.jpg\">\n");
        out.write("  <!--DWLayoutTable-->\n");
        out.write("  \n");
        out.write("  <tr>\n");
        out.write("    <td width=\"420\" height=\"31\">&nbsp;</td>\n");
        out.write("    <td width=\"459\">&nbsp;</td>\n");
        out.write("    <td width=\"388\">&nbsp;</td>\n");
        out.write("  </tr>\n");
        out.write("  <tr>\n");
        out.write("    <td height=\"282\">&nbsp;</td>\n");
        out.write("    <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("      <!--DWLayoutTable-->\n");
        out.write("      <tr>\n");
        out.write("        <td width=\"103\" height=\"24\" bordercolor=\"#FFFFFF\" bordercolordark=\"#FFFFFF\">&nbsp;</td>\n");
        out.write("        <td width=\"58\">&nbsp;</td>\n");
        out.write("        <td width=\"152\" valign=\"top\"><div align=\"center\" class=\"style3\" > <strong>Administrator </strong></div></td>\n");
        out.write("        <td width=\"31\">&nbsp;</td>\n");
        out.write("        <td width=\"26\">&nbsp;</td>\n");
        out.write("        <td width=\"56\">&nbsp;</td>\n");
        out.write("        <td width=\"33\">&nbsp;</td>\n");
        out.write("      </tr>\n");
        out.write("      <tr>\n");
        out.write("        <td height=\"49\">&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("      </tr>\n");
        out.write("      <tr>\n");
        out.write("        <td height=\"41\">&nbsp;</td>\n");
        out.write("        <td colspan=\"3\" valign=\"top\"><label><span class=\"style3\">KEY:</span><br />\n");
        out.write("                ");
        if (_jspx_meth_s_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </label></td>\n");
        out.write("    <td>&nbsp;</td>\n");
        out.write("      <td>&nbsp;</td>\n");
        out.write("      <td>&nbsp;</td>\n");
        out.write("      </tr>\n");
        out.write("      <tr>\n");
        out.write("        <td height=\"37\">&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("      </tr>\n");
        out.write("      <tr>\n");
        out.write("        <td height=\"41\">&nbsp;</td>\n");
        out.write("        <td colspan=\"3\" valign=\"top\"><label><span class=\"style3\">PASSWORD:</span><br />\n");
        out.write("        ");
        if (_jspx_meth_s_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </label></td>\n");
        out.write("    <td>&nbsp;</td>\n");
        out.write("      <td>&nbsp;</td>\n");
        out.write("      <td>&nbsp;</td>\n");
        out.write("      </tr>\n");
        out.write("      <tr>\n");
        out.write("        <td height=\"67\">&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("      </tr>\n");
        out.write("      <tr>\n");
        out.write("        <td height=\"24\">&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td valign=\"top\"><label>\n");
        out.write("          <input type=\"submit\" name=\"Submit\" value=\"Submit\" />\n");
        out.write("        </label></td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("      </tr>\n");
        out.write("      <tr>\n");
        out.write("        <td height=\"19\">&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("        <td>&nbsp;</td>\n");
        out.write("      </tr>\n");
        out.write("      \n");
        out.write("      \n");
        out.write("      \n");
        out.write("      \n");
        out.write("      \n");
        out.write("      \n");
        out.write("      \n");
        out.write("      \n");
        out.write("      \n");
        out.write("      \n");
        out.write("      \n");
        out.write("    </table>    </td>\n");
        out.write("    <td>&nbsp;</td>\n");
        out.write("  </tr>\n");
        out.write("  <tr>\n");
        out.write("    <td height=\"58\">&nbsp;</td>\n");
        out.write("    <td>&nbsp;</td>\n");
        out.write("    <td>&nbsp;</td>\n");
        out.write("  </tr>\n");
        out.write("        <tr>\n");
        out.write("        <font color=\"red\" /> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("        </tr>\n");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_0 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_name_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_0.setPageContext(_jspx_page_context);
    _jspx_th_s_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_0.setName("userid");
    int _jspx_eval_s_password_0 = _jspx_th_s_password_0.doStartTag();
    if (_jspx_th_s_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_name_nobody.reuse(_jspx_th_s_password_0);
      return true;
    }
    _jspx_tagPool_s_password_name_nobody.reuse(_jspx_th_s_password_0);
    return false;
  }

  private boolean _jspx_meth_s_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_1 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_name_nobody.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_1.setPageContext(_jspx_page_context);
    _jspx_th_s_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_password_1.setName("password");
    int _jspx_eval_s_password_1 = _jspx_th_s_password_1.doStartTag();
    if (_jspx_th_s_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_name_nobody.reuse(_jspx_th_s_password_1);
      return true;
    }
    _jspx_tagPool_s_password_name_nobody.reuse(_jspx_th_s_password_1);
    return false;
  }
}
