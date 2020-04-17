package com.atguigu.bigdata.scala.chapter07

import scala.io.Source

object Scala27_WordCount {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - WordCount

        // TODO 1. 读取文件的数据
        val lineList: List[String] = Source.fromFile("input/word.txt").getLines().toList

        // TODO 2. 将文件中读取的数据拆分成一个一个的单词
        val wordList = lineList.flatMap(
            line => {
                line.split(" ")
            }
        )

        // TODO 3. 将相同的单词进行分组
        //   K (单词) => V (相同单词的集合)
        val word2List: Map[String, List[String]] = wordList.groupBy(
            word => word
        )

        // TODO 4. 将分组后的单词数据进行次数的统计
        // (word, list) => (word, count)
        val word2CountMap: Map[String, Int] = word2List.map(
            kv => {
                val word = kv._1
                val list = kv._2
                (word, list.size)
            }
        )

        // TODO 5. 将统计的结果进行排序，并取前3名
        val word2CountList: List[(String, Int)] = word2CountMap.toList

        // 降序
        val sortList: List[(String, Int)] = word2CountList.sortBy(
            t => t._2
        )(Ordering.Int.reverse)

        val top3List: List[(String, Int)] = sortList.take(3)

        // TODO 6. 将统计结果打印到控制台
        println(top3List.mkString(","))

    }
}

