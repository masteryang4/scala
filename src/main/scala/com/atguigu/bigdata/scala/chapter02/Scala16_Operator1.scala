package com.atguigu.bigdata.scala.chapter02

object Scala16_Operator1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 是一个完全面向对象的语言
        // 声明数字1其实不是一个数字，而是一个数值对象
        // 所谓的运算符其实就是对象的方法
        //val num = 1.+(1)
        //val num = 1 +(1)
        //val num = 1 + 1
        val i : Int = 10

        // Scala至简原则：能省则省
        println(i toString)

    }
}
