package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

object Scala29_WordCount2 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - WordCount - Top3
        val dataList = List(
            ("Hello Scala", 10000), ("Hello Spark", 2)
        )
        val buffer = new ListBuffer[String]()
        dataList.foreach(
            t => {
                val line = t._1
                val count = t._2
                for (i <- 1 to count) {
                    buffer.append(line)
                }
            }
        )
        println(buffer.mkString(","))
        // List(
        // "Hello Scala"
        // "Hello Scala"
        // "Hello Scala"
        // "Hello Scala"
        // "Hello Spark"
        // "Hello Spark"
        // )


    }
}

