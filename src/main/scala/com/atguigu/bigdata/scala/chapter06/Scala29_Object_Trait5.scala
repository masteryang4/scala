package com.atguigu.bigdata.scala.chapter06

object Scala29_Object_Trait5 {
    def main(args: Array[String]): Unit = {

        // 创建对象
        // 构造顺序
        // 1) 父类 => 父特质 => 子特质 => 子类
        // 2) 父类的特质 => 父类 => 子类的特质 => 子类
        new User29()
    }
}
trait ParentTest29 {
    println("parent trait...")
}
trait Test29 extends ParentTest29 {
    println("child trait...")
}
class Parent29 extends ParentTest29 {
    println("parent class...")
}
class User29 extends Parent29 with Test29 {
    println("child class...")
}