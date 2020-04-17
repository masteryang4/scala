package com.atguigu.bigdata.scala.chapter07

object Scala17_Collection_Method {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 常用（通用）方法
        val list = List(1,2,2,3,4,4)

        // 长度
//        println(list.size)
//        println(list.length)
//        list.isEmpty // 判断集合元素是否为空

        // 遍历
        for ( i <- list ) {
            //println(i)
        }
        //list.iterator
        //list.productIterator
        // 将集合的每一个元素传递的到函数中进行处理
        // 所以函数的参数应该是集合中元素的类型
        // foreach方法主要用于遍历集合，所以无需返回值
        def test(i:Int): Unit = {
            println(i)
        }
        //list.foreach(test)
//        list.foreach((i:Int)=>{println(i)})
//        list.foreach((i:Int)=>println(i))
//        list.foreach((i)=>println(i))
//        list.foreach(i=>println(i))
//        list.foreach(println(_))
//        list.foreach(println)

        // 获取数据
//        println(list.mkString(","))
        // 拿前面的两个数据
        val takeList: List[Int] = list.take(2)
        // 拿后面的两个数据
        val takeRightList: List[Int] = list.takeRight(2)

//        println(takeList.mkString(","))
//        println(takeRightList.mkString(","))

        // 反转数据
        val reverseList: List[Int] = list.reverse
        //println(reverseList.mkString(","))
        // 查找数据（filter）
//        val findList = reverseList.find(
//            num => {
//                println(num)
//                num % 2 == 0
//            }
//        )
//        println(findList.mkString(","))

        // 去重
        val distinctList: List[Int] = list.distinct
        println(distinctList.mkString(","))
    }
}

