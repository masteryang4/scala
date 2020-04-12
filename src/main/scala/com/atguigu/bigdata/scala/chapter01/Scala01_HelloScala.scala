package com.atguigu.bigdata.scala.chapter01


object Scala01_HelloScala {
    def main(args: Array[String]): Unit = {

        // Scala是完全面向对象的语言，所以摒弃了和面向对象无关的语法内容
        /*
           java code:
           public class Test {
               public static void main( String[] args ) {

               }
           }
           java Test
         */
        // TODO =
        // 将代码逻辑进行封装赋值给方法。体现了访问统一性

        // TODO Unit
        // java中void关键字不是面向对象的语法内容，所以在scala中是没有的
        // Scala提供类Unit类型来代替void，模拟无返回值的场合。
        // 方法名（参数列表）：方法返回值类型

        // TODO args: Array[String]
        // 参数列表中的参数, 在main方法中只有有一个参数
        // java  : String[] args
        // scala : args: Array[String]
        // java强类型语言，静态类型语言，所以强调的就是类型
        // scala函数式编程语言看重的是变量的名称，而不是类型，所以名称放前，类型置后。
        //      名称和类型之间使用冒号分隔开。
        // String 表示字符串
        // java中的中括号表示数组。scala中的中括号表示泛型
        // Array在scala中表示数组类型


        // TODO main
        // 表示scala语言的入口main方法。

        // TODO def
        // 英文单词defind的缩写，表示声明一个方法。

        // TODO object
        // java中要想执行一个java的类？
        // 如果scala中的类想要通过名称访问方法，那么必须创建一个使用object关键字声明的特殊的对象
        // 这个对象的名称和类名保持一致，所以可以通过对象访问方法。
        // 用这种方式来模拟java中的静态语法。
        // 我们一般将使用object关键字声明的类称之为伴生对象，是单例的。
        // User user = new User();
        // user.login();


        System.out.println(" Hello Scala ")
    }
}
