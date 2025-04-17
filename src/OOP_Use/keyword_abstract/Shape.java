package src.OOP_Use.keyword_abstract;

public abstract class Shape {
    // not abstract for member variable, code block, nor constructor.
    protected int numOfSide;
    protected int height;
    protected int length;


    // Abstract class doesn't have to have abstract methods.
    // But, if a class has abstract methods, we have to set it abstract class.

    // For abstract method, there is not {} allow. You can write the behavior here.
    public abstract void getSide();

    public abstract void setSide();

    public abstract double getArea();
}
