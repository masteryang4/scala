package com.atguigu.bigdata.scala.chapter11

object Scala04_Generic3 {

    def main(args: Array[String]): Unit = {
        val parent : Parent = new Parent()
        val user : User = new User()
        val subuser : SubUser = new SubUser()
//        test[Parent](parent) // OK
//        test[User](user)   // OK
//        test[SubUser](subuser) // Error
    }
    // 泛型下限，使用 >:, 可以理解为类型的范围更大
    def  test[A>:User]( a : A ): Unit = {
        println(a)
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
}
