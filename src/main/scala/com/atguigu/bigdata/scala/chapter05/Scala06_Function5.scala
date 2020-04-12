package com.atguigu.bigdata.scala.chapter05

object Scala06_Function5 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 地狱般
        // TODO 1. 将函数赋值给变量
        // 声明函数
        def f1(name:String): Unit = {
            println("name = " + name);
        }
        // 将函数赋值给变量
        // 变量的类型就是函数类型
        //val v1 = f1
        //val v1 = f1()
        // 在当前场合下，不执行函数，而是把函数作为一个整体赋值给变量，
        // 可以采用特殊符号 ： 下划线
        //val v1 = f1 _

        // 如果不想使用下划线将函数作为整体使用，也可以明确变量类型
        // 函数类型：(参数类型1,参数类型2)=>返回值类型
        //val v2 : String=>Unit = f1

        // 调用变量
        //v1("zhangsan")
        //v2("lisi")

        // TODO 2. 将函数作为参数来使用
        // 等同于传递逻辑
        def f2( i:Int, j:Int ) : Int = {
            i + j
        }

        def f222(i:Int, j:Int): Int = {
            i * j
        }

        def f2222(i:Int, j:Int): Int = {
            i - j
        }

        def f22( f : (Int, Int)=>Int ): Int = {
            f( 10,20 )
        }
        //println(f2(10, 20))
        //println(f22(f2222))
        // 如果函数参数的类型不匹配，那么不能传递
        //println(f22(f1))
        // 使用匿名函数作为参数
        // 一般情况下，匿名函数就是在函数作为参数的时候使用
        f22( (a:Int, b:Int) => { a + b } )
        // 匿名函数也可以简化
        // 1. 如果函数体只有一行，可以省略花括号
        f22( (a:Int, b:Int) => a + b )
        // 2. 函数的参数类型可以推断出来的场合，参数类型可以省略
        f22( (a, b) => a + b )
        f22( (a, b) => b - a )
        // 3. 如果函数逻辑中，只使用了参数一次，那么可以使用下划线来代替参数
        // 第一个下划线表示第一个参数，第二个下划线表示第二个参数
        // 使用下划线来代替参数，应该遵循参数的顺序
        //println(f22(_ - _))
        // sql : name like '_a_'

        // TODO 3. 将函数作为返回值来使用
//        def f3( i:Int ): Int = {
//            i * 2
//        }

//        def f33() = {
//            // 将函数作为一个整体返回
//            // 使用下划线将函数作为一个整体返回
//            f3 _
//        }

//        def f33(): Int=>Int = {
//            // 如果不想使用下划线将函数作为整体返回。
//            // 那么可以明确外部函数的返回值类性为函数类型
//            f3
//        }
        //println(f3(20))
        //val v3 = f33()
        //println(v3(10))
        // 为了简化使用，可以将返回值的函数直接调用
        //println(f33()(20))

        def f3() = {
            def f33( i:Int ): Int = {
                i * 20
            }
            f33 _
        }

        println(f3()(20))

    }
}
