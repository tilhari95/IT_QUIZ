package com.hp;

import com.opensymphony.xwork2.ActionSupport;

public class LoginPage extends ActionSupport{
//private Integer loginid;
//private String password;
    

    public String execute()
    {
        return "success";
    }

    /*public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void validate() {
        if(loginid==null)
        {
            addFieldError("loginid", "Enter userid");//To change body of generated methods, choose Tools | Templates.
    }
   if(password.isEmpty())
   {
       addFieldError("password", "enter password");
   }*/
    
    
//}
}