package com.atguigu.bigdata.scala.chapter05

object Scala05_Function4 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 噩梦版
        // 增加难度，简化函数的使用方式
        // 至简原则：能省则省
        // 完整函数 => 简化 => 完整函数

        // 函数可以使用最后一行代码作为函数返回值
        // TODO 1.  return关键字可以省略
        def f1(): String = {
            //return "zhangsan"
            "zhangsan"
            null
        }

        def f11() = {
            val age = 20
            if ( age == 20 ) {
                "zhangsan"
            } else {
                30
            }
        }

        //println( f1() )

        // TODO 2. 如果函数体中的代码只有一行，那么可以省略花括号
        def f2(): String = "lisi"
        // 如果函数的参数列表是无参的，那么调用时可以省略小括号
        //println( f2 )
        //println( f2() )

        // TODO 3. 如果函数声明中没有参数，那么参数列表的小括号可以省略
        def f3 : String = "wangwu"
        //val name : String = "zhangsan"
        // 如果函数省略了参数列表，那么调用时不能增加小括号
        // 为了访问一致性
        //println( f3() ) // Error
        //println( f3 ) // OK

        // TODO 4. 如果函数的返回值类型能够推断出来，那么也可以省略
        def f4 = "zhaoliu"

        //println( f4 )

        // TODO 5. 如果函数只关心调用，而不关心名称，那么def关键字和函数名可以省略
        // 如果函数没有def关键字和函数名，那么称之为匿名函数
        // 小括号表示参数列表，不能省略， => 表示指向函数体
        // 如果匿名函数想要调用，必须有名称,可以将匿名函数赋值给变量进行调用
        val t = () => {println("no method name")}
        //t()

        // TODO 6. 等号也可以省略
        // 如果省略返回值类型，那么编译器会将函数体的最后一行代码最为返回值
        // 如果函数体中明确使用return关键字，那么返回值类型不能省略
        // 如果函数明确声明Unit，那么即使函数体中有return语法也不起作用。
        // 如果函数想要无返回值，但是又想省略Unit类型，那么可以使用省略等号的方式
        // 将没有返回值类型和等号的函数称之为过程函数
        //def f6():Unit = {
        def f6() {
            return "zhangsan"
        }

        println(f6())
    }
}
