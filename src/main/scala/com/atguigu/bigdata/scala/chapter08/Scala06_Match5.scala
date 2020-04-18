package com.atguigu.bigdata.scala.chapter08

object Scala06_Match5 {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配

        // Scala中对象的模式匹配比较繁琐，所以从语法上可以进行简化。
        // 采用样例类的语法进行替换。
        // 样例类的作用其实就是为了实现对象匹配
        val user = User("lisi",30)

        user match {
            case User("lisi", 30) => {
                println("user...")
            }
            case _ => println("other...")
        }

    }
    // 声明样例类, 在class关键字前使用case关键字
    // 1. 样例类必须显示声明参数列表
    // 2. 样例类声明的构造参数自动会变成类的属性,而且不能修改，类似于val声明属性
    //    如果想要修改参数值，那么可以将参数使用var显示声明
    // 3. 样例类会自动生成类的常用方法：copy, apply, unapply
    // 4. 样例类编译后，类自动实现可序列化接口
    // 5. 样例类的声明一般可以不使用大括号
    // 6. 样例类完全可以当成普通类使用
    case class User(var name:String, age:Int)
}
