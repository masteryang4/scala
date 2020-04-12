package com.atguigu.bigdata.scala.chapter02

object Scala02_Variable {

    def main(args: Array[String]): Unit = {

        // 常量
        // 1， 20， 2.0 "abc", 'A', true
        // TODO 变量
        // 1. 变量的声明
        // java : [private] String name = "zhangsan"
        // Scala : [private] var name : String = "zhangsan"
        //var name : String = "zhangsan"
        //val email : String = "test@test.com"
        // java中使用final关键字可以让一个变量初始化后无法修改它的值
        // scala无法在变量前增加final关键字,scala使用val关键字实现类似的操作
        // scala中一个变量如果使用var声明，那么变量可读可写
        // scala中一个变量如果使用val声明，那么变量可读不可写
        // 2. 变量的使用
        //name = "lisi"
        //email = "xxxx@test.com"
        //println(name)
    }
}
