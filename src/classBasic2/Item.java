package src.classBasic2;

import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Item {
    public int id;
    public String name;
    public double price;
    public int quantity;

    public Item() {
        this.id = 0;
        this.name = "Unknown";
        this.price = 0;
        this.quantity = 0;
    }


    public Item(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printInfo() {
        System.out.println("Item : (" + id + ")" + name + "\nQuantity: \t" + quantity + "\tPrice: " + price);
    }

    public void editItem(Scanner sc) {

        try {
            System.out.print("Enter Item ID: ");
            this.id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Item Name: ");
            this.name = sc.nextLine();

            System.out.print("Enter price: ");
            this.price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter quantity: ");
            this.quantity = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Invalid data type!" + e.getMessage());
            sc.nextLine();
        } catch (NoSuchElementException e) {
            System.err.println("Input can't be empty! " + e.getMessage());
            sc.nextLine();
        }
    }
}


