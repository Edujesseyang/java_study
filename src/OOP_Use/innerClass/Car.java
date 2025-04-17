package src.OOP_Use.innerClass;

public class Car {
    public static int carID = 0;
    private String brand;
    private int year;

    public Car() {
        carID++;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        carID++;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    // private inner class only can be accessed in the outer class.
    public void checkEngin(String type, double volume, int power) {
        Engin e = new Engin(type, volume, power);
        e.showInfo();
    }

    // private inner class
    private class Engin {
        private String cylinderType;
        private double cylinderVolume;
        private int power;

        public Engin() {
        }

        public Engin(String cylinderType, double cylinderVolume, int power) {
            this.cylinderType = cylinderType;
            this.cylinderVolume = cylinderVolume;
            this.power = power;
        }

        public void showInfo() {
            System.out.println("Engin : " + Car.this.brand + " made " + this.cylinderType + " " + this.cylinderVolume + " with " + this.power + " horse power.");
        }
    }


    // member inner class
    public class Tire {
        private String brand;
        private int size;
        public static int tireNum = 4; // static works after JDK16 only.

        public Tire() {
        }

        public Tire(String brand, int size) {
            this.brand = brand;
            this.size = size;
        }

        public void showInfo() {
            System.out.print(Car.this.brand + " " + Car.this.getYear() + " has ");
            System.out.println(Tire.tireNum + " " + this.brand + " size " + this.size + " tires.");
        }

    }

    // static inner class
    public static class Owner {
        private String name;

        public Owner() {
        }

        public Owner(String name) {
            this.name = name;
        }

        // same usage as normal static class.
        public void showInfo() {
            System.out.println("Owner name of car number " + Car.carID + " is " + this.name);
        }
    }
}
