package ge.tbc.testautomation.containersAndComparing_L8;

import ge.tbc.testautomation.polymorphismInheritance_L5.Rectangle;
import org.testng.annotations.Test;

import java.util.*;

public class Main {

    @Test
    public void containersTest(){
        String something = new String();
        Rectangle[] rectangles = new Rectangle[10];

        Collection collection = new ArrayList();
        collection.add(10);
        collection.add(15);
        collection.remove(10);
        collection.remove(20);

        Collection collection2 = new ArrayList();
        collection2.add(100);
        collection2.add(200);
        collection2.remove(10);
        collection2.remove(20);

        System.out.println(collection.size());

        collection.addAll(collection2);
        System.out.println(collection);

        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            Object currentElement = iterator.next();
            System.out.println(currentElement);

            iterator.remove();
        }

        HashMap map = new HashMap();
        int x = 10;
        map.put("ობსტრუქცია", "სხდომის, კრების, ვისიმე გამოსვლის ჩაშლა წამოძახილებით, ხმაურით, გრძელი, უსაგნო სიტყვის წარმოთქმით და მისთ.");
        map.put("ობსტრუქცია1", x);
        map.put(new Rectangle(10, 10), 10);
        map.keySet();

        System.out.println(map);

        LinkedHashMap linkedMap = new LinkedHashMap();
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

        HashMap hashMap = new HashMap();
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

        hashMap.remove("ben10");

        for (Object key :
                linkedMap.keySet()) {
            System.out.println(linkedMap.get(key));
        }

        for (Object key :
                hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }

        HashSet someSet = new HashSet();
        someSet.add(new Rectangle(10, 10));
        someSet.add(new Rectangle(10, 10));
        someSet.add(new Rectangle(10, 10));
        someSet.add(new Rectangle(10, 10));
        someSet.add(new Rectangle(10, 10));
        someSet.add(new Rectangle(10, 10));

        TreeSet treeSet = new TreeSet(new RectangleComparator()); // using comparator
//        TreeSet treeSet = new TreeSet(); // using comparable
        treeSet.add(new Rectangle(20, 20)); // ONLY THIS REMAINS
        treeSet.add(new Rectangle(20, 20));
        treeSet.add(new Rectangle(20, 20));
        treeSet.add(new Rectangle(20, 20));
        treeSet.add(new Rectangle(20, 20));

        System.out.println("TREESET" + treeSet);

        TreeMap treeMap = new TreeMap(new RectangleComparator());
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

        ArrayList arrayList = new ArrayList(); // using comparator
        arrayList.add(new Rectangle(25, 20));
        arrayList.add(new Rectangle(21, 20));
        arrayList.add(new Rectangle(30, 20));
        arrayList.add(new Rectangle(22, 20));
        arrayList.add(new Rectangle(24, 20));
        System.out.println(arrayList);
        Collections.sort(arrayList, new RectangleComparator());
        System.out.println(arrayList);
    }
}
