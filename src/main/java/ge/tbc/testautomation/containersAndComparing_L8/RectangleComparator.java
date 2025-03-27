package ge.tbc.testautomation.containersAndComparing_L8;

import ge.tbc.testautomation.polymorphismInheritance_L5.Rectangle;

import java.util.Comparator;

public class RectangleComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Rectangle rect1 = (Rectangle) o1;
        Rectangle rect2 = (Rectangle) o2;
        if (rect1.getPerimeter() < rect2.getPerimeter()){
            return -1;
        } else if (rect1.getPerimeter() > rect2.getPerimeter()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
