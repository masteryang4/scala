package com.atguigu.bigdata.scala.chapter08

object Scala08_Match7 {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配
//        val list = List(
//            (1, "zhangsan", 30),
//            (2, "lisi", 40),
//            (3, "wangwu", 50)
//        )
//
//        // TODO 集合循环时使用模式匹配还可以起到过滤数据的作用
//        for ( ( id, name, 40 ) <- list ) {
//            println(id + "," + name + ",")
//        }

        val dataMap = Map(
            ("a", 1), ("b",2), ("c",3)
        )
        // (a, 2), (b, 4), (c, 6)
        val dataMap1 = dataMap.map(
            t => {
                (t._1, t._2 * 2)
            }
        )

        val dataMap2: Map[String, Int] = dataMap.map {
            case (word, count) => {
                (word, count * 2)
            }
        }
        //println(dataMap2)
        for ( (word, _) <- dataMap ) {
            println(word)
        }



    }
    case class User( name:String, age:Int )
}
