package com.atguigu.bigdata.scala.chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks._

object Scala07_Control6 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 流程控制
        // Scala中没有break关键字，使用对象方法的方式来代替
        // 6,7,9,3,1,2
        /*
        Breaks.breakable {
            for ( i <- 1 to 5 ) {
                if ( i == 3 ) {
                    // 跳出循环
                    Breaks.break()
                }
                println("i = " + i)
            }
        }
*/
//        breakable {
//            for ( i <- 1 to 5 ) {
//                if ( i == 3 ) {
//                    // 跳出循环
//                    break
//                }
//                println("i = " + i)
//            }
//        }

    }
}
