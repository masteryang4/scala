package com.atguigu.bigdata.scala.chapter05

object Scala16_Function15 {

    def main(args: Array[String]): Unit = {

        // TODO 函数编程 - 延迟加载（惰性加载）
        // 其实数据最好的使用方式:
        //  1. 用到数据再加载数据
        // 2  如果没有用到数据暂时不加载。
        def test(): String = {
            println("test...")
            "zhangsan"
        }
        // 如果变量声明lazy关键字，那么只要在使用的时候才会初始化
        lazy val name = test()
        println("***************************")
        println("***************************")
        println("***************************")
        println(name)
    }
}
