package com.atguigu.bigdata.java;

import static com.atguigu.bigdata.java.util.TestUtil.*;

public class TestStaticImport {
    public static void main(String[] args) {

        // 静态导入功能，导入的其实就是类中静态的属性或方法，不需要类名就可以直接访问。
        System.out.println(AGE);
        System.out.println(NAME);
    }
}
