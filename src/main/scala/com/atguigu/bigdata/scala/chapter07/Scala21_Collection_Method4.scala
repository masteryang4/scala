package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala21_Collection_Method4 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 常用（通用）方法
        // 将两个Map集合进行合并(merge)处理
        val map1 = mutable.Map("a"->1, "b"->2, "c"->3)
        val map2 = mutable.Map("a"->4, "d"->5, "c"->6)
        // Map( "a"->5, "b"->2, "c"->9 ,"d"->5)
        val map3 = map2.foldLeft(map1)(
            ( map, kv ) => {
                val k = kv._1
                val v = kv._2
                //map.update(k, map.getOrElse(k, 0) + v)
                map(k) = map.getOrElse(k, 0) + v
                map
            }
        )
        println(map3)
    }
}

