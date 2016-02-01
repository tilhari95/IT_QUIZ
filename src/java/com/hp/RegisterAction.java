package com.hp;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class RegisterAction extends ActionSupport implements ServletRequestAware, SessionAware {

    private String password;
    private String username;
    private String email;
    private String institutename;
    private String fullname;
    private String rpassword;
    HttpServletRequest request;
    SessionMap<String, Object> sm;

    @Override
    public void validate() {
        if (username.equals("")) {

            addFieldError("username", "Enter username");
        }
        if (password.equals("")) {

            addFieldError("password", "Enter password");
        }
        if (rpassword.equals("")) {

            addFieldError("rpassword", "Enter password");
        }
        if (email.equals("")) {

            addFieldError("email", "Enter email");
        }
        if (institutename.equals("")) {

            addFieldError("institutename", "Enter institute name");
        }
        if (fullname.equals("")) {

            addFieldError("fullname", "Enter fullname");
        }
        if (password.equals(rpassword)) {

        } else {
            addFieldError("rpassword", "Password not matched");
        }
    }

    @Override
    public String execute() throws Exception {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Login l = new Login();
        l.setEmail(email);
        l.setFullname(fullname);
        l.setInstitutename(institutename);
        l.setPassword(password);
        l.setUsername(username);
        l.setRepassword(rpassword);
        s.save(l);
        s.beginTransaction().commit();
        sm.put("userid", l.getUserid());
        return "success";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public SessionMap<String, Object> getSm() {
        return sm;
    }

    public void setSm(SessionMap<String, Object> sm) {
        this.sm = sm;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        sm = (SessionMap<String, Object>) map;
    }

}
