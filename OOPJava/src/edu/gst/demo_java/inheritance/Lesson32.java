package edu.gst.demo_java.inheritance;
class Person1{
    private String name;
    private String gender;

    public Person1(String name,String gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
    }
}

    class Student1 extends Person1{
        private int salary;

        public Student1(String name, String gender, int salary){
            super(name, gender);
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary){
            this.salary = salary;
        }

        public void display(){
            super.display();
            System.out.println("Salary: "+salary);
        }
    }



public class Lesson32 {
    public static void main(String[] args) {
        Student1 std1 = new Student1("Trung","Male",1700);
        std1.display();
    }
}
