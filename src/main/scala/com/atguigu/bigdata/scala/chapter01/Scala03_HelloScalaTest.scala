package com.atguigu.bigdata.scala.chapter01

object Scala03_HelloScalaTest {
    def main(args: Array[String]): Unit = {
        // println方法是Scala默认提供的打印方法
        // 如果我们自己声明了一个完全一样的方法，
        // 那么执行时，会执行我们声明的方法，而不是默认的打印方法
        // 如果想要明确使用Scala所提供的打印方法，那么必须采用对象.方法的方式来调用。
        // 默认情况下，如果访问方法时没有指明对象，那么会默认在当前对象中查找
        //  如果没有找到的情况下，会从scala的Predef对象中进行查找。
        Scala03_HelloScalaTest.println("Hello Scala")
        Scala03_HelloScalaTest.test()

        Predef.println("Hello Scala Predef")
    }
    def println( s : String ): Unit = {

    }
    // 声明一个方法
    def test():Unit = {
        println("Test...")
    }
}
