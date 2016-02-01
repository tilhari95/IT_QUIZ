
package com.hp;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

public class AddAction extends ActionSupport implements ServletRequestAware{
    
    
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;
    
HttpServletRequest request;


    @Override
    public void validate() {
        if(question.equals("")){
            
            addFieldError("question", "Enter question");
        }
        if(opt1.equals("")){
          
            addFieldError("opt1", "Enter option");
        }
        if(opt2.equals("")){
          
            addFieldError("opt2", "Enter option");
        }
         if(opt3.equals("")){
          
            addFieldError("opt3", "Enter option");
        }
            if(opt4.equals("")){

               addFieldError("opt4", "Enter option");
           }
            if(answer.equals("")){
          
            addFieldError("answer", "Enter answer");
        }
    }
    

    @Override
    public String execute() throws Exception {
        Session s= HibernateUtil.getSessionFactory().openSession();
        Questions l= new Questions();
        l.setQuestion(question);
        l.setOpt1(opt1);
        l.setOpt2(opt2);
        l.setOpt3(opt3);
        l.setOpt4(opt4);
        l.setAnswer(answer);
        s.save(l);
        s.beginTransaction().commit();
        return "success";
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }
    
}
