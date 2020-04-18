package com.atguigu.bigdata.scala.chapter08

object Scala07_Match6 {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配

        // 声明变量
//        val t = (1, "zhangsan", 30)
//        val ( id, name, age ) = (1, "zhangsan", 30)
//        println("id = " + id)
//        println("name = " + name)
//        println("age = " + age)

//        val Array( first, second, _* ) = Array(1,2,3,4)
//        println(first + ", " + second)
        val User(name, age) = User( "zhangsan", 20 )
        println(name)
    }
    case class User( name:String, age:Int )
}
