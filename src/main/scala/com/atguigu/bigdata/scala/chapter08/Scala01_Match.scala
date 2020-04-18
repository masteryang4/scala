package com.atguigu.bigdata.scala.chapter08

object Scala01_Match {

    def main(args: Array[String]): Unit = {

        // Scala - 模式匹配
        val age = 50

        // scala中的模式匹配没有break。使用大括号表示逻辑执行范围
        age match {
            case 20 => {
                println("age is 20")
            }
            case 30 => {
                println("age is 30")
            }
            case _ => {
                println("age is not 20 or 30")
            }
        }
    }
}
