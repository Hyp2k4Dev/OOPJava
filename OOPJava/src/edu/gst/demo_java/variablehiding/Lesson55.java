package edu.gst.demo_java.variablehiding;

class A1{
    public int x = 10;
    public void display1(){
        System.out.println(this.x);
    }
}
class B1 extends A1{
    public int x = 20;
    @Override
    public void display1(){
        System.out.println(this.x);
    }
}

public class Lesson55 {
    public static void main(String[] args) {
        A1 b = new B1();
        b.display1();
    }
}
