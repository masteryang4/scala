package com.atguigu.bigdata.scala.chapter02

object Scala07_String {

    def main(args: Array[String]): Unit = {

        // TODO Scala String
        // Scala中没有自己的字符串类，使用的其实就是java中的字符串
        // Scala中给java的字符串起了个别名String，使用起来非常简单
        val name : String = "zhangsan"
        val password : String = "123123"
        val subname: String = name.substring(0, 1)
        //println(subname)

        // 字符串拼接
        val newname: String = subname + "hangsan"

        // 传值字符串
        //printf("name = %s\n", name)

        // 插值字符串
        // 使用$符号将变量插入到字符串中，使用时，字符串前增加s字符
//        println("name = " +
//                "zhangsan")
//        println(s"name = $name")
//        println(s"name = ${name.length}")

        // 多行字符串
        // | 顶格符
        // scala使用三个双引号实现多行字符串，而且可以实现json字符串的拼接。
        println(
            s"""
              | name     : ${name}
              | password : ${password}
            """.stripMargin)

        // JSON : 特殊格式的字符串
        // JavaScript Object Notation
        // { "username": "zhangsan", "age":20 }
        //val json = s"{ \"username\": \"${name}\", \"age\":${password} }"
        println(s""" { "username": "${name}", "age":20 } """)

    }
}
