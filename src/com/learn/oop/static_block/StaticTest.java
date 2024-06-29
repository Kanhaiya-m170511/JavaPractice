package com.learn.oop.static_block;

public class StaticTest {

    public static Integer x ;
    public Integer y;
    static {
        x = 10;

    }

    {
        x = 100;
        this.y = 10;
    }

    public static void main(String[] args) {
        StaticTest t = new StaticTest();
        System.out.println(t.x);


    }
}
