package collection;

import java.util.LinkedList;

public class RetrieveLinkedListElements {
    public static void main(String[] args) {


        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pineapple");

        String firstele = fruits.getFirst();
        System.out.println("First Elements => " +firstele);

        String lastele = fruits.getLast();
        System.out.println("Last Elements => " +lastele);

        String ele = fruits.get(1);
        System.out.println("Element => " +ele);

        for(String element : fruits){
            System.out.println(element);
        }
    }
}
