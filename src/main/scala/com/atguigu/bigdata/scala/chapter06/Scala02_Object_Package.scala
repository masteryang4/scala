package com.atguigu.bigdata.scala.chapter06

package object test {
    val name : String = "zhangsan"
    def test(): Unit = {

    }
}
package test {
    class Student {

    }
    package test1 {
        object Scala02_Object_Package {

            def main(args: Array[String]): Unit = {

                // TODO Scala 面向对象编程 - 包
                // Java中的包和scala中的包表示的含义是相同
                // Java 中包的作用：
                // 1. 管理类。
                // 2. 区分相同名称的类
                //    DateSql, DateUtil
                //    SparkContext
                //    KafkaProducer
                //    FlinkKafkaConsumer
                // 3. 访问权限
                // java中的package的使用比较鸡肋，scala有package的语法，给package语法提供了更多的功能和扩展。
                // 1. 包名
                //    域名反写 + 项目名称 + 模块名称 + 程序类型的名称
                //    com.atguigu.scala.module.controller
                //    c.a.s.m.controller
                // 2. 包和类路径的关系
                //    Scala中源码程序的路径和包路径没有关系。
                // 3. package关键字可以在源码中多次声明
                //    这里的package才是真正说明包
                //    package test
                //    package test1
                // 4. package关键字可以嵌套使用,声明作用域
                //    子包中可以直接访问父包中的内容，无需导入
                // 5. Scala是一个完全面向对象的语言
                //    Scala将包也当成一个对象来使用
                //    默认情况下，scala中的包和java的包是一致的。
                //    如果想要package也当成对象来使用，那么需要使用特殊的方式：包对象
                //    package object 包对象名称 {
                //    }
                //    子包中的类可以直接访问父包对象中的属性和方法
                //println("xxxx")
                //println(new Student())
                //println(name)
                //Student()
            }
        }
    }
}


