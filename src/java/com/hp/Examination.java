package com.hp;

import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class Examination extends ActionSupport implements ServletRequestAware, SessionAware{
   
   static int qid=1; 
   static int mark=0;//if not static again again 0 in marks
   private Questions ques;
   private Questions quest;
   private String navigate;
    HttpServletRequest request;
    SessionMap<String,Object> sm;
       List<Results> l;
       List<Integer> questionid=new ArrayList<Integer>();
       List<String> answer=new ArrayList<String>();

    public List<Integer> getQuestionid() {
        return questionid;
    }

    public void setQuestionid(List<Integer> questionid) {
        this.questionid = questionid;
    }

    public List<String> getAnswer() {
        return answer;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }
       

    public List<Results> getL() {
        return l;
    }

    public void setL(List<Results> l) {
        this.l = l;
    }
   

    public String getNavigate() {
        return navigate;
    }

    public void setNavigate(String navigate) {
        this.navigate = navigate;
    }

    public static int getQid() {
        return qid;
    }

    public static void setQid(int qid) {
        Examination.qid = qid;
    }

    public Questions getQues() {
        return ques;
    }

    public void setQues(Questions ques) {
        this.ques = ques;
    }

    public Questions getQuest() {
        return quest;
    }

    public void setQuest(Questions quest) {
        this.quest = quest;
    }
    
    public String firstQuestion(){
         Session s=HibernateUtil.getSessionFactory().openSession();
       ques=(Questions)s.get(Questions.class,1);
       
       return SUCCESS;
     
     
    }
  //LOGICAL ERROR FOR PREV BUTTON ......  RESPONSE NOT SAFED ..... RESPONSE SHOULD CHANE ON CHANGINNG OPTION
   /* public String getQuestion(){
    Session s=HibernateUtil.getSessionFactory().openSession();
    
    if(request.getParameter("navigate").equals("Next"))
    {
        if(sm.get("questionid")!=null || sm.get("answer")!=null){
           questionid=(List<Integer>) sm.get("questionid");
           answer=(List<String>) sm.get("answer");
        }
      if(request.getParameter("ans")!=null){
         if(questionid.contains(qid))
        {int j=0;
            for(Integer i:questionid){
               
                if(i==qid){
                    if(!(answer.get(j).equals(request.getParameter("ans"))))
                     answer.add(request.getParameter("ans"));
                }
               j++;
            }
        }
         else{
        questionid.add(qid);
        answer.add(request.getParameter("ans"));
             
         }
      }
      
     sm.put("questionid",questionid);
      sm.put("answer", answer); 
       quest= (Questions)s.get(Questions.class,qid);
      System.out.println(request.getParameter("ans")+" "+quest.getAnswer());
      sm.put("prev", request.getParameter("ans"));
       //if(request.getParameter("ans").equals(quest.getAnswer())
       //mark=mark+3;
       //else
       //mark=mark-1;
      
      qid++;
      if(qid==11)
         qid=1;
      
      
        ques= (Questions)s.get(Questions.class,qid);
         System.out.println("MARKS   "+mark);
        
    }
    if(request.getParameter("navigate").equals("Prev"))
    { if(sm.get("questionid")!=null || sm.get("answer")!=null){
           questionid=(List<Integer>) sm.get("questionid");
           answer=(List<String>) sm.get("answer");
        }
       
         if(request.getParameter("ans")!=null){
         if(questionid.contains(qid))
        {int j=0;
            for(Integer i:questionid){
               
                if(i==qid){
                    if(!(answer.get(j).equals(request.getParameter("ans"))))
                     answer.add(request.getParameter("ans"));
                }
               j++;
            }
        }
         else{
        questionid.add(qid);
        answer.add(request.getParameter("ans"));
             
         }
      }
      sm.put("questionid",questionid);
      sm.put("answer", answer);  
     qid--;
     if(qid==0)
         qid=10;
     ques= (Questions)s.get(Questions.class,qid);
       
        if(questionid.contains(qid))
        {int j=0;
            for(Integer i:questionid){
               
                if(i==qid){
                  sm.put("prevans",answer.get(j) );
                }
               j++;
            }
        }
        
    }
    if(request.getParameter("navigate").equals("Submit"))
    { if(sm.get("questionid")!=null || sm.get("answer")!=null){
           questionid=(List<Integer>) sm.get("questionid");
           answer=(List<String>) sm.get("answer");
        }
       int marks=0;
       int j=0;
            for(Integer i:questionid){
              Questions q= (Questions)s.get(Questions.class,qid);
              if(q!=null){
                  if(q.getAnswer().equals(answer.get(j))){
                      marks++;
                  }else{
                      marks--;
                  }
              }
    
               j++;
            }
            sm.put("result", marks);
            qid=1;
            return "testComplete";
    }  
    
return SUCCESS;
    }*/
    public String nextQuestion(){
     Session s=HibernateUtil.getSessionFactory().openSession();
    Long lastId = ((BigInteger) s.createSQLQuery("SELECT LAST_INSERT_ID()").uniqueResult()).longValue();
        System.out.println("laaaaaaast "+lastId);
    if(request.getParameter("navigate").equals("Next"))
    {
        quest=(Questions)s.get(Questions.class,qid);
        if(request.getParameter("ans")!=null)
        {
     if(request.getParameter("ans").equals(quest.getAnswer()))
         mark+=3;
     else
         mark-=1;
        }
     qid++;
     if(qid==(11))
         qid=1;
     ques= (Questions)s.get(Questions.class,qid);
    }   
    return SUCCESS;
    }
    public String result()
    {   qid=1;
        sm.put("result", mark);
        mark=0;
        return SUCCESS;
        
    }
   
     
   @Override
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    @Override
    public void setSession(Map<String, Object> map) {
    sm=(SessionMap<String, Object>) map;
    }

   
    
    
}
