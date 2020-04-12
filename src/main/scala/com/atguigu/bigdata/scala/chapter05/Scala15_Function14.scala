package com.atguigu.bigdata.scala.chapter05

object Scala15_Function14 {

    def main(args: Array[String]): Unit = {

    }

    def test(): Unit = {
        println("zzzzz")
        test()
    }
    def test1(): Unit = {
        test1()
        println("zzzzz")

    }
}
