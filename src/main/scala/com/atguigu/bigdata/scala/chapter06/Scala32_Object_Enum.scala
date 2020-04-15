package com.atguigu.bigdata.scala.chapter06

object Scala32_Object_Enum {
    def main(args: Array[String]): Unit = {

        // 枚举
        // java enum
        println(Color.BLUE.id)
    }
    object Color extends Enumeration {
        val RED = Value(1, "red")
        val YELLOW = Value(2, "yellow")
        val BLUE = Value(3, "blue")
    }
}