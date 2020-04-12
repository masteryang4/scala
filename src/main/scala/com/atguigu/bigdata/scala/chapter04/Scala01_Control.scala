package com.atguigu.bigdata.scala.chapter04

object Scala01_Control {
    def main(args: Array[String]): Unit = {

        // TODO Scala 流程控制

        // 单分支
        //
        val name = "zhangsan"
//        if ( name == "zhangsan" ) {
//            println("name is zhangsan")
//        }
        // java中的双等号表示值是否相等，如果是引用类型，那么引用类型的值
        // java中一般字符串的比较都是使用equals,而不是使用双等号

        // scala语言中的双等号其实是比较字符串的内容
        //if ( name == new String("zhangsan") ) {
        //if ( name.equals(new String("zhangsan")) ) {
        // scala语言中的eq其实是比较字符串的地址
        // eq在编译后其实就是java中的双等号
        if ( name eq new String("zhangsan") ) {
            println("name is zhangsan")
        }

    }
}
