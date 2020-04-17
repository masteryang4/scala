package com.atguigu.bigdata.scala.chapter07

object Scala24_Collection_Method7 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 常用（通用）方法
        val list = List(1,2,3,4)
        val list1 = List("Hello", "Spark", "Hadoop", "Scala")
        // TODO filter
        // 过滤数据：按照指定的规则对集合的每一条数据进行筛选过滤
        //           满足条件的数据保留，不满足的数据丢弃
        val filterList: List[Int] = list.filter(
            num => {
                num % 2 == 0
            }
        )
        println(filterList)

        // 将集合中数据保留首写字母为H的。
        val filterList1: List[String] = list1.filter(
            str => {
                str.substring(0, 1) == "H"
            }
        )
        println(filterList1)
    }
}

