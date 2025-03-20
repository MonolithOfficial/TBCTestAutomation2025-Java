package ge.tbc.testautomation.polymorphismInheritance_L5;

public class MethodOverloading {
    public Ball shoot(Ball ball){
        System.out.println("THE BALL HAS BEEN THROWN");
        return ball;
    }

//    public void shoot(Ball ball){ // NOT ENOUGH DIFFERENCE FOR OVERLOAD -> RETURN TYPE
//        System.out.println("THE BALL HAS BEEN THROWN");
//    }
}
