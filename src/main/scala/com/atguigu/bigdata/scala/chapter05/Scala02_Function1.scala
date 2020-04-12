package com.atguigu.bigdata.scala.chapter05

object Scala02_Function1 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程
        // 函数 & 方法
        // 在Scala中，方法其实就是函数,一般将类中的函数称之为方法
        // 其他的场合就是函数
        // 函数
        // Scala的语法结构比较松散，任意一个语法结构可以声明其他语法
        // 方法中可以有函数
        // 函数中可以声明函数
        def test1(): Unit = {
            def test2(): Unit = {

            }
        }
        def test4(s:String): Unit = {

        }

        // 方法是可以重写和重载的。
        // 函数没有重写和重载的概念。
    }
    // 方法
    def test3(): Unit = {

    }
    // 重载方法
    def test3(s:String): Unit = {

    }
}
