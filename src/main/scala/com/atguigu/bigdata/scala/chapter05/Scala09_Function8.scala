package com.atguigu.bigdata.scala.chapter05

object Scala09_Function8 {

    def main(args: Array[String]): Unit = {

        // test(10)(20)(_+_) => 30
        // test(10)(20)(_*_) => 200
        // test(10)(20)(_-_) => -10
        // 1. 需要3个嵌套函数
        // 2. test应该是最外层的函数名
        // 3. 结果应该是最内层函数的结果
        def test(i:Int) = {
            def fun1(j:Int) = {
                def fun2( f : (Int, Int)=> Int ): Int = {
                    f( i, j )
                }

                fun2 _
            }

            fun1 _
        }

        println(test(10)(20)(_ * _))
    }
}
