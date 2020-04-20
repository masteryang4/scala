package com.atguigu.bigdata.java;
import java.util.*;
public class TesGeneric {
    public static void main(String[] args) {

        // Java中的泛型是不可变的
        // 泛型只能对声明之后的逻辑起作用
        // 泛型只有在使用类型操作时才会起作用
//        List list = new ArrayList();
//        list.add(new Classes());
//        List<Dept> dept = list;
        // Object.toString
        //System.out.println(dept);
//        for ( Dept d : dept ) {
//            System.out.println(d);
//        }

//        test(new ParentDept());
//        test(new Dept());

//        test( ParentDept.class );
//        test( Dept.class );
//        test( SubDept.class );

//        test1( ParentDept.class );
//        test1( Dept.class );
//        test1( SubDept.class );
    }
    public static void test(ParentDept pd) {
        System.out.println(pd);
    }
    // 泛型的上限（上边界）类型,只能dept类型和它的子类型可以传值
    public static void test(Class<? extends Dept> c) {
        System.out.println(c);
    }
    // 泛型的下限（下边界）类型,只能dept类型和它的父类型可以传值
    public static void test1(Class<? super Dept> c) {
        System.out.println(c);
    }
}
class ParentDept {

}
class Dept extends ParentDept{

}
class SubDept extends Dept {

}
