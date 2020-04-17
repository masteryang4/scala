package com.atguigu.bigdata.scala.chapter07

object Scala18_Collection_Method1 {

    def main(args: Array[String]): Unit = {

        // TODO - Scala - 集合 - 常用（通用）方法

        val list = List(1,2,3,4,5,6)
        val list1 = List(4,5,6,7,8,9)

        // 获取集合部分数据的方法
        // Scala中集合使用最多的算法就是递归算法
        // 普通递归 & 尾递归

        // 获取集合的头数据
        //println(list.head)
        // 获取集合的尾数据(除了头就是尾)
        // List(2,3,4,5,6)
        //println(list.tail)
        //println(list.tails)
        // 获取集合的最后数据
       // println(list.last)
        // 获取集合的初始数据（除了最后一个就是初始数据）
        // List() => List(1) => List(1,2)
        // List(1,2,3,4,5)
        //println(list.init)
        //println(list.inits)

        // 产生新集合的方法

        // 合并集合 => 并集
        val list2: List[Int] = list.union(list1)
        //println(list2)

        // 交集
        val list3: List[Int] = list.intersect(list1)
        //println(list3)

        // 差集 = (当前集合 - 重复数据)
        val list4: List[Int] = list.diff(list1)
        //println(list4)

        // 1,2,3,4,5,6
        // 切分集合
        // List(4,5,6,7,8,9)
        // splitAt方法中的参数可以表示为切分数据的个数
        val tuple: (List[Int], List[Int]) = list1.splitAt(2)
        //println(tuple._1)
        //println(tuple._2)

        // 滑动 : 将集合中的一部分数据当成一个整体来使用，需要一个范围
        // 这个范围称之为窗口，这个窗口随着计算可以向后滑动
        // 默认情况下，滑动窗口的数据一个一个滑动的，所以可能会存在重复数据
        // 如果计算时，不想让数据有重复，那么可以让窗口滑动的幅度更大一些。
        // 一般将没有重复数据的滑动称之为叫滚动
//        val list5 = List(1,2,3,4,5,6,7,8)
//        val iterator: Iterator[List[Int]] = list5.sliding(3,3)
//        while ( iterator.hasNext ) {
//            println(iterator.next())
//        }

        // 将两个集合中相同位置的数据绑定在一起使用
        // 拉链
        // 如果两个集合中的数据的数量不一致，也可以拉链，但是拉链后数据的数量和少的那个集合数量一致
        val list5 = List(1,2,3,4)
        val list6 = List(5,6,7,8,9)
        // 1-5,2-6,3-7,4-8
        val zipList: List[(Int, Int)] = list5.zip(list6)
        //println(zipList)

        // 将集合的数据和索引形成拉链效果
        val indexList: List[(Int, Int)] = list5.zipWithIndex
        println(indexList)
    }
}

