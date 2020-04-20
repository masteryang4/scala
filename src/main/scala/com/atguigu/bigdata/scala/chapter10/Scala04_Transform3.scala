package com.atguigu.bigdata.scala.chapter10

object Scala04_Transform3 {
    def main(args: Array[String]): Unit = {

        // Scala - 隐式转换 - 扩展功能
        // 所谓的隐式转换，其实就是自动类型转换
        // 一个函数如果使用implicit关键字修饰，那么这个函数就称之为隐式转换函数
        implicit def transform (user:User): UserExt = {
            new UserExt
        }

        val user = new User()
        user.insertUser()
        // 隐式转换的时间，在编译出现错误的时候
        user.removeUser()

    }
    class UserExt {
        def removeUser(): Unit = {
            println("remove user...")
        }
    }
    class User {
        def insertUser(): Unit = {
            println("insert user...")
        }
//        def removeUser(): Unit = {
//            println("remove user...")
//        }
    }
}
