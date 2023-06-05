package edu.gst.demo_java.class_project;
import java.util.Scanner;

class Student1{
    String name;
    int age;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}


public class Lesson2 {
    public static void main(String[]args) {
        Student1 s1 = new Student1();
        s1.getInformation();
        s1.display();
    }
}
