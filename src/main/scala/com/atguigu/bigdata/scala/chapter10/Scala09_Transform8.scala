package com.atguigu.bigdata.scala.chapter10

import com.atguigu.bigdata.scala.chapter10.Scala09_Transform8.User

object Scala09_Transform8 {
    def main(args: Array[String]): Unit = {

        val user = new User()
        user.insert()
        user.update()

    }
    // 隐式类
    // 构造参数只能有一个
    // 隐式类不能是顶级的
    implicit class UserExt( user:User ) {
        def update(): Unit = {
            // update.... where id = 1
            println("update..." + user)
        }
    }
    class User {
        var id : Int = 10
        def insert(): Unit = {
            println("insert...")
        }
    }

}
