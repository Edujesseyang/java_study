package src.Syntax.classBasic2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Item item1 = new Item();
            editItem(item1, sc);
            Item item2 = new Item();
            editItem(item2, sc);
            Item item3 = new Item();
            editItem(item3, sc);
            ShoppingCart cart1 = new ShoppingCart(3);

            cart1.addItem(item1);
            cart1.addItem(item2);
            cart1.addItem(item3);
            cart1.addItem(4, "Dog food", 23, 1);
            cart1.printList();

           test1();
        }
    }

    public static void editItem(Item item, Scanner sc) {
        try {
            System.out.print("Enter Item ID: ");
            item.id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Item Name: ");
            item.name = sc.nextLine();

            System.out.print("Enter price: ");
            item.price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter quantity: ");
            item.quantity = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Invalid data type!" + e.getMessage());
            sc.nextLine();
        } catch (NoSuchElementException e) {
            System.err.println("Input can't be empty! " + e.getMessage());
            sc.nextLine();
        }
    }

    public static void test1() {
        Item item1 = new Item(1, "PS5", 599.99, 1);
        item1.printInfo();

        Item item2 = new Item();
        item2.printInfo();

        ShoppingCart cart1 = new ShoppingCart(5);

        cart1.addItem(item1);
        cart1.addItem(item2);
        cart1.addItem(3, "Iphone", 799, 1);
        Item item3 = new Item();
        cart1.addItem(item3);
        Item item4 = new Item();
        cart1.addItem(item4);

        cart1.printList();

        cart1.deleteItem(0);
        cart1.printList();

        cart1.addItem(54, "Book of cooking", 19, 1);
        cart1.printList();

        cart1.payAll();
        cart1.printList();
    }
}
