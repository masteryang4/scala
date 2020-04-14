package com.atguigu.bigdata.scala.chapter06

object Scala19_Object_Abstract {
    def main(args: Array[String]): Unit = {

        // TODO - 面向对象编程 - 抽象
        // 1. 抽象类
        //    一个类中的内容不完整，那么这个类就是抽象类，需要使用abstract关键字
        //    抽象类 无法构造对象，只能通过子类构建对象
        //    子类继承抽象类的时候，如果不将抽象方法补充完整，那么这个类也应该是抽象类
        //    一个类如果是抽象的，那么其中不见得有抽象方法
        // 2. 抽象方法
        //    一个方法只有声明，而没有实现，所以不完整，就是抽象方法
        // 3. 抽象属性
        //    Java中没有抽象属性的概念
        //    一个属性如果只有声明，而没有初始化，那么不完整，就是抽象属性
        //    需要子类将属性补充完整

        println(new User19())

    }
    abstract class Parent19 {
        // 抽象属性
        var name : String
        // 抽象方法
        //def test(): Unit
        // 完整方法
//        def test(): Unit = {
//
//        }
    }
    class User19 extends Parent19 {
        // 将抽象属性补充完整
        var name : String = "zhangsan"
        // 将抽象方法补充完整
//        def test(): Unit = {
//        }
    }

}
