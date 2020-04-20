package com.atguigu.bigdata.scala.chapter10

object Scala08_Transform7 {
    def main(args: Array[String]): Unit = {

        implicit def transform( user:User ): UserExt = {
            new UserExt(user)
        }

        val user = new User()
        user.insert()
        user.update()

    }
    class UserExt( user:User ) {
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
