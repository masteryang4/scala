package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala11_Collection_Set1 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 集Set
        val set1 = mutable.Set(1,2,3,4)
        val set2 = mutable.Set(3,4,5,6)

        // 交集
        val set3: mutable.Set[Int] = set1 & set2
        println(set3)

        // 差集
        val set4: mutable.Set[Int] = set1 &~ set2
        println(set4)
    }
}

