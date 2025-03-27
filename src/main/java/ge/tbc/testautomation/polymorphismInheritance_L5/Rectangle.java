package ge.tbc.testautomation.polymorphismInheritance_L5;

public class Rectangle extends Shape{
//public class Rectangle extends Shape implements Comparable{ // with comparable
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

//    @Override
//    public int compareTo(Object o) {
//        Rectangle otherRectangle = (Rectangle) o;
//        if (this.getPerimeter() < otherRectangle.getPerimeter()){
//            return -1;
//        } else if (this.getPerimeter() > otherRectangle.getPerimeter()) {
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
