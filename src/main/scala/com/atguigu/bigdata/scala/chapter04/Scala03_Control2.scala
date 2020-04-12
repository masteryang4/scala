package com.atguigu.bigdata.scala.chapter04

object Scala03_Control2 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 流程控制
        val age = 30
        // Scala也是静态类型语言，需要在编译时确定变量的类型
        // 所以如果不执行逻辑就想要确定类型，那么就必须使用通用父类型
        val result = if ( age < 30 ) {
            20 // Int
            "zhangsan" // String
        } else {
            40 // Int
            null // Null
        }

        println("result = " + result)

    }
}
