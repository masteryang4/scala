package com.atguigu.bigdata.scala.chapter10

object Scala02_Transform1 {
    def main(args: Array[String]): Unit = {

        // A => B(1.0)
        //   => B(2.0)
        implicit def transform( d:Double ): Int = {
            d.toInt
        }

        val user = new User
        //val i : Int = user.money.toInt
        //val i : Int = transform(user.money)
        // 编译器可以在编译出现错误的时候，尝试能不能在当前的作用域范围内
        // 找到可以让程序编译通过的方式（通过转换）
        // 所以这种方式也称之为二次编译
        // 如果找到了可以转换数据类型，让程序编译通过的方式，那么编译器会在
        // 编译过程中自动完成相应逻辑的调用。这个操作开发人员看不见
        // 所以称之为隐式转换
        // 编译器不是随便查找的转换规则，需要加特定的标识才能够被识别
        val i : Int = user.money

        println(i)

    }
    class User {
        val money = 20.0
    }
}
