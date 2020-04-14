package com.atguigu.bigdata.scala.chapter06

object Scala23_Object1 {
    def main(args: Array[String]): Unit = {

        // Hibernate
        // TODO - 面向对象编程 - 单例
        // 1. 将类的构造方法私有化 : 将private关键字声明在类参数列表的前面
        //    无法在类的外部创建类的对象
        //val user = new User23()
        // 2. 在伴生对象中创建一个公共的方法，用于返回单例对象。

        // 3. 伴生对象本身就是单例对象，所以如果属性是对象，直接创建时其实就是单例的。
//        val user1 = User23.user
//        val user2 = User23.user
//        val user3 = User23.user
//        println(user1 == user2)
        // 4. 如果类的构造方法私有化，那么可以采用伴生对象来构建对象
        // 通过方法构建对象不是很方便，并且有歧义。所以编译器可以简化这个调用的过程
        // 如果方法名叫apply方法，那么就可以省略方法名称
        //User23.apply()
        //val user2 = User23()
        //println(user2)

        // 5.  构造对象的两种方式
        // 5.1  使用new关键字构造对象，等同于调用类的构造方法
        // 5.2  使用伴生对象构造对象，等同于调用伴生对象的apply方法。
        // 5.5  apply方法用于构建类的对象，但是没有强制要求必须是当前类对象
//        val user1 = User23("zhangsan")
//        val user2 = User23()
//        // 获取伴生对象的类，不会调用apply方法
//        val user3 = User23
//        println(user1)
//        println(user2)
//        println(user3)

//        val date = User23(20)
//        println(date)

        for ( i <- 1 to 5 ) {

        }
        for ( i <- 1 until 5 ) {

        }
        for ( i <- Range(1, 5)) {
        }

        List(1,2,3,4)

    }
    class User23 private () {

    }
    object User23 {
        //val user : User23 = new User23()
        // apply方法即使没有参数，也不要省略参数列表
        def apply() = new User23
        def apply(age:Int) = new java.util.Date()
        def apply(name:String) = new User23
//        def createInstance() = {
//            if ( user == null ) {
//                user = new User23()
//            }
//            user
//
//        }
    }

}
