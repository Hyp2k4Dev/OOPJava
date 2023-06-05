package edu.gst.demo_java.variablehiding;

class Quiz {
    public Quiz(){
        System.out.print("A");
    }
}

class B extends Quiz{
    public B(){
        super();
        System.out.print("B");
    }
}

public class Lesson54{
    public static void test(B b) {
    }

    public static void main(String[] args) {
        B b = new B();
        test(b);
    }
}
