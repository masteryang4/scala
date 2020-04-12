package com.atguigu.bigdata.scala.chapter02

object Scala04_Variable2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala是一个完全面向对象的语言。
        // 但是更侧重于功能使用, 所以我们一般声明变量采用的关键字为val
//        var name1 : String = "zhangsan"
//        val name2 : String = "lisi"
//        name1 = "zhangsan1"
//        name2 = "lisi1"
        // 如果变量的类型可以通过取值自动推断出来，那么类型可以省略。提高开发效率
        // 自动推断类型是没有多态概念，是什么类型就声明什么类型
          //val abc:String = "abc"
          val abc1 = "abc"
        val value: String = "123"
    }
}
