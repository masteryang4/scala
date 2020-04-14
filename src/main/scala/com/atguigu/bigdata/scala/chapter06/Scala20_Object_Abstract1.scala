package com.atguigu.bigdata.scala.chapter06

object Scala20_Object_Abstract1 {
    def main(args: Array[String]): Unit = {

        // TODO - 面向对象编程 - 抽象属性

        // 所谓的抽象属性，其实在编译时，根本就没有属性的声明
        // 编译时会给类增加抽象属性的set，get方法，而且同时声明为abstract

        // 子类将父类的抽象属性补充完整后，那么等同于重写了属性的set，get方法，并同时声明属性。
        val user = new User20
        println(user.name)

    }
    abstract class Parent20 {
        var name : String
    }
    class User20 extends Parent20 {
        var name : String = "zhangsan"
    }

}
