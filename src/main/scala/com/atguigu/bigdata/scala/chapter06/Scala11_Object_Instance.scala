package com.atguigu.bigdata.scala.chapter06

object Scala11_Object_Instance {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 实例
        // 构建对象
        // 多态：一个对象在不同场合下所表示的不同状态
        // 1. 构建对象时，如果省略类型，这个时候无法使用多态
        val user = new User11()
        // 2. 如果想要使用多态，那么不能省略类型
        val user1:Any = new User11()

    }
    class User11 {

    }
}
