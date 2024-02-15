package collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsInArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Grapes");

        System.out.println(fruits);

        fruits.remove(4);
        System.out.println(fruits);

        fruits.remove("Mango");

        System.out.println(fruits);

        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");

        fruits.removeAll(list2);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);
    }
}
