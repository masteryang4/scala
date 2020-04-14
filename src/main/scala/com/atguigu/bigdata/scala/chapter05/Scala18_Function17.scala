package com.atguigu.bigdata.scala.chapter05

object Scala18_Function17 {

    def main(args: Array[String]): Unit = {

        // test(10)(_+_)(10) = 20
        def test(i:Int) = {
            def fun1( f:(Int, Int)=>Int ) = {
                def fun2(j:Int): Int = {
                    f( i, j )
                }
                fun2 _
            }
            fun1 _
        }

        println(test(10)(_ + _)(10))
    }
}
