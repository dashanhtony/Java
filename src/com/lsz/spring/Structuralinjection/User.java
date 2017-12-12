package com.lsz.spring.Structuralinjection;

/**
 * Created by Administrator on 2017/12/12.
 */
public class User {
    private String usercode;
    private int userid;
    public User(String usercode,int userid) {
        this.usercode=usercode;
        this.userid=userid;
    }
}
