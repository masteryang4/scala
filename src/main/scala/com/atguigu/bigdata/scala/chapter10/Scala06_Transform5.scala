package com.atguigu.bigdata.scala.chapter10

object Scala06_Transform5 {
    def main(args: Array[String]): Unit = {

        // 隐式转换一般用于功能扩展
        // 1. trait ： interface & abstract
        // 2. 隐式转换
        //   2.1 隐式函数 : 一般用于转换整个类型 A => B
        implicit def transform( user: User ): UserExt = {
            new UserExt
        }
        val user = new User
        user.update()
        //   2.2 隐式参数 & 隐式变量 : 一般应用于某个功能，而不是整个类型
        // 隐式参数在调用时，如果使用小括号，那么隐式参数是不起作用，
        // 如果想要隐式转换起作用，必须不增加小括号
        // 隐式参数优先于默认参数
        implicit val password:String = "000000"
        user.login("zhangsan")

    }
    class UserExt {
        def update(): Unit = {
            println("update...")
        }
    }
    class User {
        def login(name:String)(implicit password:String): Unit = {

        }
        def insert(): Unit = {
            println("insert...")
        }
    }
}
