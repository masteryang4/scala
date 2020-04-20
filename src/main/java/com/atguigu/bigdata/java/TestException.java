package com.atguigu.bigdata.java;

public class TestException {
    public static void main(String[] args) {

        //Student s = new Student();
        Student s = null;

        // Integer 引用类型，可以为null
        // int 基本类型，不可能为null
        // 所谓的空指针异常，其实就是调用一个为空（null）对象的成员方法或成员属性
        // 自动拆箱：intValue
        //test(s.age);

        // -128 - 127
        // 自动装箱
        // Integer id = 10000
        // Integer id1 = 10000
        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println(i1.equals(i2));
    }

    public static void test( int age ) {
        System.out.println("age = " + age);
    }
}
class Student {
    public static Integer age;
}
