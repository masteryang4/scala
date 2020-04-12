package com.atguigu.bigdata.scala.chapter05

object Scala14_Function13_TailRecursion {

    def main(args: Array[String]): Unit = {

        // 尾递归
        // 递归操作在函数逻辑的最后
        // 并且和函数逻辑之间没有关联
        //test()

        println(tailRecursion(5, 1))
        // tailRecursion(4, 6)
        // tailRecursion(3, 10)
        // tailRecursion(2, 13)
        // tailRecursion(1, 15)
        // ( 4, 5 + 1 )
        // ()
    }
    def tailRecursion( num:Int, result: Int ): Int = {
        if ( num <= 1 ) {
            result
        } else {
            tailRecursion(num - 1, num + result)
        }
    }
//    def test(): Unit = {
//        println("zzzzz")
//        test()
//    }
}
