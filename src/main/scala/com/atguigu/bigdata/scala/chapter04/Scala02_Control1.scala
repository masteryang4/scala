package com.atguigu.bigdata.scala.chapter04

object Scala02_Control1 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 流程控制

        // 双分支
        //
//        val name = "zhangsan"
//
//        if ( name eq new String("zhangsan") ) {
//            println("name is zhangsan")
//        } else {
//            println("name is not zhangsan")
//        }

        // true? code : code
        // Scala中没有三元运算符，使用if...else语法代替
        // java中三元运算符
        //  int i =  20
        //  int j = i == 20 ? 30 : 40
//        val i = 10
//        var j = 0
//        if ( i == 20 ) {
//            //println("20")
//            j = 30
//        } else {
//            //println("30")
//            j = 40
//        }
        // Scala中所有的表达式都有返回结果
        // Scala中会将满足条件的最后一条代码作为表达式的返回结果
        // 如果if代码只有一行，那么可以省略花括号
        val i = 50
        var result = if (i < 30) {
            30
            //"zhangsan"
        } else {
            40
        }
        println("***************")
        result = if (i < 30) 30 else 40

        println("result = " + result)


    }
}
