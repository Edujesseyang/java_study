package src.Syntax.classBasic1;

public class Student {
     String name;
     int age;
     int id;

     public Student(){
          this.name = "N/A";
          this.age = 0;
          this.id = 0;
     }
     public Student(String name, int age, int id){
          this.name =name;
          this.age = age;
          this.id = id;
     }

     public void printInfo(){
          System.out.println("Student: ");
          System.out.println("\tName: " + name);
          System.out.println("\tAge: " + age);
          System.out.println("\tStudent ID: " + id);
     }
}
