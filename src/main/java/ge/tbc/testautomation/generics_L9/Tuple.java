package ge.tbc.testautomation.generics_L9;

import ge.tbc.testautomation.polymorphismInheritance_L5.Shape;

//public class Tuple<E extends Shape, T extends Shape> {
public class Tuple<E, T> {
    private E elementOne;
    private T elementTwo;

    public Tuple(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public Tuple() {
    }

    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }

    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }

    public <K extends Shape, D> void doSomething(K generifiedParameter1, D generifiedParameter2){

    }
}
