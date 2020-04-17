package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala22_Collection_Method5 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 常用（通用）方法
        val list = List(1,2,3,4)
        // scan和fold方法很像，区别在于scan方法会将计算的中间结果进行保留
        val ints: List[Int] = list.scan(0)(_-_)
        val ints1: List[Int] = list.scanLeft(0)(_-_)
        val ints2: List[Int] = list.scanRight(0)(_-_)
        println(ints)
        println(ints1)
        println(ints2)
    }
}

