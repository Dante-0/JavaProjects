package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("C++");
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");

        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forward Direction Iteration: ");
        while(listIterator.hasNext()){
            String str = listIterator.next();
            System.out.println(str);
        }

        System.out.println();
        System.out.println("Backward Direction Iteration: ");
        while(listIterator.hasPrevious()){
            String str = listIterator.previous();
            System.out.println(str);
        }
    }
}
