package com.atguigu.bigdata.java;

public class TestThreadSafe {
    public static void main(String[] args) throws Exception {

        UserX user = new UserX();

        // 线程安全问题
        Thread t1 = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    user.name = "zhangsan";
                    try {
                        Thread.sleep(1000);
                    } catch ( Exception e ) {
                        e.printStackTrace();
                    }
                    System.out.println(user.name);
                }
            }
        );
        Thread t2 = new Thread(
            new Runnable() {
                @Override
                public void run() {
                   // t1.join();
                    user.name = "lisi";
                    try {
                        Thread.sleep(1000);
                    } catch ( Exception e ) {
                        e.printStackTrace();
                    }
                    System.out.println(user.name);
                }
            }
        );

        t1.start();
        t2.start();

        System.out.println("main");

    }
}
class UserX {
    public String name;
}
