package com.atguigu.bigdata.scala.chapter06

object Scala17_Object_Instance6 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 构建对象
        // 构造顺序 - 构造方法的执行顺序
        val user = new User17()

    }

    class Person17(name:String) {
        println("111")
        def this() {
            this("zhangsan")
            println("222")
        }
    }
    class User17(name:String) extends Person17{
        println("333")
        def this( ) {
            this("zhangsan")
            println("444")
        }
    }
}
