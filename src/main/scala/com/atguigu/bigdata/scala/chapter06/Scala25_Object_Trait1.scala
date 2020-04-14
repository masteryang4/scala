package com.atguigu.bigdata.scala.chapter06

object Scala25_Object_Trait1 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象编程 - 特质 - trait

        // 特质在编译时，会被编译为接口。
        // 混入特质时，可以采用extends关键字。
        // 如果类有父类，同时又具备某一个特征？
        // 父类的继承应该采用extends关键字,使用with关键字来混入特质，如果有多个特质，采用多个with
    }

}
// 声明特质
trait Color25 {

}
class Parent25 {

}
// 混入特质
class User25 extends Parent25 with Color25 {

}
