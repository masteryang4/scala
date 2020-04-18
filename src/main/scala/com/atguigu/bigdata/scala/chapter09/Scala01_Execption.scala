package com.atguigu.bigdata.scala.chapter09

import scala.util.control.Breaks

object Scala01_Execption {

    def main(args: Array[String]): Unit = {
        // TODO Scala - 异常
        // 使用方式和模式匹配基本相同
        // 异常可以简单的理解是语言为了程序的健壮性所考虑的语法
        // 异常还可以改变程序的流程
        // Scala中没有编译器异常和运行时异常的区别，所以scala中函数是无需抛出异常
        // scala中没有throws关键字
        try {
            var n = 10 / 0
        } catch {
            case ex:Exception => {
                println("发生异常:" + ex.getMessage)
            }
            case ex: ArithmeticException => {
                println("发生除数为0异常:" + ex.getMessage)
            }

        } finally {
            println("最终要执行的代码。。。")
        }
        Breaks.breakable {
            Breaks.break()
        }



    }
}
