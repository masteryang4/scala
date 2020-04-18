package com.atguigu.bigdata.scala.chapter08

import com.atguigu.bigdata.scala.chapter08.Scala05_Match4.User

object Scala05_Match4 {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配 - 匹配对象
        // 普通的对象无法进行模式匹配
        // Scala中匹配对象其实不是匹配对象的内存地址，而是对象的属性是否能够符合
        // 如果想要对象进行匹配，那么必须对象要重写unapply方法

        // 程序在执行模式匹配的时候，会将当前用于匹配的对象自动调用unapply方法，并传递当前对象
        // 如果对象存在，那么将对象的属性进行封装返回。
        // 和指定的分支数据进行判断，如果判断成功，那么执行相应的逻辑
        val user1 = new User("zhangsan", 30)
        val user2 = User("zhangsan", 30)
        // 判断你对象是否为某个对象
        user2 match {
            case User("lisi", 40) => {
                println("user is user")
            }
            case _ => {
                println("other object...")
            }
        }

    }

    class User( val name:String, val age:Int )
    object User {
        // param => object
        def apply (name:String, age:Int) = new User(name, age)
        // object => param
        def unapply(arg: User): Option[(String, Int)] = {
            if ( arg == null ) {
                None
            } else {
                Some( ( arg.name, arg.age ) )
            }
        }
    }
}
