package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala05_Collection_Array3 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 数组
        // 多维数组
        val array: Array[Array[Int]] = Array.ofDim[Int](3,3)
        array.foreach(arr=>arr.foreach(println))

        val arr1 = Array(1,2,3)
        val arr2 = Array(4,5,6)

        // 合并数组
        val ints: Array[Int] = Array.concat(arr1, arr2)
        println(ints.mkString(","))

        // 范围数组
        val ints1: Array[Int] = Array.range(1,10)
        println(ints1.mkString(","))

        // 可变数组和不可变数组的转换
        // 不可变数组 => 可变数组
        val buffer: mutable.Buffer[Int] = arr1.toBuffer

        // 可变数组 => 不可变数组
        val array1: Array[Int] = buffer.toArray
    }
}

