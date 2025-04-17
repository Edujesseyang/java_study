package src.OOP_Use.keyword_abstract;

public class Triangle extends Shape {

    public Triangle() {
    }

    public Triangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    // we have to override the abstract method in the child class. HAVE TO...
    @Override
    public void getSide() {
        System.out.println("It has " + this.numOfSide + " sides.");
    }

    @Override
    public void setSide() {
        numOfSide = 3;
    }

    @Override
    public double getArea() {
        return this.length * this.height / 2.0;
    }


}
