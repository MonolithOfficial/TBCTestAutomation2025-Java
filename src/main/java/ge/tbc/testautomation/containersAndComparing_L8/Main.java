package ge.tbc.testautomation.containersAndComparing_L8;

import ge.tbc.testautomation.generics_L9.Tuple;
import ge.tbc.testautomation.polymorphismInheritance_L5.Rectangle;
import ge.tbc.testautomation.polymorphismInheritance_L5.Shape;
import org.testng.annotations.Test;

import java.util.*;

public class Main {

    @Test
    public void containersTest(){
        String something = new String();
        Rectangle[] rectangles = new Rectangle[10];

        Collection<Rectangle> collection = new ArrayList<Rectangle>();
        collection.add(new Rectangle(10, 10));
//        collection.remove(10);
//        collection.remove(20);

        for (Object element :
                collection) {
            if (element instanceof String){
                String stringAsElement = (String) element;
                System.out.println(stringAsElement);
            }
        }

        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(100);
        collection2.add(200);
        collection2.remove(10);
        collection2.remove(20);

        System.out.println(collection.size());

//        collection.addAll(collection2); NOT POSSIBLE ANYMORE
        System.out.println(collection);

        Iterator<Rectangle> iterator = collection.iterator();
        while(iterator.hasNext()){
            Rectangle currentElement = iterator.next();
            System.out.println(currentElement);

            iterator.remove();
        }

        HashMap<String, String> map = new HashMap<>();
        int x = 10;
        map.put("ობსტრუქცია", "სხდომის, კრების, ვისიმე გამოსვლის ჩაშლა წამოძახილებით, ხმაურით, გრძელი, უსაგნო სიტყვის წარმოთქმით და მისთ.");
        map.put("ობსტრუქცია1", "something");
        Set<String> keySet = map.keySet();

        System.out.println(map);

        LinkedHashMap<String, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("ben1", "1");
        linkedMap.put("ben2", "2");
        linkedMap.put("ben3", "3");
        linkedMap.put("ben4", "4");
        linkedMap.put("ben5", "5");
        linkedMap.put("ben6", "6");
        linkedMap.put("ben7", "7");
        linkedMap.put("ben8", "8");
        linkedMap.put("ben9", "9");
        linkedMap.put("ben10", "10");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("ben1", "1");
        hashMap.put("ben2", "2");
        hashMap.put("ben3", "3");
        hashMap.put("ben4", "4");
        hashMap.put("ben5", "5");
        hashMap.put("ben6", "6");
        hashMap.put("ben7", "7");
        hashMap.put("ben8", "8");
        hashMap.put("ben9", "9");
        hashMap.put("ben10", "10");

        HashMap<Shape, String> shapeMap = new HashMap<>();
        shapeMap.put(new Rectangle(10, 10), "something");

        hashMap.remove("ben10");

        for (String key :
                linkedMap.keySet()) {
            System.out.println(linkedMap.get(key));
        }

        for (String key :
                hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }

        HashSet<Rectangle> someSet = new HashSet<>();
        someSet.add(new Rectangle(10, 10));
        someSet.add(new Rectangle(10, 10));
        someSet.add(new Rectangle(10, 10));
        someSet.add(new Rectangle(10, 10));
        someSet.add(new Rectangle(10, 10));
        someSet.add(new Rectangle(10, 10));

        TreeSet<Rectangle> treeSet = new TreeSet<Rectangle>(new RectangleComparator()); // using comparator
//        TreeSet treeSet = new TreeSet(); // using comparable
        treeSet.add(new Rectangle(20, 20)); // ONLY THIS REMAINS
        treeSet.add(new Rectangle(20, 20));
        treeSet.add(new Rectangle(20, 20));
        treeSet.add(new Rectangle(20, 20));
        treeSet.add(new Rectangle(20, 20));

        System.out.println("TREESET" + treeSet);

        TreeMap<Rectangle, String> treeMap = new TreeMap<Rectangle, String>(new RectangleComparator());
        treeMap.put(new Rectangle(10, 19), "1");
        treeMap.put(new Rectangle(10, 19), "2");
        treeMap.put(new Rectangle(10, 19), "3");
        treeMap.put(new Rectangle(10, 19), "4");
        treeMap.put(new Rectangle(10, 19), "5");
        treeMap.put(new Rectangle(10, 19), "6");
        treeMap.put(new Rectangle(10, 19), "7");
        treeMap.put(new Rectangle(10, 19), "8");
        treeMap.put(new Rectangle(10, 19), "9");
        treeMap.put(new Rectangle(10, 19), "10");

        System.out.println(treeMap.size());

        ArrayList<Rectangle> arrayList = new ArrayList<>(); // using comparator
        arrayList.add(new Rectangle(25, 20));
        arrayList.add(new Rectangle(21, 20));
        arrayList.add(new Rectangle(30, 20));
        arrayList.add(new Rectangle(22, 20));
        arrayList.add(new Rectangle(24, 20));
        System.out.println(arrayList);
        Collections.sort(arrayList, new RectangleComparator());
        System.out.println(arrayList);

        Tuple<Long, String> identificationInfoTuple = new Tuple<>();
        identificationInfoTuple.setElementOne(6500149124L);
        identificationInfoTuple.setElementTwo("mamuka");

        Tuple<String, Double> weightInfoTuple = new Tuple<>();
        weightInfoTuple.setElementOne("saxeli gvari");
        weightInfoTuple.setElementTwo(100.01);

        List<Tuple> listOfTuples = new ArrayList<>();
        listOfTuples.add(identificationInfoTuple);
        listOfTuples.add(weightInfoTuple);
    }
}
