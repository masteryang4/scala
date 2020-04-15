package com.atguigu.bigdata.scala.chapter06

object Scala30_Object_Trait6 {
    def main(args: Array[String]): Unit = {

        // TODO 特质
        //  1. 混入多个特质的初始化顺序
        //    按照从前到后，从左到右的顺序进行初始化
        //  2. 混入多个特质的功能执行顺序
        //    如果当前混入的多个特质中有相同方法，编译器执行时会出现错误
        //    将特质之间建立关系，然后再调用时形成功能叠加
        val user = new User30
        user.test()
    }
}
trait ParentTest30 {
    def test(): Unit = {
        println("1111")
    }
}
trait Test30 extends ParentTest30 {
    //println("test 30...")
    override def test(): Unit = {
        super.test()
        println("2222")
    }
}
trait Test300 extends ParentTest30 {
    //println("test 300...")
    override def test(): Unit = {
        super.test()
        println("3333")
    }
}
class User30 extends Test30 with Test300 {
    override def test(): Unit = {
        super.test()
        println("4444")
    }
}