package com.atguigu.bigdata.scala.chapter06

object Scala15_Object_Instance4 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 构建对象
        // 父类构造方法
        val user = new User15("zhangsan")
        // 子类在构造对象时，会默认调用父类的无参构造方法
        // 父类的构造方法有参, 构造对象时，必须先调用有参构造方法
    }

    class Person15(name:String) {

    }
    // super(name)
    class User15(name:String) extends Person15(name){

        def this( ) {
            this("lisi")
        }
    }
}
