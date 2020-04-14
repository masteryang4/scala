package com.atguigu.bigdata.java;

public class TestEq {
    public static void main(String[] args) {

        User111 user1 = new User111();
        user1.id = 1;
        User111 user2 = new User111();
        user2.id = 1;

        System.out.println(user1.equals(null));

//        user2.getClass()
//        User111.class
    }
}
class User111 {
    public Integer id;
    @Override
    public boolean equals(Object o) {
//        if ( o == null ) {
//            return false;
//        }
        if ( o instanceof User111 ) {
            User111 other = (User111)o;
            return other.id.equals(this.id);
        } else {
            return false;
        }
    }
}
