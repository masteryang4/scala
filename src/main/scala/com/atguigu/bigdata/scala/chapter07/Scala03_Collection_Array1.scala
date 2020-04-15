package com.atguigu.bigdata.scala.chapter07

object Scala03_Collection_Array1 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 数组
        // 构建数组
        // java : int[] ints = {1,2,3,4}
        // 直接采用集合名称构建集合对象，底层采用的是集合的apply方法
        val array = Array(1,2,3,4)

        println(array.mkString(","))
    }
}

