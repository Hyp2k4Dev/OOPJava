package edu.gst.demo_java.variablehiding;
class A{
    public int x = 10;
        public void display(){
            System.out.println(this.x);
        }
}

class C extends A{
    public int x = 20;
}


public class Lesson52 {
    public static void main(String[] args) {
        A b = new C();
        b.display();
    }
}
