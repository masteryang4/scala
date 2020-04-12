package com.atguigu.bigdata.java;

public class TestAddAdd {
    public static void main(String[] args) {

        // ++ 运算符
        // Scala中没有 ++ 运算符，因为有歧义
//        byte b = 10;
//        b++;
//        System.out.println(b);
//        int i = 1;
//        int j = i++;
//        System.out.println("i = " + i + ", j = " + j);

        int i = 1;
        i = i++;
        // 先赋值， 再运算。（OK）
        // i++不是原子性，分多个步骤
        //    1. 赋值给临时变量：_a = 1， 2. 运算 i+1 = 2, 3. 将临时变量赋值给等号左边
        // 赋值运算符：将等号右边的计算结果赋值给左边
        System.out.println("i = " + i);
    }
}
