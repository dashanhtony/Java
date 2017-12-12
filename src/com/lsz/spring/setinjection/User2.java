package com.lsz.spring.setinjection;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
public class User2 {
    private List<String> username;
    public List<String> getUsername() {
        return username;
    }
    public void setUsername(List<String> username) {
        this.username= username;
    }
}
