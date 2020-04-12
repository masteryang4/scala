package com.atguigu.bigdata.scala.chapter02

object Scala12_Transform {

    def main(args: Array[String]): Unit = {

        // TODO Scala 类型转换

        // Scala可以将值类型进行自动转换
        // 精度小的可以自动转换为精度大的类型
        val b : Byte = 10
        val s : Short = b
        val i : Int = s

        // 精度大的转换为精度小的类型
        val b1 : Byte = i.toByte

        println(b1)
    }
}
