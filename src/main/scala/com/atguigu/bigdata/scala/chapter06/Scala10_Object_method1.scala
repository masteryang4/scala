package com.atguigu.bigdata.scala.chapter06

object Scala10_Object_method1 {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 方法
        // 方法其实就是函数。只不过声明在类中

        // 使用方法
        val user1 = new User10()
        user1.id = 100

        val user2 = new User10()
        user2.id = 100

        println(user1.equals(user2))
        //user.test()

        // 获取类的信息
        //user2.getClass
        val clazzInfo: Class[User10] = classOf[User10]
    }
}
class User10 {
    var id : Int = _

    override def equals(o: Any): Boolean = {

        // 判断对象是否为指定的类型
        if ( o.isInstanceOf[User10] ) {
            // 将对象转换为指定的类型
            val otherUser: User10 = o.asInstanceOf[User10]
            otherUser.id == this.id
        } else {
            false
        }
    }
}
