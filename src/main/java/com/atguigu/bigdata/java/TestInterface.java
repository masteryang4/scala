package com.atguigu.bigdata.java;

public class TestInterface {
    public static void main(String[] args) {

        // 实现类代替接口出现
        A1 a1 = new C1();
        System.out.println(a1);
        System.out.println(C1.class.getInterfaces().length);
    }
}

interface A1 {

}
class B1 implements A1 {

}
class C1 extends B1 {

}
