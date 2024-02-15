package collection;

import java.util.LinkedList;

public class RemoveElementsFromLinkedList {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pineapple");

        System.out.println("Initial LinkedList = " + fruits);

        String element = fruits.removeFirst();
        System.out.println("First Element Removal = " + element);

        String element2 = fruits.removeLast();
        System.out.println("Last Element Removal = " + element2);

        fruits.remove("Apple");

        System.out.println(fruits);

        fruits.clear();

        System.out.println(fruits);

    }
}
