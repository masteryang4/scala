package com.atguigu.bigdata.scala.chapter07

object Scala31_WordCount4 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - WordCount - Top3
        val dataList = List(
            "Hello Scala", "Hello Spark"
        )

        // 在scala的函数调用时，如果传递了什么参数就返回什么参数的时候，不能使用下划线代替参数
        // 必须完整声明
        val list = dataList.flatMap(list=>list)

        println(list)

        //val wordList: List[String] = dataList.flatMap(_.split(" "))

        //val map: Map[String, List[String]] = wordList.groupBy(_)
//        def test() = {
//            def test1(): Unit = {
//
//            }
//            test1 _
//        }
        //val map = wordList.groupBy( test _ )

        //println(map)
    }
}

