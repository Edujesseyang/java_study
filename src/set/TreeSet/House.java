package src.set.TreeSet;

public class House {
    private String address;
    private int area;
    private int price;
    private static int houseCount = 0;

    public House() {
        houseCount++;
    }

    public House(String address, int area, int price) {
        this.address = address;
        this.area = area;
        this.price = price;
        houseCount++;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public int getHouseID() {
        return houseCount;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        int length = 40;
        int addressLength = address.length();
        int areaLength = (area == 0) ? 1 : (int) Math.log10(area) + 1;
        int priceLength = (price == 0) ? 1 : (int) Math.log10(price) + 1;
        String line1 = "-".repeat(length);
        String line2 = "\n|  Address: " + address + " ".repeat(length - addressLength - 13) + "|";
        String line3 = "\n|  Area: " + area + "      Price: " + price + " ".repeat(length - 23 - areaLength - priceLength) + "|\n";
        String line4 = "-".repeat(length);
        return line1 + line2 + line3 + line4;
    }

}
