package com.atguigu.bigdata.scala.chapter10

object Scala05_Transform4 {
    def main(args: Array[String]): Unit = {

        // 功能扩展
//        def insertUser( name:String, implicit password:String = "123123" ): Unit = {
//            println(s"name=$name, password=$password")
//        }

        // 隐式参数
        def insertUser( implicit password:String = "123123" ): Unit = {
            println("password = " + password)
        }

        // 隐式变量
        implicit  val pswd1 : String = "000000"
        implicit  val pswd2 : String = "000000"

        // 当使用隐式变量扩展功能时，不能使用括号
        //insertUser

        // 函数柯里化
        // 函数柯里化使用较多的场合就是隐式转换
        // 因为隐式转换参数要求必须只能有一个参数
        def test( i:Int, j:Int ): Unit = {
            i + j
        }
        def test1(i:Int)(implicit j:Int): Unit = {
            i + j
        }

        List(1,2,3,4).sortBy(num=>num)

    }
}
