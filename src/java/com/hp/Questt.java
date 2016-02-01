
package com.hp;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.hibernate.Session;

public class Questt extends ActionSupport{
    private List<Questions> es;
    
    
    public String getAllQuestion(){
        Session s=HibernateUtil.getSessionFactory().openSession();
        es=s.createCriteria(Questions.class).list();
        return SUCCESS;
        
    }

    public List<Questions> getEs() {
        return es;
    }

    public void setEs(List<Questions> es) {
        this.es = es;
    }
    

   
    
    
    }
