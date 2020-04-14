package com.atguigu.bigdata.scala.chapter06

object Scala22_Object_Override1 {
    def main(args: Array[String]): Unit = {

        // TODO - 面向对象编程 - 重写
        // 1. 子类重写父类的属性属性
        // 1.1  抽象属性的重写：子类将父类的抽象属性补充完整, 可以使用override关键字，也可以省略
        // 1.2  完整属性的重写: 子类重写父类完整属性时，需要声明override关键字
        // 1.3  属性的重写要求必须对不可变属性(val)进行重写

        val user = new User22()
        user.test


    }
    abstract class Parent22 {
        // 抽象属性
        var name : String
        // 完整属性
        val age : Int = 20

        def test(): Unit = {
            //age = 40
            println(age)
        }
    }
    class User22 extends Parent22 {
        // 重写抽象属性
        override var name : String = "zhangsan"
        // 重写完整方法
        override val age : Int = 30
    }

}
