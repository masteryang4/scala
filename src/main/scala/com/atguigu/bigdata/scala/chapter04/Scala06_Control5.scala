package com.atguigu.bigdata.scala.chapter04

object Scala06_Control5 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 流程控制

        /*
        for ( i <- 1 to 5 ) {
            if ( i % 2 == 1 ) {
                println("i = " + i)
            }
        }
        */
        // 循环守卫
//        for ( i <- 1 to 5 if ( i % 2 == 1 ) ) {
//            println("i = " + i)
//        }

        // 循环步长
//        for ( i <- 1 to 5 by 2 ) {
//            println("i = " + i)
//        }
//        for ( i <- Range(1,5,2) ) {
//            println("i = " + i)
//        }

        // 嵌套循环
//        for( i <- 1 to 3 ) {
              // code
//            for ( j <- 1 to 3 ) {
//                println("i = " + i + ", j = " + j)
//            }
//        }

//        for( i <- 1 to 3; j <- 1 to 3 ) {
//            println("i = " + i + ", j = " + j)
//        }

//        for ( i <- 1 to 5 ) {
//            val j = i * 2
//            println("j = " + j)
//        }
//        for ( i <- 1 to 5; j = i * 2 ) {
//            println("j = " + j)
//        }

        // 如果想要获取for循环的每一次计算结果，需要使用yield关键字
        val result = for ( i <- 1 to 5; j = i * 2 ) yield {
            j
        }
        println("result = " + result)
    }
}
