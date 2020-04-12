package com.atguigu.bigdata.scala.chapter02

import java.io.{File, PrintWriter}

import scala.io.Source

object Scala10_Output {

    def main(args: Array[String]): Unit = {

        // TODO Scala 输出
        // Scala中的输入其实使用的就是java的输出
        val writer = new PrintWriter(new File("out.log"))
        writer.write("Hello Scala")
        writer.flush()
        writer.close()

    }
}
