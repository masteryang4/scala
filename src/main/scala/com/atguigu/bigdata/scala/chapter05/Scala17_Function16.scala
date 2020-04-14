package com.atguigu.bigdata.scala.chapter05

object Scala17_Function16 {

    def main(args: Array[String]): Unit = {

//        val _ = "zhangsan"
//        val name = "hello " + _
//
//        println(name)
//        name
        val rang = Range(1,5)

        def test( i:Int ): Unit = {
            println(i)
        }

        // 循环
        //rang.foreach(test)
//        rang.foreach( (i:Int)=>{println(i)} )
//        rang.foreach( (i:Int)=>println(i) )
        //        rang.foreach( (i)=>println(i) )
//        rang.foreach( i=>println(i) )
//        rang.foreach( println(_) )
        rang.foreach( println )
    }
}
