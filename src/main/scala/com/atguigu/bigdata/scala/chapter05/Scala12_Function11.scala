package com.atguigu.bigdata.scala.chapter05

object Scala12_Function11 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 递归函数
        // 阶乘 => 5!
        // 一个大于1的数的阶乘等于这个数乘以它减一的阶乘

        // 1. 递归算法的数据处理有规律。
        // 2. 递归方法内部应该调用自身。
        // 3. 递归算法应该有跳出递归的逻辑操作
        // 4. 递归方法应该明确返回值类型
        def factorial( num:Int ):Int = {
            if ( num <= 1 ) {
                1
            } else {
                num * factorial(num-1)
            }
        }

        println(factorial(5))
    }
}
