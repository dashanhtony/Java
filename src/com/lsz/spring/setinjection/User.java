package com.lsz.spring.setinjection;


/**
 * Created by Administrator on 2017/12/11.
 */
public class User{
    private String username;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username= username;
    }

    public String login() throws Exception{
        if("admin".equals(username))
            return "success";
        else
            return "error";
    }
}
