package com.atguigu.bigdata.scala.chapter07

object Scala14_Collection_Tuple1 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - Tuple(元组)
        val map: Map[String, Int] = Map("a"->1, "b"->2,"c"->3)

        map.foreach(
            t => {
                println(t._1 + "=" + t._2)
            }
        )

    }
}

