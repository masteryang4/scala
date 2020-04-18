package com.atguigu.bigdata.scala.chapter08

object Scala10_Match9 {

    def main(args: Array[String]): Unit = {

        // 使用偏函数的方式实现下面的需求：
        // 将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串

        // 所谓的偏函数，其实就是对数据进行筛选，符合条件的数据才会进行相应的处理。
        // 偏函数仅仅是一个trait的名称,需要实现特定方法进行相应的处理
        //所以一般实现时，不用混入这个特质，直接使用模式匹配就可以实现
        // 所以在开始时，可以采用模式匹配来代替偏函数
        val list:List[Any] = List(1,2,3,4,5,6,"test")

        // 采集，将满足条件的数据采集过来
        // map方法不支持偏函数，也就是说不能只对一部分数据进行处理。
        val ints: List[Int] = list.collect{ case i:Int => i + 1 }
        println(ints)
    }
}
