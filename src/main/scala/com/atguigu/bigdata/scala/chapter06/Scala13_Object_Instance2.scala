package com.atguigu.bigdata.scala.chapter06

object Scala13_Object_Instance2 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 构建对象

        // Scala是一个函数式编程语言，万物皆函数
        // 类其实也是一个函数,所以可以在类的后面声明参数列表
        // 这个时候就可以将类名当成函数名,进行调用，这个调用，其实就是构造方法调用
        // 类在构建的时候，完成类的初始化操作
        val user = new User13
        println(user)

    }
    class User13() {
        // 函数体
        // 类体
        println("user init...")
    }
}
