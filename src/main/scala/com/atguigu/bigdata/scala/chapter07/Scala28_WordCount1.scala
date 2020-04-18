package com.atguigu.bigdata.scala.chapter07

import scala.io.Source

object Scala28_WordCount1 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - WordCount - Top3
        val dataList = List(
            ("Hello Scala", 4), ("Hello Spark", 2)
        )
        // TODO  将一个整体的tuple数据按照规则拆分成多个tuple数据
        // (hello,4), (scala,4),(hello,2),(spark,2)
        // word => (word, count)
        val word2CountList: List[(String, Int)] = dataList.flatMap(
            t => {
                val line = t._1
                val count = t._2
                val words = line.split(" ")
                words.map(
                    word => {
                        (word, count)
                    }
                )
            }
        )

        // TODO 将相同的单词分组在一起
        val word2ListMap: Map[String, List[(String, Int)]] = word2CountList.groupBy(
            t => {
                t._1
            }
        )

        // TODO 将分组后的数据的结构发送改变
        // (word, List( (word, count) )) => List((hello, 4), (hello,2))
        // (word,List( count )) => List(4, 2)
        // (word, totalcount) => 6
        val word2TotalCountMap: Map[String, Int] = word2ListMap.map(
            t => {
                val word = t._1
                val list = t._2
                val countList: List[Int] = list.map(t => t._2)
                (word, countList.sum)
            }
        )
        println(word2TotalCountMap)


    }
}

