
package com.hp;

import com.hp.HibernateUtil;
import com.hp.Login;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class LoginAction extends ActionSupport implements ServletRequestAware, SessionAware{
    
    private String username;
    private String password;
HttpServletRequest request;
SessionMap<String,Object> sm;
    @Override
    public void validate() {
        if(username.equals("")){
            
            addFieldError("username", "Enter username");
        }
        if(password.equals("")){
          
            addFieldError("password", "Enter password");
        }
    }

    @Override
    public String execute() throws Exception {
        Session s=HibernateUtil.getSessionFactory().openSession();
        Login l= (Login)s.get(Login.class, username);
        if(l!=null){
            if(l.getPassword().equals(password)){
                sm.put("username", l.getUsername());
                return SUCCESS;
            }else{
                request.setAttribute("msg","Invalid user");
                return ERROR;
            }
        }else{
            request.setAttribute("msg","Invalid user");
            return ERROR;
        }
    
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public SessionMap<String, Object> getSm() {
        return sm;
    }

    public void setSm(SessionMap<String, Object> sm) {
        this.sm = sm;
    }

    
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    @Override
    public void setSession(Map<String, Object> map) {
    sm=(SessionMap<String, Object>) map;
    }
    
}
