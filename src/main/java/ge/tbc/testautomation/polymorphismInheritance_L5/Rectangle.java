package ge.tbc.testautomation.polymorphismInheritance_L5;

public class Rectangle extends Shape {
    protected double sideA;
    protected double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return (this.sideA + this.sideB) * 2;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    public void somethingRectangle(){
        System.out.println("something");
    }
}
