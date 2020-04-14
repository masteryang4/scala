package com.atguigu.bigdata.scala.chapter06
package test8 {

    import com.atguigu.bigdata.scala.chapter06.test08.User

    class Dept {
        def test(): Unit = {
            new User().password
        }
    }
}
package test08 {

    import com.atguigu.bigdata.scala.chapter06.test08

    class User {
        private var name : String = "zhangsan"
        protected var id : Int = 10
        def ttt(): Unit = {
            println("name = " + name)
            val emp = new Emp()
            emp.age
        }
        var password = "111111"
    }
    class Emp {
        // 包访问权限
        private[bigdata] var age : Int = 20
        def test(): Unit = {
            new User().password
        }

    }
    package test088 {
        class SubUser extends User {
            def test(): Unit = {
                //println(name)
                // 子包可以直接访问父包中的内容
                new Emp().age
                println(id)
                println(password)
            }
        }
    }
}

object Scala08_Object_Permission {
    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象编程 - 访问权限
        // Java :
        //     1. private : 私有， 同类能访问
        //     2. 默认（什么都不写）：同类，同包能访问
        //     3. protected : 受保护的，同类，同包，子类能访问
        //     4. public : 公共,任意地方都能使用
        // Scala :
        //     1. private : 私有的，同类能访问
        //     2. private[包名] : 同类，同包
        //              可以设定不同的包的访问权限
        //     3. protected : 受保护的， 没有同包的权限，同类，子类能访问。
        //     4. 默认访问权限（公共的）

    }
}
