package com.atguigu.bigdata.java;

public class TestOperator {
    public static void main(String[] args) {
        System.out.println(isNotEmpty(null));

    }
    // 判断字符串是否非空
    private static boolean isNotEmpty(String s) {
        return s != null && !s.trim().equals("");
    }
}
