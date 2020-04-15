package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala13_Collection_Tuple {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - Tuple(元组)

        // 容器 ：
        //  当数据存在关系,可以在使用时封装为Object
        //  当数据没有存在关系，但是相同类型，可以封装为集合
        // 当数据没有关系的时候，如何将这些数据当成一个整体使用？

        // Scala语言中将多个无关数据封装成一个特殊的数据结构Tuple，当成一个整体来使用。
        // Tuple : 元素的组合，元组，使用小括号将数据封装起来。
        val tuple: (Int, String, Int) = (1, "zhangsan", 30)

        // 元组中能放置的元素最多只能是22个。

        // 访问元组 ： 顺序号
        println(tuple._1)
        println(tuple._2)
        println(tuple._3)

        // 索引编号
        println(tuple.productElement(0))

        // 如果元组中的元素只有2个，称之为对偶元组，也称之为键值对
        val map: Map[String, Int] = Map( ("a", 1), ("b",2), ("c", 3) )
        val list: List[(String, Int)] = map.toList

        val tuple1: (String, Int) = "a"->1

    }
}

