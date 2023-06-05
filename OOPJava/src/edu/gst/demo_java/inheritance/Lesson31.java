package edu.gst.demo_java.inheritance;
class Person{
    private String name;
    private int dob;
    public Person(String name,int dob){
        this.name = name;
        this.dob = dob;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getDob(){
        return dob;
    }

    public void setDob(int dob){
        this.dob = dob;
    }
}

class Student extends Person{
    private double gpa;

    public Student(String name, int dob, double gpa){
        super(name, dob);
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }
}

public class Lesson31 {
    public static void main(String[] args) {
        Student std = new Student("Hai",1999,8.8);
        System.out.println("Name: "+std.getName());
        System.out.println("Date of birth: "+std.getDob());
        System.out.println("GPA: "+std.getGpa());
    }
}
