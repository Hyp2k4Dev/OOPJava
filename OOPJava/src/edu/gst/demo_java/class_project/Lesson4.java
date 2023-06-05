package edu.gst.demo_java.class_project;

class Student2{
    private String name;
    private int age;

    public Student2(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
}

public class Lesson4 {
    public static void main(String[] args) {
        Student2 hs1 = new Student2("Long", 24);
        Student2 hs2 = new Student2("Kien",29);
        hs1.display();
        hs2.display();
    }
}
