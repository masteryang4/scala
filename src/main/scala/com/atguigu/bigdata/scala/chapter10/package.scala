package com.atguigu.bigdata.scala

import com.atguigu.bigdata.scala.chapter10.Scala10_Transform9.User

package object chapter09 {
    implicit class UserExt( user:User ) {
        def update(): Unit = {
            // update.... where id = 1
            println("update..." + user)
        }
    }
}
