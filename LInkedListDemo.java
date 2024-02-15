package collection;

import java.util.LinkedList;

public class LInkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println("Initial Linkedlist -> " +fruits);

        fruits.add(2,"Watermelon");
        System.out.println(fruits);


        fruits.addFirst("Strawberry");
        System.out.println(fruits);

        fruits.addLast("Orange");
        System.out.println(fruits);



    }
}
