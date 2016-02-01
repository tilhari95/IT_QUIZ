
package com.hp;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.hibernate.Session;

public class Faq extends ActionSupport{
    private List<Questions> es;
    private String ques;
     private String ans;
     private String username;
     private String rate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }


    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }
     

    
    
    public String getAllQuestion(){
        Session s=HibernateUtil.getSessionFactory().openSession();
        es=s.createCriteria(Faqs.class).list();
        return SUCCESS;
        
    }
    public String rate(){
        Session s=HibernateUtil.getSessionFactory().openSession();
        Rate r=new Rate();
        r.setRate(rate);
        r.setUsername(username);
        s.save(r);
        s.beginTransaction().commit();
        return SUCCESS;
        
    }
    
    public String getAdd(){
        ans="yet to be answered..!!";
        Session s=HibernateUtil.getSessionFactory().openSession();
        Faqs f=new Faqs();
        f.setQues(ques);
        f.setAns(ans);
        s.save(f);
        s.beginTransaction().commit();
        return SUCCESS;
    }

    public List<Questions> getEs() {
        return es;
    }

    public void setEs(List<Questions> es) {
        this.es = es;
    }
    

   
    
    
    }
