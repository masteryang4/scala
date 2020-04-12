package com.atguigu.bigdata.scala.chapter02

object Scala05_Name1 {

    def main(args: Array[String]): Unit = {
        // TODO 标识符
        // Scala基本的标识符和Java的标识符语法规则基本一致的
        val username = "zhangsan"
        val username1 = "zhangsan"
        //val 1username = "zhangsan" // Error
        val user$name = "zhangsan"
        val $username = "zhangsan"
        val user_name = "zhangsan"
        val _username = "zhangsan"
        val username_ = "zhangsan"
        val _ = "zhangsan"
        val $ = "zhangsan"
        val `private` = "lisi"
        println(`private`)

        // Scala融合多种语言的特性，其中也包含函数式处理中的符号作为标识符
//        val ! = "zhangsan"
//        //val # = "zhangsan"
//        val ## = "zhangsan"
//        val % = "zhangsan"
//        val & = "zhangsan"
//        val * = "zhangsan"
//        val ::: = "123"

    }
}
