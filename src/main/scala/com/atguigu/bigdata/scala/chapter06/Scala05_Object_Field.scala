package com.atguigu.bigdata.scala.chapter06

object Scala05_Object_Field {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 类的属性

        // 类的属性其实就是类的局部变量，所以声明属性和属性变量是一样的。

        // 类属性的使用
        // 如果类属性前不增加任何访问修饰符，那么访问权限为公共的
        val user = new User05()
        println(user.name)
        println(user.age)


    }
}

class User05 {
    // 声明类的属性（变量）
    var name : String = "zhangsan"
    val age : Int = 20
}
