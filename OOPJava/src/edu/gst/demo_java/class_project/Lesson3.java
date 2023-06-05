package edu.gst.demo_java.class_project;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Rectangle rct = new Rectangle();
        rct.getInformation();
        rct.display();
    }
}

class Rectangle{
    double length,width;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    public double getArea(){
        return length*width;
    }
    public  double getPerimeter(){
        return (length+width)*2;
    }
    public void display(){
        System.out.println("Area: "+ getArea());
        System.out.println("Perimeter: "+ getPerimeter());
    }
}
