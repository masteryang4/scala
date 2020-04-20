package com.atguigu.bigdata.scala.chapter10

import com.atguigu.bigdata.scala.chapter10.Scala10_Transform9.User

object Scala10_Transform9 extends ParentTest{
    def main(args: Array[String]): Unit = {

        // 隐式转换规则
        // 隐式转换需要在当前作用域中可以找到
        // 当前作用域的父类，特质，包对象都可以查找隐式转换
        // 如果在指定的作用域中查找不到隐式转换规则，可以通过import的方式进行导入
        import com.atguigu.bigdata.scala.chapter09._
        val user = new User()
        user.insert()
        user.update()

    }

    class User {
        var id : Int = 10
        def insert(): Unit = {
            println("insert...")
        }
    }
}
trait Test10 {

}
class ParentTest {

}
object ParentTest {

}
object Test10 {

}
