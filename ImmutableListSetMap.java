package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ImmutableListSetMap {
    public static void main(String[] args) {

//        List<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Mango");
//        fruits.add("Orange");
//
//        fruits=Collection.(fruits);
//
//        fruits.add("Strawberry");
//        System.out.println(fruits);

        List<String> fruits = List.of("Banana, Mango", "Apple", "Orange");
        System.out.println(fruits);
        fruits.add("Strawberry");
        System.out.println(fruits);
    }


    }

