package src.classBasic2;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Item item1 = new Item();
            item1.editItem(sc);
            Item item2 = new Item();
            item2.editItem(sc);
            Item item3 = new Item();
            item3.editItem(sc);
            ShoppingCart cart1 = new ShoppingCart(3);

            cart1.addItem(item1);
            cart1.addItem(item2);
            cart1.addItem(item3);
            cart1.printList();

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
