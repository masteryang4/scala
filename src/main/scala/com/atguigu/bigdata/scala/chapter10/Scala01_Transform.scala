package com.atguigu.bigdata.scala.chapter10

object Scala01_Transform {
    def main(args: Array[String]): Unit = {

        // 自动类型转换 => 隐式转换
        val b : Byte = 10

        val i:Int = b

        val b1 : Byte = i.toByte

        println(b1)

    }

}
