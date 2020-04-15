package com.atguigu.bigdata.scala.chapter07

object Scala07_Collection_Seq1 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 序列
        // 新的对象 : Nil, 表示空集合
        // 主要用于添加数据
        //println(Nil)
        val list1 = 1::2::3::4::Nil
        // Nil.::(4).::(3).::(2).::(1)
        //println(list1.mkString(","))
        val list2 = 5::6::list1::Nil
        // 扁平化：将一个整体拆分成个体来使用。
        val list3 = 5::6::list1:::Nil
        println(list2.mkString(","))
        println(list3.mkString(","))
    }
}

