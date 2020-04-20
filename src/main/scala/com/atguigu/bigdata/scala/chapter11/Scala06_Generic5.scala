package com.atguigu.bigdata.scala.chapter11

object Scala06_Generic5 {

    def main(args: Array[String]): Unit = {
        // 在某些情况下，处理的数据需要指定的类型才可以访问
        // 那么就需要泛型和隐式转换相结合
//        def f[A : Test](a: A) = println(a)
//        // A:Test => Test[A]
//        //implicitly
//
//        implicit val test : Test[User] = new Test[User]
//
//        // 如果在程序调用时，出现。。。的错误，那么表示隐式参数没有提供
//        f( new User() )
        //List(1,2,3,4).reduce()
        //List(1,2,3,4).sortBy().reduceLeft()

    }
    class Test[T] {
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
}
