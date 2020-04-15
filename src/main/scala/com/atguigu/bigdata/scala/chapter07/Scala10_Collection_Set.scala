package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala10_Collection_Set {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 集Set
        // Set集合是无序的，不可重复的集合
        // 默认使用的Set是不可变的
        val set: Set[Int] = Set(1,2,3,4)
//        val set1: Set[Int] = set + 5 + 6
//        val set2: Set[Int] = set - 2
//        println(set eq set1)
        // 可变Set集合
        val set1: mutable.Set[Int] = mutable.Set(1,2,3,4,5,6,7)

        set1.add(8)
        set1.update(9, false)
        set1.remove(5)

        println(set1)

    }
}

