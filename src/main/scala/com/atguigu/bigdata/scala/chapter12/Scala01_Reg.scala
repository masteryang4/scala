package com.atguigu.bigdata.scala.chapter12

import scala.util.matching.Regex

object Scala01_Reg {

    def main(args: Array[String]): Unit = {

        // 正则表达式 - 规则
        //val pattern = "hello".r
        val pattern = "(H|h)ello".r

        val s = "helloworldhello"

        val maybeString: Option[String] = pattern.findFirstIn(s)
//        if ( maybeString.isEmpty ) {
//
//        }
        println(maybeString.getOrElse(""))

        val iterator: Regex.MatchIterator = pattern.findAllIn(s)
    }
}
