package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

object Scala08_Collection_Seq2 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 可变序列
        val buffer: ListBuffer[Int] = ListBuffer(1,2,3,4)

        buffer.append(5,6)
        buffer.insert(1,7,8)
        buffer :+ 1
        1 +: buffer
        buffer ++= ListBuffer(1,2,3,4)

        buffer.update(1,9)

        buffer.remove(1)
        buffer.remove(1,3)
        buffer -= 1

        println(buffer.mkString(","))
        println(buffer(1))
        buffer.foreach(println)
    }
}

