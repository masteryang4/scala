package com.atguigu.bigdata.scala.chapter11

object Scala01_Generic {

    def main(args: Array[String]): Unit = {

        // 默认情况下，Scala中的泛型和java一样是不可变的
        // scala中的泛型在java的基础上进行了扩展
        val test : Test[User] = new Test[Parent]()
        val test1 : Test[User] = new Test[User]()
        //val test2 : Test[User] = new Test[SubUser]()

        println(test)
    }
    // Scala中泛型采用中括号声明
    // 泛型不可变：
    //class Test[T] {
    // 泛型的协变 ： 当前类型和子类型可用
    //class Test[+T] {
    // 泛型的逆变 ： 当前类型和父类型可用
    class Test[-T] {


    }
    class Parent {

    }
    class User extends Parent{

    }
    class SubUser extends User {

    }
}

