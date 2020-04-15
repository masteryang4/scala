package com.atguigu.bigdata.scala.chapter06

object Scala35_Object_Thread {

    def main(args: Array[String]): Unit = {

        val t1 = new Thread(
            new Runnable {
                override def run(): Unit = {

                }
            }
        )
        t1.start()

    }
}