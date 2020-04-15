package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala09_Collection_Seq3 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 序列
        val list1 = List(1,2,3,4)
        val list2 = List(5,6,7,8)

        val list3: List[Int] = List.concat(list1, list2)

        println(list3.mkString(","))

        val list4: List[String] = List.fill[String](3)("a")
        println(list4.mkString(","))

        // 不可变集合 => 可变集合
        val buffer: mutable.Buffer[Int] = list1.toBuffer
        // 可变集合 => 不可变集合
        val list: List[Int] = ListBuffer(1,2,3,4).toList
    }
}

