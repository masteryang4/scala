package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala12_Collection_Map {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 映射Map
        // A <-> B
        // 键值对数据 ： A -> B
//        val map1: Map[String, Int] = Map("a"->1, "b"->2, "c"->3)
//        val map2: Map[String, Int] = map1 + ( "d" -> 4 )
        // 可变Map集合
        // Map集合体现无序的，KV对数据
        val map1: mutable.Map[String, Int] = mutable.Map( "a"->1, "b"->2, "c"->3 )
//
//        map1.put("d", 4)
//        map1 + ( "e" -> 5 )
//
//        map1.update("d", 5)
//
//        map1.remove("d")
//        map1 - "e"
//
//        println(map1)

        // 将Map集合转换成有序集合
        val list: List[(String, Int)] = map1.toList
//        map1.toSet
//        map1.keys
//        map1.values

//        val keys: Iterator[String] = map1.keys.iterator
//        while ( keys.hasNext ) {
//            val key = keys.next()
//            val value = map1.get(key)
//            println( key + "=" + value )
//        }

        // 从map集合中获取指定key的数据，有可能数据不存在。
        // map会返回null，在数据处理中有可能会出现空指针异常。
        // 为了让程序更加健壮，scala语法中增加了一个Option类型(选项类型)：
        // Some: 可能有值，None : 可能无值
//        val maybeInt: Option[Int] = map1.get("d")
//        if ( maybeInt.isEmpty ) {
//            println("查询指定的key不存在, 给定默认值" + maybeInt.getOrElse(10))
//        } else {
//            println(maybeInt.get)
//        }
//        val i: Int = map1.getOrElse("a", 10)
//        println(i)


    }
}

