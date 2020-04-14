package com.atguigu.bigdata.scala.chapter06

object Scala06_Object_Field1 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 类的属性

        // TODO 在类中的声明属性，其实并不是声明属性。而是声明方法
        //    1. 在编译时，编译器会将类的属性自动编译为类的私有属性。
        //    2. 编译的同时，编译器会给这个属性同时编译出两个公共的set/get方法
        //       public String 属性名() { return this.属性名; }
        //       public void 属性名_$eq(String x$1) { this.属性名 = x$1; }
        //   3. 如果属性使用val声明，那么属性值一旦初始化后无法改变
        //      编译器在编译时，val的属性会自动添加final关键字，而且没有提供对应的set方法
        val user = new User06()
        //println(user.name) // 等同于调用了属性的get方法
        //user.name = "lisi"   // 等同于调用属性的set方法
        //println(user.age)
        //user.age_$eq(20)


    }
}

class User06 {
    // 声明类的属性（变量）
    var name : String = "zhangsan"
    val age : Int = 20
}
