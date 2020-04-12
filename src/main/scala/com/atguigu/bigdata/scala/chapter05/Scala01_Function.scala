package com.atguigu.bigdata.scala.chapter05

object Scala01_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程
        /*
         语法：
         def 函数名称( 参数列表 )：函数返回值类型 = {
             函数体
         }
         */
        // 所谓的函数，其实就是封装的功能代码
        // 声明函数
        def test(): Unit = {
            println("test...")
        }

        // 调用函数
        // 函数名(参数列表)
        test()

    }
}
