package ge.tbc.testautomation.annotationsAndStreams_L10;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.petrolCars();

        int number = 10;

        Method[] methods = LibraryClass.class.getDeclaredMethods(); // REFLECTION API
//        for (Method method :
//                methods) {
//            System.out.println(method.getName());
//        }
        List<Method> markedMethod = Arrays.stream(methods) // Stream API
                .filter(method -> {
                    if (method.isAnnotationPresent(Marked.class)) {
                        Marked markedAnnotation = (Marked) method.getAnnotation(Marked.class);
                        return markedAnnotation.title().equalsIgnoreCase("complete action");
                    }
                    return false;
                }).toList();

        System.out.println(markedMethod);

        List<String> listOfString = new ArrayList<>();
        listOfString.add("something");
        listOfString.add("about");
        listOfString.add("streams");
        listOfString.add("streams");

        boolean answer = listOfString.stream().allMatch(str -> str.startsWith("s"));
        boolean answer2 = listOfString.stream().anyMatch(str -> str.startsWith("s"));
        boolean answer3 = listOfString.stream().noneMatch(str -> str.startsWith("s"));
        System.out.println(answer3);


        listOfString.parallelStream().forEachOrdered(System.out::println);
    }
}
