<%@page import="er.Record"%>
<%@page import="org.hibernate.Session"%>
<%@page import="er.HibernateUtil"%>
 
<%
    try
{
   
  Session s = HibernateUtil.getSessionFactory().openSession();
  RequestDispatcher rd = null; 
  if((String)session.getAttribute("id")!= null)
   {
   Integer id=Integer.parseInt((String)session.getAttribute("id"));
   Record r = (Record)s.get(Record.class,id);
   s.delete(r);
   s.beginTransaction().commit();
  rd = request.getRequestDispatcher("er3");
 rd.forward(request, response);
  
   
   
   }
} 
   finally{out.close();}
%>