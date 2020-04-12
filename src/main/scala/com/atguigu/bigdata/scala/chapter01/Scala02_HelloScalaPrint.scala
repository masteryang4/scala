package com.atguigu.bigdata.scala.chapter01

object Scala02_HelloScalaPrint {
    def main(args: Array[String]): Unit = {

        // Scala是完全面向对象的语言，所以摒弃了和面向对象无关的语法内容
        // TODO println
        // Scala语言是基于Java开发的，所以Java的类库在Scala程序中可以直接使用
        // System.out.println(" Hello Scala ")
        // Scala也对一些方法进行了简化，提高开发效率
        println("Hello Scala Print")
        // Java为了明确代码的关系，所以采用分号进行结尾，表示代码逻辑中止。
        // 为了查看起来更方便，一般不会将多行代码写在一行中。
        // User user = new User().createUser();
        // user.login()
        // Scala为了简化开发，如果一行代码中只有一段逻辑，那么结尾的分号可以省略，使用换行来分隔
        // 如果将多个逻辑写在一行中，那么必须使用分号分隔
        print("Hello ")
        print("Scala ")
        print("Print")
    }
}
