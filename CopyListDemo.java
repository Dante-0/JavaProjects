package collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyListDemo {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println(fruits);

//        List<String> copy = new ArrayList<>(fruits);
//        System.out.println(copy);

//        List<String> copy = new ArrayList<>();
//        copy.addAll(fruits);
//        System.out.println(copy);

//          List<String> copy = new ArrayList<>(fruits.size());
//
//          copy.add("a");
//          copy.add("b");
//          copy.add("c");
//          copy.add("d");
//
//          Collections.copy(fruits, copy);
//          System.out.println(copy);

//          List<String> copy = fruits.stream().collect(Collectors.toList());
//          System.out.println(copy);

            List<String> copy = List.copyOf(fruits);
            System.out.println(copy);

    }
}
