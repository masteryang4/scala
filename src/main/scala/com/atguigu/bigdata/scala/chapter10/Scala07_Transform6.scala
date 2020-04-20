package com.atguigu.bigdata.scala.chapter10

object Scala07_Transform6 {
    def main(args: Array[String]): Unit = {

        def test( implicit name:String = "zhangsan" ): Unit = {
            println("name = " + name)
        }

        //implicit val name:String = "lisi"
        // 隐式参数不起作用
        //test()
        // 隐式参数起作用
        // 隐式参数 => 默认参数
        test

    }

}
