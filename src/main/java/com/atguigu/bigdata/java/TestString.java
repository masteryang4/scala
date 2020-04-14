package com.atguigu.bigdata.java;

import java.lang.reflect.Field;

public class TestString {
    public static void main(String[] args) throws Exception {

        // String
        // String : 不可变字符串
        // Java中的String类没有提供任何改变字符串内容的方法
        //    所以的内容改变的方法全都是产生新的字符串
        // StringBuilder, StringBuffer : 可变字符串。
//        String s = " a b "; // 5
//        s = s.trim(); // 3
//        System.out.println("!"+s+"!");
        // !a b!

        // String的值无法发生改变，但是字符串内容其实是可以变的。
        // 可以采用反射的方式绕过正常的处理机制。

//        // 获取字符串String的类型信息
//        Class<? extends String> aClass = s.getClass();
//        // 从类型信息中获取属性
//        Field chars = aClass.getDeclaredField("value");
//        // 获取属性值
//        chars.setAccessible(true);
//        char[] cs = (char[])chars.get(s);
//        cs[2] = 'd';
//
//        System.out.println("!"+s+"!");
        System.out.println("xxxx");

    }
}
