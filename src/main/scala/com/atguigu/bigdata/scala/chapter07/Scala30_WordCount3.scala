package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

object Scala30_WordCount3 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - WordCount - Top3
        val dataList = List(
            ("Hello Scala", 4), ("Hello Spark", 2)
        )
        // List(
        // ”Hello ScalaHello ScalaHello Scala Hello Scala“
        // "Hello Spark Hello Spark"
        //)
        val strings: List[String] = dataList.map(
            t => {
                val line = t._1
                val count = t._2
                (line + " ") * count
            }
        )
        println(strings)
    }
}

