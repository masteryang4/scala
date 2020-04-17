package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala04_Collection_Array2 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 可变数组
        // 一般情况下，不可变数组采用运算符的方法，而可变数组采用单词方法
        // 构建可变数组
        // 1） new方法创建数组
        val buffer1 = new ArrayBuffer[Int]()
        // 2） apply方法创建数组
        val buffer2: ArrayBuffer[Int] = ArrayBuffer(1,2,3,4)

        // 基本操作
        // 添加数据
        // 集合不会发生变化，内容会添加数据，所以称之为可变数组
        // 追加数据
        buffer1.append(1,2,3,4)
        // 向指定的位置添加数据
        buffer1.insert(1, 5,6,7)

        // 修改数据
        buffer1.update(1, 8)
        buffer1(1) = 9

        // 删除数据
        //buffer1.remove(1)
        buffer1.remove(1, 3)

        // 打印数组字符串
        println(buffer1.mkString(","))

        // 查询数据
//        buffer1.foreach(num=>{println(num)})
//        buffer1.foreach(num=>println(num))
//        buffer1.foreach(println(_))
        buffer1.foreach(println)

        //buffer1 ++ 1


    }
}

