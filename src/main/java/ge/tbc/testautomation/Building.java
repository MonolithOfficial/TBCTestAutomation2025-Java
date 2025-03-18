package ge.tbc.testautomation;

public class Building {
    private final Integer MAX_NUMBER_OF_FLOORS = 10;
    private final Integer MAX_NUMBER_OF_WINDOWS = 300;
    public static Integer numberOfBuildings = 0;
    private final Integer MAX_NUMBER_OF_BUILDINGS = 6;
    private String color; // instance variable
    private Integer numberOfFloors;
    private Integer numberOfWindows;

//    public Building(){
//        this("green");
//    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        if (numberOfFloors > MAX_NUMBER_OF_FLOORS){
            this.numberOfFloors = 10;
        }
    }

    public Integer getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(Integer numberOfWindows) {
        if (numberOfWindows > MAX_NUMBER_OF_WINDOWS){
            this.numberOfWindows = 300;
        }
    }

    public Building(String color){
        this.color = color;
        numberOfBuildings++;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
