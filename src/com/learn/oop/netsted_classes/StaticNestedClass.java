package com.learn.oop.netsted_classes;

public class StaticNestedClass {
    static Integer x;
    Integer z;
    static class Sta{
        public Integer y;


        public  int show() {
            x = 10;

            return 11;
        }
    }

    public static void main(String[] args) {
       // System.out.println(StaticNestedClass.Sta.show());
        System.out.println(StaticNestedClass.x);
    }
}
