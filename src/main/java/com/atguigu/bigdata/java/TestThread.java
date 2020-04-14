package com.atguigu.bigdata.java;

public class TestThread {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread();
        Thread t2 = new Thread();

        // 字体不一样
        // sleep方法和wait方法的区别在于静态和成员
        // 静态方法， 休眠的线程不是t1, 当前运行的线程main
        Thread.sleep(1000);
        // 成员方法, 等待的线程就是t2
        t2.wait(1000);

    }
}
