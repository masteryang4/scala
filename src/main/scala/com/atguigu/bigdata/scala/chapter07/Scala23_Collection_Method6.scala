package com.atguigu.bigdata.scala.chapter07

object Scala23_Collection_Method6 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 常用（通用）方法
        val list = List(1,2,3,4)

        // TODO map
        //  map : 所谓的映射，其实就是关联 Key=>Value
        //       scala集合中的map方法表示的是一种转换操作 A => B
        //       map方法会将集合中的每一个元素转换成其他元素
        //  List[A,A,A] => List[B,B,B]
        //val newList: List[Int] = list.map( num => {num * 2} )
        // map方法是scala集合中用户的最多的方法
        //val newList: List[Int] = list.map( _ * 2 )
        //println(newList)

        // TODO 扁平化
        val lists = List(
            List(1,3), List(2,4)
        )

//        val flatten: List[Int] = lists.flatten
//        println(flatten.map(_*2))

        // TODO 扁平映射 = 扁平化+映射
        //val ints: List[Int] = lists.flatMap(datas=>datas.map(_*2))
        //println(ints)

        val stringList = List( "a b", "c d" )
        // a,b,c,d
        // 将数据拆分成一个一个的字母
        //val flatten: List[Char] = stringList.flatten
        //val strings: List[String] = stringList.flatMap(s => s.split(" "))
        //println(strings)

        // list item => List()
//        val ints: List[Int] = list.flatMap(
//            num => {
//                List(num)
//            }
//        )
//        println(ints)

        val lists1 = List(
            List(
                List(1,2),
                List(3,4)
            ), List(
                List(5,6),
                List(7,8)
            )
        )
        // List[List[List[Int]]]
        // 扁平化操作只能对外层数据进行扁平化。
        println(lists1.flatMap(list => list))

    }
}

