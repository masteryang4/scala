package com.atguigu.bigdata.scala.chapter04

object Scala05_Control4 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 流程控制
        /*
           java :
           for ( int i = 0; i < 10; i++ ) {
               sout("i = " + i)
           }
           for ( int i : list ) {
               sout("i = " + i)
           }
         */
        // Scala 循环, 类似于java中的增强for循环
        /*
           for ( 循环变量 <- 数据集 ) {
               循环体
           }
         */
        for ( i <- Range(1,5) ) { // 不包含5
            println("i = " + i)
        }

        for ( j <- 1 to 5 ) { // 包含5
            println("j = " + j)
        }

        for ( k <- 1 until 5 ) { // 不包含5
            println("k = " + k)
        }

    }
}
