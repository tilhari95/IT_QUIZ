
package com.hp;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class AdminAction extends ActionSupport implements ServletRequestAware{
    
    private Integer userid;
    private String password;
HttpServletRequest request;

    @Override
    public void validate() {
        if(userid==null){
            
            addFieldError("userid", "Enter key");
        }
        if(password.equals("")){
          
            addFieldError("password", "Enter password");
        }
    }

    @Override
    public String execute() throws Exception {
        //Session s= HibernateUtil.getSessionFactory().openSession();
        if(userid==101)
        {
            if(password.equals("qwerty")){
                return SUCCESS;
            }else{
                request.setAttribute("msg","Only Admin");
                return ERROR;
            }
        }else{
            request.setAttribute("msg","Only Admin");
            return ERROR;
        }
    
        
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }
    
}
