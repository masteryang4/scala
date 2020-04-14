package com.atguigu.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala07_Object_Field2 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 类的属性

        // 类的属性必须显示的初始化。
        // 如果希望scala中的属性的初始化方式和java一样，那么需要使用下划线
        // val不能这么使用
        // 如果属性声明时使用private关键字，那么编译时的属性和set，get方法都是私有的。

        // Bean规范 ： 私有的属性，公共的属性的set/get方法
        // 如果想要scala中的类的属性方法复合Bean规范，需要增加的注解 : @BeanProperty
        // 编译时，会自动添加复合bean规范的set，get方法。
        val user = new User07()
        //user.setName()
        //user.getName()


    }
}

class User07 {
    // 声明类的属性（变量）
    @BeanProperty var name : String = _
    var age : Int = _
}
