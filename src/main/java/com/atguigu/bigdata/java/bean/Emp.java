package com.atguigu.bigdata.java.bean;

public class Emp {
    // 不可变变量
    public final static int AGE = 20;

    static {
        new Emp();
        System.out.println("emp static ...");
    }
}
