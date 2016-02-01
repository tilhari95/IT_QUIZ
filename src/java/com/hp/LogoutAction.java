
package com.hp;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class LogoutAction extends ActionSupport implements ServletRequestAware, SessionAware{
    
    HttpServletRequest request;
SessionMap<String,Object> sm;

   

    @Override
    public String execute() throws Exception {
        if(sm!=null){
        sm.remove("username");
       sm.invalidate();
        }
       
       return SUCCESS; 
    }

    
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    @Override
    public void setSession(Map<String, Object> map) {
  sm=(SessionMap<String, Object>) map;
    }
    
}
