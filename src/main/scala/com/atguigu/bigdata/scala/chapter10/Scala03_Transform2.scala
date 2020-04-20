package com.atguigu.bigdata.scala.chapter10

object Scala03_Transform2 {
    def main(args: Array[String]): Unit = {

        // A => B(1.0)
        //   => B(2.0)
        // 如果一个方法使用implicit关键字来声明，那么编译器就可以在编译时动态识别
        implicit def transform( d:Double ): Int = {
            d.toInt
        }
//        implicit def transform1( d:Double ): Int = {
//            d.toInt
//        }

        // 如果在相同作用域中存在相同的转换规则，编译器无法实现隐式转换
        val user = new User
        val i : Int = user.money

        println(i)

    }
    class User {
        val money = 20.0
    }
}
