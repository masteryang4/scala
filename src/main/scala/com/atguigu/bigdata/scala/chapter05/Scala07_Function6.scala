package com.atguigu.bigdata.scala.chapter05

object Scala07_Function6 {

    def main(args: Array[String]): Unit = {


        // TODO 函数式编程 闭包

        // 闭包：一个变量在函数执行完后被其他的函数包含使用，改变了这个函数的声明周期。
        //       这种处理方式称之为闭包。
        //       一个函数使用了外部的变量，但是外部的变量不能被回收，应该被包含到当前的函数内存
        //       形成一个闭合的效果，称之为闭包。
        //       改变了变量的生命周期
//        def f1() = {
//            val i = 10
//            def f2(): Int = {
//                i * 2
//            }
//
//            f2 _
//        }

//        println(f1()())
//        val name = "zhangsan"
//
//        def test(): Unit = {
//            println("name = " + name)
//        }
//
//        test()

        // 如果scala编译时，产生了带$anonfun$名称的类，那么表示当前程序中含有闭包
        // scala中闭包在编译时其实会生成匿名函数类
        // 即使内部函数没有使用外部的变量，也有闭包的效果
        // 1. 嵌套函数的使用就有闭包
        // 2. 将函数赋值给变量来使用，也会有闭包
        def test() = {
            //val name = "zhangsan"
            def f1(): String = {
                //"Hello " + name
                "zhangsan"
            }

            //f1 _
        }

        println(test())

    }
}
