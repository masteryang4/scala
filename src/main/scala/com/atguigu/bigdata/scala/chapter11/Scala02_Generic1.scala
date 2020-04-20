package com.atguigu.bigdata.scala.chapter11

object Scala02_Generic1 {

    def main(args: Array[String]): Unit = {

        // 泛型的边界
//        test[User]( new Parent() )
//        test[User]( new User() )
//        test[User]( new SubUser() )
    }
    def test[A](a:A): Unit = {
        println(a)
    }

    class Parent {

    }
    class User extends Parent{

    }
    class SubUser extends User {

    }
}
