package com.javalearn;

import java.util.Date;

/**
 * Created by Administrator on 2017/12/29.
 */
public class test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date)  ;
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
