package com.lsz.spring.setinjection;

import com.lsz.spring.service.UserService;

/**
 * Created by Administrator on 2017/12/12.
 */
public class User1 {
    private UserService userservice;
    public UserService getUserservice() {
        return userservice;
    }
    public void setUserservice(UserService userservice){
        this.userservice= userservice;
    }
}
