package com.atguigu.bigdata.scala.chapter07

import scala.collection.immutable.HashSet

object Scala02_Collection_Array {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 数组
        // 所谓的不可变，指的是对象的内存地址不可变，但是内容是可以变。

        // 如何构建数组
        // Scala中Array表示数组
        // java : int[] ints = new int[3]
        // 声明数组，指定类型(泛型)
        // scala中采用中括号声明泛型
        // {},[]
        // 编译时，自动编译为java的数组
        // int[] ints = new int[3]
        val array = new Array[Int](3)

        // 如何操作数组
        // java : ints[0] = 10, sout( ints[0] )
        // 给数组中某一个位置进行赋值。
        // 数组使用小括号加索引的方式代替java中的中括号索引访问
        // scala中数组的索引范围和java是一致的 0 - (length-1)
        array( 0 ) = 10
        array( 1 ) = 20
        array( 2 ) = 30
        //array( 3 ) = 40

        // 更新数组的数据
        // Scala集合的update方法可以等同于通过索引进行访问
        //array( 1 ) = 50
        //array.update(1, 50)

        // 向数组中添加新的值
        //array.+: 1
        // Scala中Array是不可变数组，如果想要添加新的数据，那么会产生新的集合s
        // 向数组的末尾添加数据
        val ints1: Array[Int] = array.:+(40)
        //array :+ 40
        // 向数组的开始添加数据
        val ints2: Array[Int] = array.+:(40)
        // TODO Scala中如果运算符使用冒号结尾，那么运算规则为从右向左
        //array +: 40 => 40.+:(array)
        //40 +: array // => array.+:(40)
        // 添加多个数据
        val ints3: Array[Int] = array ++ ints2

        //println(array e q ints)

        // 获取数组中某一个位置的值。
        //println(array( 1 ))zhong
        // 获取数组所有的值
        println( array.mkString(", ") )
        println( ints1.mkString(", ") )
        println( ints2.mkString(", ") )
        println( ints3.mkString(", ") )
    }
}
