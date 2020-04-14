package com.atguigu.bigdata.scala.chapter06

object Scala12_Object_Instance1 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 构建对象
        // 构建对象
        // 1. 构建对象一般采用new的方式，这种方式是调用对象的构造方法
        // 2. java中有默认的无参构造方法
        // 3. 如果类中声明了一个和类名一样的方法，这个方法并不是构造方法,就是一个普通方法
        val user = new User12()
        user.User12()

    }
    class User12 {
        def User12()= {
            println("object....")
        }
    }
}
