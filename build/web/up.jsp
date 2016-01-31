<%@page import="er.Record"%>
<%@page import="org.hibernate.Session"%>
<%@page import="er.HibernateUtil"%>
 
<%
     Session s = HibernateUtil.getSessionFactory().openSession();
RequestDispatcher rd = null;
String up = request.getParameter("button");
String dk ="Finally update";

    if ( dk.equals(up))
{Integer id=Integer.parseInt((String)session.getAttribute("id"));

  Record r = (Record)s.get(Record.class,id);

r.setName(request.getParameter("name"));
r.setDept(request.getParameter("dept"));
r.setPost(request.getParameter("pos"));
s.update(r);
 s.beginTransaction().commit();out.print("updated");
// response.sendRedirect("er3");
 
 rd = request.getRequestDispatcher("er3");
 rd.forward(request, response);
 
 
}  
    try
{
      

    Integer id=Integer.parseInt((String)session.getAttribute("id"));
 
Record r = (Record)s.get(Record.class,id);
out.print("<form action='up.jsp'><table>");
out.print("<tr><td> ID:</td>  <td><input type='textbox' name='id'  readonly='true' value="+r.getId()+"></td></tr><br>");
out.print("<tr><td>NAME:</td><td><input type='textbox' name='name' value="+r.getName()+"></td></tr><br>");
out.print("<tr><td> DEPT.</td>:<td><input type='textbox' name='dept' value="+r.getDept()+"></td></tr><br>");
out.print("<tr><td>POST:</td><td><input type=textbox name=pos value="+r.getPost()+"></td></tr><br>");
out.print("<tr><input type='submit' name='button'  value='Finally update'  /> </tr></table></form>");




}
finally
{
   s.close(); 
    out.close();}






%>