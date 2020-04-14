package com.atguigu.bigdata.scala.chapter06

object Scala18_Object_Instance7 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 构建对象
        // 构造方法传参的目的一般是将外部的变量数据传递给对象的内部使用
        // 将外部的数据值传递给类的内部属性那么需要使用不同名称
        // 如果想要属性和参数保持一致，只声明一次。可以在参数前加上关键字:var|val
        // 如果参数声明前增加var|val关键字，那么编译器会自动将这个参数作为类属性声明
        val user = new User18("zhangsan", 20)

        user.name

    }

    class User18(var name:String, val age:Int) {

    }
}
