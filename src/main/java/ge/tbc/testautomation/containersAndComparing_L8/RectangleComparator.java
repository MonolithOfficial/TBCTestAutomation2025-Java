package ge.tbc.testautomation.containersAndComparing_L8;

import ge.tbc.testautomation.polymorphismInheritance_L5.Rectangle;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.getPerimeter() < o2.getPerimeter()){
            return -1;
        } else if (o1.getPerimeter() > o2.getPerimeter()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
