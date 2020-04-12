package com.atguigu.bigdata.scala.chapter02

object Scala13_Transform1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 类型转换

        // Int = > String
        val i : Int = 20
        val s : String = i.toString

        // String => Int
        val ss : String = "20.1"
        //val ii : Int = ss.toInt
        val d : Double = ss.toDouble
        //d.toInt

        println(d)
    }
}
