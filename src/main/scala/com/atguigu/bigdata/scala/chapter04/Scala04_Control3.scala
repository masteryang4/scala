package com.atguigu.bigdata.scala.chapter04

object Scala04_Control3 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 流程控制
        val age : Int = 60
        val result = if ( age < 18 ) {
            println("少年") // Unit
        } else if ( age < 36 ) {
            println("青年")// Unit
        } else if ( age < 55 ) {
            println("壮年")// Unit
        } else {
            //println("老年")// Unit
            "老年"
        }

        println("result = " + result)

    }
}
