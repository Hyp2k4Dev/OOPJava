package edu.gst.demo_java.class_project;

public class Lesson11 {
    String name;
    int age;

    public Lesson11(){

    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
    }
}
class listStudent{
    public static void main(String[] args) {
        Lesson11[] ls11 = new Lesson11[3];

        for (int i = 0;i < 3;i++){
            ls11[i] = new Lesson11();
        }
        ls11[0].name = "Tuan";
        ls11[0].age = 24;
        ls11[1].name = "Cuong";
        ls11[1].age = 25;
        ls11[2].name = "Duc";
        ls11[2].age = 24;
        for (int i = 0;i<3;i++){
            ls11[i].display();
        }
    }
}


