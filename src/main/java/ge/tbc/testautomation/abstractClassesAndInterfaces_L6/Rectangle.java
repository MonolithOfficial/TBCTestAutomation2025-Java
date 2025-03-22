package ge.tbc.testautomation.abstractClassesAndInterfaces_L6;

import ge.tbc.testautomation.polymorphismInheritance_L5.Ball;

public class Rectangle extends Shape implements IResizable,IRecolorable{
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

    @Override
    public void resize(double by) {
        this.area = this.getArea() * by;
    }

    @Override
    public void recolor() {
        System.out.println("CHANGED MY COLOR");
    }
}
