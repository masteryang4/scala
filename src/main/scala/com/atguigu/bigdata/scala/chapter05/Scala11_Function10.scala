package com.atguigu.bigdata.scala.chapter05

import scala.util.control.Breaks._

object Scala11_Function10 {

    def main(args: Array[String]): Unit = {

        // breakable其实是函数
        // 这里的大括号其实就是函数的参数列表（小括号）
        // for循环其实就是一段代码逻辑

        // TODO 将一段代码逻辑作为参数传递给一个函数来执行

        // TODO 控制抽象函数
        // 将函数作为参数，但是这个函数没有输入参数，也无需返回结果。
        def test( op: =>Unit ): Unit = {
            op
        }

        test {
            val name = "zhangsan"
            val hello = "hello"
            println(hello + " " + name)
        }

        // 模板方法设计模式
        // 父类中搭建算法的骨架，在子类中根据实际的业务需求动态改变业务逻辑

        // 下面的代码书写方式一般应用在程序架构中。
//        breakable {
//            for ( i <- 1 to 5 ) {
//                if ( i == 3 ) {
//                    break
//                }
//                println("i = " + i)
//            }
//        }
    }
}
