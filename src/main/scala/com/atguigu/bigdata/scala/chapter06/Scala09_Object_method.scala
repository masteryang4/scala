package com.atguigu.bigdata.scala.chapter06

object Scala09_Object_method {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 方法
        // 方法其实就是函数。只不过声明在类中

        // 使用方法
        val user = new User09()
        user.test()


    }
}
// 声明的类中，默认继承了Object中的方法，所以可以直接调用。
class User09 {
    // 声明方法
    def test(): Unit = {
        println("test...")
    }
}
