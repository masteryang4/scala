package com.atguigu.bigdata.java;

public class TestObject {
    public static void main(String[] args) {

        Chinese zhangsan = new Chinese();
        zhangsan.face = new Face("yellow");
    }

}
// 用户登陆：用户账号，用户密码
class User1 {
    private String loginacct;
    private String userpswd;
}
class Chinese {

    public Face face;
    public Eye[] eyes = {new Eye(), new Eye()};

}
class Face {
    public String color;
    public Face( String color ) {
        this.color = color;
    }
}
class Eye {
    public String color = "black";
}
