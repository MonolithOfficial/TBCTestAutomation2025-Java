package ge.tbc.testautomation.polymorphismInheritance_L5;

public class Square extends Rectangle{
    public Square(double sideA) {
        super(sideA, sideA);
    }

    @Override
    public double getPerimeter() {
        return sideA * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(sideA, 2);
    }
}
