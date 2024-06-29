package com.learn.oop.inheritance;

public  class Shape {
    private Integer l;
    private Integer b;
   // public Shape(){}
    public Shape(Integer l, Integer b){
        this.b = b;
        this.l = l;
    }
    public void display(){
        System.out.println("l = "+l+"\n"+"b = "+b);
    }
    public  void setL(Integer l)
    {
        this.l = l;
    }
}

class Cube extends Shape{
    protected Integer h;
    //public Cube(){super(0,0);}
    public Cube(Integer l, Integer b, Integer h){
        super(l,b);
        this.h = h;
    }
    public void display(){
        super.display();
        System.out.println("h = "+h);
    }
    public void setL(Integer l){

    }
}
class Test{
    public static void main(String[] args) {
        Shape shape = new Cube(2,3,4);
        shape.display();
        shape.setL(9);
        shape.display();

        A a = new A();
        B b = new B();
        A c = new C();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        show(c);
    }

    public static void show(A a){
        a.dis();
    }
}

class A{
    public void dis(){
        System.out.println("Hii -- I'm A");
    }
}
class B extends A{
    public void dis(){
        System.out.println("Hii -- I'm B");
    }
}
class C extends B{
    public void dis(){
        System.out.println("Hii -- I'm C");
    }
}