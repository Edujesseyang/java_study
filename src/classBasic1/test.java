package src.classBasic1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.setPrice(15000.0);
        myCar.color = "Gray";
        System.out.println("Brand is " + myCar.brand);
        System.out.println("Color is " + myCar.color);
        System.out.println("Price is " + myCar.getPrice());
        myCar.printInfo();

        Car myCar1 = new Car("Infinite", "red", 65000);
        myCar1.printInfo();
        Car myCar2 = new Car(myCar1);
        myCar2.printInfo();
        Car myCar3 = new Car(65000, "Infinity", "blue");
        myCar3.printInfo();
        Car myCar4 = new Car("Infinity", 650000, "blue");
        myCar4.printInfo();


        Student newStu = new Student();
        newStu.printInfo();
        Student newStu1 = new Student("Jesse", 25, 1086563);
        newStu1.printInfo();

        // add class
        Student[] myClass = createClass(5);
        printClass(myClass);


    }

    public static Student[] createClass(int classSize) {
        Student[] class1 = new Student[classSize];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < classSize; i++) {
                try {
                    System.out.println("Enter Name: ");
                    String inputName = sc.nextLine();
                    System.out.println("Enter Age: ");
                    int inputAge = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter ID: ");
                    int inputId = sc.nextInt();
                    sc.nextLine();
                    class1[i] = new Student(inputName, inputAge, inputId);
                } catch (InputMismatchException e) {
                    System.err.println("Invalid Input!");
                    sc.nextLine();
                    i--;
                }
            }
        }
        return class1;
    }

    public static void printClass(Student[] class1) {
        System.out.println("Student List:");
        System.out.println("====================================================");
        for (Student s : class1) {
            if (s != null) {
                s.printInfo();
            } else {
                System.out.println("Student not exists!");
            }
        }
        System.out.println("====================================================");
    }
}