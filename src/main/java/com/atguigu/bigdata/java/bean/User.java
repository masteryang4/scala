package com.atguigu.bigdata.java.bean;

public class User {
    public static int age;

    static {
        age = 20;
        System.out.println("user static ...");
    }
}
