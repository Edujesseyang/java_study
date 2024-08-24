package src.classBasic1;

public class Car {
    String brand;
    private double price;
    String color;

    // default constructor:
    public Car() {
        this.brand = "Unknown";
        this.price = 0.0;
        this.color = "Unknown";
    }

    // params constructor and overload:
    public Car(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public Car(double price, String brand, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    // copy constructor:
    public Car(Car car) {
        this.brand = car.brand;
        this.color = car.color;
        this.setPrice(car.getPrice());
    }

    // getters: (only private member variable need getter)
    public double getPrice() {
        return price;
    }

    // setters: (only private member variable need getter)
    public void setPrice(double price) {
        this.price = price;
    }


    public void printInfo() {
        System.out.println("The car information: ");
        System.out.println("\tBrand: " + brand);
        System.out.println("\tColor: " + color);
        System.out.println("\tPrice: " + price);
    }
}
