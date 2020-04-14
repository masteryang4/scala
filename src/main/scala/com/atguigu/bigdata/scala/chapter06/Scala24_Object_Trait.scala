package com.atguigu.bigdata.scala.chapter06

object Scala24_Object_Trait {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象编程 - 特质 - trait
        // Scala中没有接口的概念,使用特质来代替接口
        // 可以将多个对象相同的特征从对象中剥离出来，形成特殊的结构，称之为特质。
        // trait
        // 如果一个类符合某一个特质，那么可以将这个特征混入到类中

    }

}
// 声明特质
trait Color24 {

}
// 混入特质
class User24 extends Color24 {

}
