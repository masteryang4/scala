package com.atguigu.bigdata.scala.chapter04

object Scala08_Control7 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 流程控制
        for ( i <- 1 to 18 by 2; j = (18-i)/2 ) {
            println( " " * j + "*" * i )
        }

    }
}
