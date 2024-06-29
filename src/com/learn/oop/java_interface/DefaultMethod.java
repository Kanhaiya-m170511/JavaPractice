package com.learn.oop.java_interface;

public interface DefaultMethod {
    default void test(){
        System.out.println("I'm Default method");
    }

    private void t() {

    }
}
class Implementor implements DefaultMethod{
    @Override
    public void test(){
        System.out.println("I got Over rided");
    }

}
class TestDefault{
    public static void main(String[] args) {
        Implementor i = new Implementor();
        i.test();
    }
}
