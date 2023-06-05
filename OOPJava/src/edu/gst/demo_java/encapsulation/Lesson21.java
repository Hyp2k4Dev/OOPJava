package edu.gst.demo_java.encapsulation;

    class Person{
        private int id;
        private String name;
        private int age;
        private String address;
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name= name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age =age;
        }
        public String getAddress(){
            return address;
        }
        public void setAddress(String address){
            this.address=address;
        }
    }
    public class Lesson21 {
        public static void main(String[] args) {
            Person ps = new Person();
            ps.setId(1001);
            ps.setName("Quynh");
            ps.setAge(24);
            ps.setAddress("Ha Noi");
            System.out.println("Id: " + ps.getId());
            System.out.println("Name: "+ ps.getName());
            System.out.println("Age :"+ ps.getAge());
            System.out.println("Address :"+ ps.getAddress());
        }
    }
