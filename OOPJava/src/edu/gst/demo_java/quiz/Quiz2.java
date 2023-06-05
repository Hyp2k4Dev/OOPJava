package edu.gst.demo_java.quiz;
class Base{
    public void total(){
        show();
    }

    public void show(){
        System.out.println("Base");
    }
}
class Derived extends Base{
    public void show(){
        System.out.println("Devired");
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        Base d = new Derived();
        d.total();
    }
}
