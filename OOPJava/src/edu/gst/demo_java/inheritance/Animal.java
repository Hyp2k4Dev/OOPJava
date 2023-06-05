package edu.gst.demo_java.inheritance;

import java.util.Scanner;

//tạo lớp Animal:
public class Animal {
    //khai báo các thuộc tính:
    String name;
    String type;
    String subcategories;


    //hàm tạo không tham số, lớp con không thừa kế được hàm tạo
    public void Animal() {
    }


    public void Animal(String name, String type, String subcategories) {
        this.name = name;
        this.type = type;
        this.subcategories = subcategories;
    }

    void inputInfo(){
        Scanner input=new Scanner(System.in);
        System.out.print("Input name: ");
        name = input.next();
        System.out.print("Input type: ");
        input.nextLine();
        type=input.nextLine();
        System.out.print("Input subcategories: ");
        subcategories=input.next();
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + subcategories);
    }
}

class DisPlay extends Animal{
    public static void main(String[] args) {
        DisPlay dp = new DisPlay();
        dp.inputInfo();
        dp.showInfo();
    }
}
