package src.Syntax.classBasic2;

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


}


