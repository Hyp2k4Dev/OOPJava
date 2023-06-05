//package edu.gst.demo_java.quiz;
//
//abstract class Shape {
//    public abstract void input();
//
//    public abstract void display();
//
//    public abstract void perimeter();
//
//    public abstract void area();
//}
//
//class Rectangle extends Shape{
//    private double h;
//    private double w;
//
//    public Rectangle(double h,double w){
//        this.h = h;
//        this.w = w;
//    }
//
//    @Override
//    public double perimeter() {
//        return (h+w) * 2;
//    }
//
//    @Override
//    public double area() {
//        return h * w;
//    }
//
//    @Override
//    public void display() {
//        System.out.println("Perimeter: " + perimeter());
//        System.out.println("Area: " + area());
//    }
//}
//public class Quiz1{
//    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle(1, 2);
//    }
//}
////Compile Fail