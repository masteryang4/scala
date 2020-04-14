package com.atguigu.bigdata.scala.chapter06

object Scala16_Object_Instance5 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 构建对象
        // 构造顺序 - 构造方法的执行顺序
        val user = new User16()

    }

    class Person16(name:String) {
        println("111")
        def this() {
            this("zhangsan")
            println("222")
        }
    }
    class User16(name:String) extends Person16(name){
        println("333")
        def this( ) {
            this("444")
        }
    }
}
