package com.atguigu.bigdata.scala.chapter06

object Scala27_Object_Trait3 {
    def main(args: Array[String]): Unit = {


    }

}
// 特质可以作为接口使用
// 特质可以作为抽象类使用
trait Test27 {
    // 抽象方法
    def test():Unit
    // 完整方法
    def test1(): Unit = {

    }
    // 抽象属性
    var name:String
    // 完整的属性
    val age :Int = 20
}
// 类如果混入特质，必须将其中抽象的内容补全，否则为抽象类
// 类也可以重写特质中封装的方法
class User27 extends Test27 {

    def test():Unit = {
    }
    // 重写方法
    override def test1(): Unit = {

    }
    var name:String = "zhangsan"
    // 重写属性
    override val age :Int = 20
}
