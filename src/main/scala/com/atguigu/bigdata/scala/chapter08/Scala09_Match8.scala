package com.atguigu.bigdata.scala.chapter08

object Scala09_Match8 {

    def main(args: Array[String]): Unit = {

        // 将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串

        val list = List(1,2,3,4,5,6,"test")

        // ArrayList<Object>( new User(), new Emp(), new Dept() )

        // 1. 集合中的数值加一
        // map方法是全量数据操作方法
        val maplist = list.map(
            data => {
                data match {
                    case i: Int => i + 1
                    case _ => data
                }
            }
        )

        // 2. 将字符串从集合中删除
        val filterList = maplist.filter(data=>data.isInstanceOf[Int])

        // 1. 集合中的数值加一
//        val result = filterList.map(num=>num.asInstanceOf[Int]+1)
//        println(result)


        println(filterList)

    }
}
