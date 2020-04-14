package com.atguigu.bigdata.scala.chapter06

object Scala21_Object_Override {
    def main(args: Array[String]): Unit = {

        // TODO - 面向对象编程 - 重写
        // 1. 子类重写父类的方法
        // 1.1  抽象方法的重写：子类将父类的抽象方法补充完整, 可以使用override关键字，也可以省略
        // 1.2  完整方法的重写: 子类重写父类完整方法时，需要声明override关键字

        val user = new User21()
        user.test1()


    }
    abstract class Parent21 {
        // 抽象方法
        def test(): Unit
        // 完整方法
        def test1(): Unit = {
            println("parent test1...")
        }
    }
    class User21 extends Parent21 {
        // 重写抽象方法
        override def test(): Unit = {

        }
        // 重写完整方法
        override def test1(): Unit = {
            println("user test1...")
        }
    }

}
