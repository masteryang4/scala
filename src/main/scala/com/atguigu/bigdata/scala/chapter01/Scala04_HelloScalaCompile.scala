package com.atguigu.bigdata.scala.chapter01

object Scala04_HelloScalaCompile {
    def main(args: Array[String]): Unit = {

        // Scala程序在编译后会生成两个类文件
        //  1. 当前类名.class
        //  2. 当前类名$.class
        // 编译后，会自动生成一个当前类名的final 类，并同时提供静态main方法
        // 编译后，也同时自动生成了一个当前类名加上$符号的final 类，并同时提供成员main方法
        //         在成员main方法中，执行了打印字符串的逻辑操作
        // 执行时，在静态main方法中调用了含有$符号的final类的对象的成员main方法。
        //         这个类的构造方法是私有的，而且这个对象在整个程序运行过程中只有一个，称之为单例对象
        // 将含有$符号的final类的对象称之为伴生对象，伴随着类所产生的单例对象。

        // 打印语句在编译时是自动增加Predef对象调用的。
        println("Hello Scala")
        println(Scala04_HelloScalaCompile)
    }
}
