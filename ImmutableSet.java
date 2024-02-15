package collection;

import java.util.*;

public class ImmutableSet {
    public static void main(String[] args) {
        Set<String> fruits = Set.of("Banana", "Orange", "Apple", "Mango");
        System.out.println(fruits);

        fruits.add("Strawberry");
        System.out.println(fruits);


    }
}
