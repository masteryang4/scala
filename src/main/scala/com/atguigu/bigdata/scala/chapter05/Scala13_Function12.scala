package com.atguigu.bigdata.scala.chapter05

object Scala13_Function12 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 递归函数
        // 函数式编程的主要计算算法就是递归
        // 尾递归
        // StackOverflowError : 栈滚动错误
        def factorial( num:Int ):Int = {
            if ( num <= 1 ) {
                1
            } else {
                num + factorial(num-1)
            }
        }

        println(factorial(100000000))
    }
}
