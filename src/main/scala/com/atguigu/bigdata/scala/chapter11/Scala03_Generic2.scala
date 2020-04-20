package com.atguigu.bigdata.scala.chapter11

object Scala03_Generic2 {

    def main(args: Array[String]): Unit = {

        // 泛型的边界
        val parent : Parent = new Parent()
        val user : User = new User()
        val sub : SubUser = new SubUser()

//        test1[Parent]( parent )
//        test1[User]( user )
//        test1[SubUser]( sub )
//
//        test2[Parent]( parent )
//        test2[User]( user )
//        test2[SubUser]( sub )
    }
    // 泛型的上限
    def test1[A<:User](a:A): Unit = {
        println(a)
    }

    // 泛型的下限
    def test2[A>:User](a:A): Unit = {
        println(a)
    }

    class Parent {

    }
    class User extends Parent{

    }
    class SubUser extends User {

    }
}
