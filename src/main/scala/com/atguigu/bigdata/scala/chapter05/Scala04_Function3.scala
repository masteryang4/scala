package com.atguigu.bigdata.scala.chapter05

object Scala04_Function3 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程
        // TODO 参数默认值
        // 给所有的用户默认密码
        // 函数的参数默认使用val声明，无法修改

        //def f1( password:String, name:String* ): Unit = {
//            if ( password == null ) {
//                password = "000000"
//            }
//            var pswd = ""
//            if ( password == null ) {
//                pswd = "000000"
//            } else {
//                pswd = password
//            }
        //}
        // Scala中提供了参数默认值
        // 如果参数设定了默认值，那么调用函数时，可以不用传递这个参数
//        def f2( name : String, password : String = "000000" ): Unit = {
//            println( s"name = ${name}, password = ${password}" )
//        }

        // 调用函数时，如果传递了指定的参数，那么会覆盖默认值
        //f2("zhangsan", "123123")
//        f2("zhangsan")

        def f3( password:String = "000000", name:String ): Unit = {
            println( s"name = ${name}, password = ${password}" )
        }

        //f3("123123", "zhangsan")
        // 函数的参数传值方式为：从前到后，从左到右
        //f3("zhangsan")

        // TODO 带名参数
        // 传递函数参数的时候，同时指明参数的名称
        f3( name="zhangsan" )
    }
}
