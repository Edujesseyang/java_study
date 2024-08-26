package src.classBasic2;

import java.util.Scanner;

public class ShoppingCart {
    public Item[] cart;

    public ShoppingCart(int space) {
        cart = new Item[space];
    }

    public void printList() {
        if (cart != null) {
            System.out.println("=============== Cart =======================");
            for (Item item : cart) {
                if (item != null) {
                    item.printInfo();
                } else {
                    System.out.println("Empty Space...");
                }
            }
            System.out.println("============================================");
        } else {
            System.out.println("Not cart found!");
        }
    }

    public void addItem(Item item) {
        if (item != null) {
            for (int i = 0; i < this.cart.length; i++) {
                if (cart[i] == null) {
                    this.cart[i] = item;
                    break;
                }
            }
            if(cart[cart.length - 1] != null){
                System.out.println("Shopping Cart is full!");
            }
        } else {
            System.out.println("item undefined!");
        }
    }


    public void deleteItem(int id) {
        for (int i = 0; i < this.cart.length; i++) {
            if (id == this.cart[i].id) {
                this.cart[i] = null;
            }
        }
    }

    public void payAll() {
        double total = 0;
        for (Item item : this.cart) {
            if (item != null) {
                total += item.price;
            } else {
                total += 0;
            }
        }
        System.out.println("Are you sure to pay? Total is " + total);
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.nextInt() == 1) {
                this.cart = null;
                System.out.println("Payment successful, Thank you for shopping!");
            } else {
                System.out.println("Payment canceled. Continue shopping...");
            }
        }
    }

    public void addItem(int id, String name, double price, int quantity) {
        for (int i = 0; i < this.cart.length; i++) {
            if (cart[i] == null) {
                this.cart[i] = new Item(id, name, price, quantity);
                break;
            }
        }
    }
}
