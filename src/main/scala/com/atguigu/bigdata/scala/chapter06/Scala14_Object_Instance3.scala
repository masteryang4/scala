package com.atguigu.bigdata.scala.chapter06

object Scala14_Object_Instance3 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 构建对象

        // 构建对象，传递参数

        // 声明多个构造方法
        // Scala中类声明构造方法使用特殊关键字:this
        // def this() {}
        // Scala的构造方法分为两大类
        // 1. 主构造方法 : 类后面的参数列表就是主构造方法
        //                 因为可以完成类的初始化操作
        // 2. 辅助构造方法 ：使用this声明的构造方法就是辅助构造方法
        //                 无法直接构造对象，因为无法完成类的初始化
        //                 一般在使用时，需要直接或间接地调用主构造方法

        // Scala中的辅助构造方法可以多次声明
        // 辅助构造方法在互相调用时，必须保证已经声明过
        val user1 = new User14("zhangsan")
        val user2 = new User14()
        val user3 = new User14(20)

    }
    // 主构造方法
    class User14(name:String) {
        // 辅助构造方法
        def this() {
            // 直接或间接调用主构造方法
            this("zhangsan")
        }
        def this( age : Int ) {
            this()
        }

    }
}
