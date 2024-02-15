package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMapExample {
    public static void main(String[] args) {
        Map <Integer, String> courseMap = new HashMap<Integer, String>();
        courseMap.put(1, "C");
        courseMap.put(2, "C++");
        courseMap.put(3, "Java");
        courseMap.put(4, "Spring Framework");
        courseMap.put(5, "Hibernate ORM Framework");
        System.out.println(courseMap);

//        Iterator<Map.Entry<Integer, String>> iterator = courseMap.entrySet().iterator();
//        while(iterator.hasNext()){
//
//            Entry<Integer, String> entry = iterator.next();
//            System.out.print(entry.getKey()+": ");
//            System.out.println(entry.getValue());
//
//        }

//        Iterator<Integer> iterator = courseMap.keySet().iterator();
//        while(iterator.hasNext()){
//            Integer key = iterator.next();
//            System.out.print(key+": ");
//            System.out.println(courseMap.get(key));
//        }

//        for(Map.Entry<Integer, String> entry: courseMap.entrySet()){
//            System.out.print(entry.getKey()+": "); System.out.println(entry.getValue());
//        }

//          courseMap.forEach((key, value) -> {
//            System.out.print(key+": ");
//            System.out.println(value);
//        });

//            courseMap.entrySet().stream().forEach((entry) -> {
//                System.out.println(entry.getKey());
//                System.out.println(entry.getValue());
//            });



    }
}




















