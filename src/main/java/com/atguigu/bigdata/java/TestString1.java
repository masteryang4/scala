package com.atguigu.bigdata.java;

public class TestString1 {
    public static void main(String[] args) {
        String name = "zhangsan";
        if ( name.equals(new String("zhangsan")) ) {
            System.out.println("name is zhangsan");
        }
    }
}
