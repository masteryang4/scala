package com.atguigu.bigdata.java;

public class TestProtected {
    public static void main(String[] args) throws Exception {

        AAA aaa = new AAA();

        // 访问权限：方法的提供者和方法的调用者之间的关系
        // 方法的提供者：com.atguigu.bigdata.java.AAA
        // 方法的调用者：com.atguigu.bigdata.java.TestProtected

        // 当前的调用者和提供者之间没有父子关系
        aaa.clone();

        // 点不是调用的意思，表示从属关系，表示中文“的”的含义
    }
}
class AAA {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

