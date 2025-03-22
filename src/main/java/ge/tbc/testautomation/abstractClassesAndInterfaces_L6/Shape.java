package ge.tbc.testautomation.abstractClassesAndInterfaces_L6;

public abstract class Shape {
    protected double perimeter;
    protected double area;
    public static double staticVariable = 10.0;

    public abstract double getPerimeter();

    public abstract double getArea();
}
