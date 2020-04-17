package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala15_Collection_Queue {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 队列
        val que = new mutable.Queue[String]()
        // 添加元素
        que.enqueue("a", "b", "c")
        val que1: mutable.Queue[String] = que += "d"
        println(que eq que1)
        // 获取元素
        println(que.dequeue())
        println(que.dequeue())
        println(que.dequeue())

    }
}

