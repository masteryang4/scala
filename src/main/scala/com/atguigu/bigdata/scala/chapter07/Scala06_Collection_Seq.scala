package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala06_Collection_Seq {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 序列
        // Seq => List
        // 构建对象
        //val list = new List()
        val list: List[Int] = List(1,2,3,4)

        // 基本操作
        val ints1: List[Int] = list :+ 1
        val ints2: List[Int] = 1 +: list

        val ints3: List[Int] = list.updated(1, 5)

        println(ints1.mkString(","))
        println(ints2.mkString(","))
        println(ints3.mkString(","))
        println(list.mkString(","))
        println(ints3 eq list )

    }
}

