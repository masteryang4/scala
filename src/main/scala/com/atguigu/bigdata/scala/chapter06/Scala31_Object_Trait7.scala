package com.atguigu.bigdata.scala.chapter06

object Scala31_Object_Trait7 {
    def main(args: Array[String]): Unit = {

        // 功能叠加
        // 调用相同功能时，存在一个功能叠加的概念，执行时从右向左
        // 1. 执行顺序?
        //   log => db => op
        // 2. 打印内容?
        // TODO Scala中特质叠加的时候，super关键字会被编译器编译为方法名的一部分
        //
        // TODO 特质
        // 1. 初始化顺序
        //    父特质 => 左边的特质 => 右边的特质
        // 2. 功能（相同的功能）执行的顺序
        //    右边特质的功能 => 左边特质的功能 => 父特质
        // 3. super关键字在特质的场合中不是表示上一级特质，而是上一个特质
        //    如果想要改变功能的执行顺序，那么需要使用特殊方式:super[指定特质名称]
        val mysql = new MySQL()
        mysql.dataOper()
    }
}
trait Oper {
    def dataOper(): Unit = {
        println("操作数据")
    }
}
trait DB extends Oper {
    override def dataOper(): Unit = {
        print("向数据库中")
        super.dataOper()
    }
}
trait Log extends Oper {
    override def dataOper(): Unit = {
        print("向日志文件中")
        super[Oper].dataOper()
    }
}
class MySQL extends DB with Log{

}