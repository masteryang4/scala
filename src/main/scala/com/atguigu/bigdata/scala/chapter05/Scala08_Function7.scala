package com.atguigu.bigdata.scala.chapter05

object Scala08_Function7 {

    def main(args: Array[String]): Unit = {

        // test(10)(20) => 200
        // TODO 1. test函数有2个参数列表
        //  函数只有一个参数列表
        // 函数参数中有一个参数为Int类型
        def test(i:Int) = {

            // 返回一个函数
            // 函数参数中有一个参数为Int类型
            def fun(j:Int): Int = {
                i * j
            }
            // 将内部函数作为整体返回
            fun _
        }

        println(test(10)(20))
    }
}
