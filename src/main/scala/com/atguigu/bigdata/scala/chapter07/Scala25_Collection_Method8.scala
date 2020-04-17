package com.atguigu.bigdata.scala.chapter07

object Scala25_Collection_Method8 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 常用（通用）方法
        val list = List(1,2,3,4)
        val list1 = List("Hello", "Spark", "Hadoop", "Scala")

        // 按照指定的规则进行分组操作，规则的执行结果其实就是分组的key
//        val map: Map[String, List[String]] = list1.groupBy(
//            s => {
//                s.substring(0, 1)
//            }
//        )
//        println(map)
        val resultMap: Map[Int, List[Int]] = list.groupBy(
            num => {
                num % 2
            }
        )
        println(resultMap)
    }
}

