package ge.tbc.testautomation;

public class Main {
    public static void main(String[] args) {
//        Building building = new Building();
//        Building building1 = new Building("red");
//
//        building1.setNumberOfFloors(22);
//        System.out.println(building1.getNumberOfFloors());
        Building building1 = new Building("red");
        Building buildingExtra = new Building("red");
        System.out.println(Building.numberOfBuildings);
        Building building2 = new Building("black");
        System.out.println(Building.numberOfBuildings);
        Building building3 = new Building("blue");
        System.out.println(Building.numberOfBuildings);
        Building building4 = new Building("green");
        System.out.println(Building.numberOfBuildings);
        Building building5 = new Building("gold");
        System.out.println(Building.numberOfBuildings);

        System.out.println(building5);
    }
}