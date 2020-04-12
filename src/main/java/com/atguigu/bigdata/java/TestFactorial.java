package com.atguigu.bigdata.java;

public class TestFactorial {
    public static void main(String[] args) {

        // 阶乘
        // 5! = 5 * (4)! = 5 * 4 * (3)! = 5 * 4 * 3 * (2)! = 5 * 4 * 3 * 2 * (1)!
        // 1. 递归算法的数据处理有规律。
        // 2. 递归方法内部应该调用自身。
        // 3. 递归算法应该有跳出递归的逻辑操作
        System.out.println(factorial(5));
    }
    public static int factorial( int num ) {
        if ( num <= 1 ) {
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }
}
