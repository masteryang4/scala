package com.atguigu.bigdata.scala.chapter07

object Scala20_Collection_Method3 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 常用（通用）方法
        val list = List(1,2,3,4)
        // 计算函数
        // reduce
        // 折叠 ： 将集合的数据和集合之外的数据进行聚合操作
        // fold方法有函数柯里化，有2个参数列表
        //  第一个参数列表：z表示zero，表示初始值，其实就是集合之外的那个数据
        //  第二个参数列表：表示计算规则
        //val i: Int = list.fold(0)(_+_)
        // fold方法要求计算时的两个数据类型相同
        //val i: Int = list.fold("")(_+_)

        // fold方法底层实现其实采用的就是foldLeft
        //list.fold()
        //val i: String = list.foldLeft("")(_+_)

        //  reversed.foldLeft(z)((x, y) => op(y, x))
        // foldLeft : 将初始值放置在集合的前面，计算逻辑和reduceLeft很像
        // foldRight ： 将初始值放置在集合的后面，计算逻辑和reduceRight很像
        val i: Int = list.foldRight(5)(_-_)

        // (1-(2-(3-(4-5))))
        println(i)
    }
}

