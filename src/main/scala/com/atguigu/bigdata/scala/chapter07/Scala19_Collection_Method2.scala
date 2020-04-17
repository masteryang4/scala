package com.atguigu.bigdata.scala.chapter07

object Scala19_Collection_Method2 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 常用（通用）方法
        // 计算数据
        val list = List(1,2,3,4,5)

        // 求和
        //println(list.sum) // 4=>1
        // 求最大值
        //println(list.max)
        // 求最小值
        //println(list.min)
        // 求乘积
        //println(list.product)

        // 简化，规约
        // 将集合数据通过指定的规则进行计算，获取最终的结果
        // 将指定的计算规则传递给reduce方法，在处理过程中，会按照规则进行算
        // 集合中的第一条数据是不会参数reduce计算
        def test( i:Int, j:Int ): Int = {
            println(i + "+" + j)
            i + j
        }
//        val i: Int = list.reduce(test)
//        val i: Int = list.reduce((i:Int,j:Int)=>{i+j})
//        val i: Int = list.reduce((i,j)=>{i+j})
//        val i: Int = list.reduce((i,j)=>i+j)
//        val i: Int = list.reduce((i,j)=>i+j)
//        val i: Int = list.reduce(_-_)
        //println("i = " + i)

        // TODO reduce底层实现源码就是reduceLeft
        // reduce计算规则： （A1, A1） => A1
        // 数据类型和结果类型保持一致
        //list.reduce()
        // TODO reduceLeft计算规则： （B, A） => B
        // 结果类型应该和参与运算的第一个数据的类型保持一致
        // 第一个数据的类型和第二个数据类型之间应该有关系
        //val i: Int = list.reduceLeft(_ - _)
        // TODO reduceRight计算规则： （A, B） => B
        // reduceRight底层先反转数据后将参数进行交换后再调用reduceLeft
        // 源码：reversed.reduceLeft[B]((x, y) => op(y, x))
        // 1，2，3，4，5
        // 5，4，3，2，1
        // 4 - 5 => -1
        // 3 -(-1) => 4
        // 2 - 4 => -2
        // 1 - (-2) => 3
        val i: Int = list.reduceRight(_-_)
        // 如何区分reduceRight和reduceLeft? 加括号
        // reduceLeft ： （（（（1+2）+3）+ 4）+ 5）
        // reduceRight ： （1-（2-（3-（4-5））））
        println(i)
    }
}

