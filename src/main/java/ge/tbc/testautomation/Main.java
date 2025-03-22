package ge.tbc.testautomation;

import ge.tbc.testautomation.polymorphismInheritance_L5.*;
import ge.tbc.testautomation.staticMembersAndEncapsulation_L4.Building;

public class Main {
    public static void main(String[] args) {
//        Building building = new Building();
//        Building building1 = new Building("red");
//
//        building1.setNumberOfFloors(22);
//        System.out.println(building1.getNumberOfFloors());
//        Building building1 = new Building("red");
//        Building buildingExtra = new Building("red");
//        System.out.println(Building.numberOfBuildings);
//        Building building2 = new Building("black");
//        System.out.println(Building.numberOfBuildings);
//        Building building3 = new Building("blue");
//        System.out.println(Building.numberOfBuildings);
//        Building building4 = new Building("green");
//        System.out.println(Building.numberOfBuildings);
//        Building building5 = new Building("gold");
//        System.out.println(Building.numberOfBuildings);
//
//        System.out.println(building5);
//
//        MethodOverloading methodOverloading = new MethodOverloading();
//
//        Ball ball = methodOverloading.shoot(new Ball());
//        methodOverloading.shoot(new Ball());
//
//        Object object = new Object();
//        Shape shape = new Shape();
//        Shape shape1 = new Rectangle(2, 10);
//        Rectangle rectangle = new Rectangle(1, 2);
//
//        int statusCode = 400;
//
//        Response response; // DECLARATION/REFERENCE
//
//        if (statusCode >= 400 && statusCode < 500){
////        if (String.valueOf(statusCode).startsWith("4")){
//            response = new NegativeResponse(); // LATE INITIALIZATION
//        } else if (statusCode == 200) {
//            response = new PositiveResponse();
//
//        }

        Shape shape2 = new Rectangle(10, 10);
        System.out.println(shape2.getPerimeter());
    }
}