package com.atguigu.bigdata.scala.chapter02

import scala.io.Source

object Scala09_Input1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 输入

        // 从文件中获取输入数据
        // 文件路径可以为绝对路径：c:\test
        // 文件路径可以为相对路径：input/word.txt
        // Scala使用IDEA开发时，相对文件路径是以project的根目录为基准进行查找的。
        val lines: Iterator[String] = Source.fromFile("input/word.txt").getLines()
        while ( lines.hasNext ) {
            println(lines.next())
        }

    }
}
