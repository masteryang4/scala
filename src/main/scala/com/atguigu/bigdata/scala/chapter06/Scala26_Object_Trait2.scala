package com.atguigu.bigdata.scala.chapter06

object Scala26_Object_Trait2 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象编程 - 特质 - trait

        // OCP => 开闭原则
        // 对功能扩展开发， 对程序代码修改关闭

        // 如果想要扩展程序功能，又不想修改源码，那么采用动态混入的方式是一个好的选择

        // TODO Trait可以看作接口和抽象类的混合体。
        val user = new User26() with DataOper
        user.insert()
    }

}
// 声明特质
trait DataOper {

    def insert(): Unit = {
        println("insert...")
    }
}

// 混入特质
class User26 {

    def test(): Unit = {

    }
}
