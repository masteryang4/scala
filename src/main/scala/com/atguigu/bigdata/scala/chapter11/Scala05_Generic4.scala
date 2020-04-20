package com.atguigu.bigdata.scala.chapter11

object Scala05_Generic4 {

    def main(args: Array[String]): Unit = {
        val parent : Parent = new Parent()
        val user : User = new User()
        val subuser : SubUser = new SubUser()
//        test[Parent](parent) // error
//        test[User](user)   // OK
//        test[SubUser](subuser) // OK
    }
    // 泛型上限，使用 <:, 可以理解为类型的范围更小
    def  test[A<:User]( a : A ): Unit = {
        println(a)
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
}
