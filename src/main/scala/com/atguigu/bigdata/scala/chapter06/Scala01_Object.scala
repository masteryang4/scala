package com.atguigu.bigdata.scala.chapter06
// TODO Scala - 面向对象编程
/*
Java Code:
package com.atguigu.java

import java.util.*


class User extends Parent implements Test{
    private String name = "zhangsan";

    public String getName() {
        return name;
    }
}
class Parent {

}
interface Test {

}
 */
object Scala01_Object {

    def main(args: Array[String]): Unit = {

        // TODO Scala 创建类的对象
        val user = new User()
        println(user)
    }
}
// TODO Scala 声明类
class User extends Parent{

}
class Parent {

}
