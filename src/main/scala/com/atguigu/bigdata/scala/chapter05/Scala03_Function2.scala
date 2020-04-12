package com.atguigu.bigdata.scala.chapter05

object Scala03_Function2 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程
        // 函数式编程中关心的不是逻辑实现，而是功能本身（名字，参数，返回值）
        // 1. 无参，无返回值
        def f1(): Unit = {
            println("f1....")
        }
        //f1()
        // 如果函数没有参数，那么可以在调用的时候省略小括号。
        //f1

        // 2. 无参，有返回值
        def f2(): String = {
            "zhangsan"
        }

        //println(f2())
        //println(f2)

        // 3. 有参，无返回值
        def f3( name : String ): Unit = {
            println(s"name = ${name}")
        }
        // 函数有参的场合，调用时需要传递参数
        //f3("zhangsan")
        //f3

        // 4. 有参，有返回值。
        // 函数的参数使用val声明，无法进行修改
        def f4( name:String ): String = {
            return "Hello " + name
            //name = "Hello " + name
            //return name
        }

        //println(f4("zhangsan"))

        // 5. 多参，无返回值
        def f5( name:String, password:String ): Unit = {
            println(s"name=${name}, password=${password}")
        }

        //f5("zhangsan", "111111")

        // 6. 多参，有返回值
        // 函数的参数最多只能声明22个
        def f6( name1:String, name2:String ): String = {
            return name1 + "," + name2
        }

        //println( f6( "zhangsan", "lisi" ) )

        // 7. 可变参数
        def f7( name:String* ): Unit = {
            println(name)
        }
        // 无参
        //f7() // List()
        // 1个参数
        //f7("zhangsan") // WrappedArray(zhangsan)
        // 多个参数
        //f7("zhangsan", "lisi") // WrappedArray(zhangsan, lisi)

        // 可变参数一般需要声明在最后
        def f8( password:String, name:String* ): Unit = {
            println(name)
        }

//        def f88( name:String*, age:Int ): Unit = {
//
//        }
        //f88("zhangsan", 20)
        //f8("111111", "zhangsan")

    }
}
