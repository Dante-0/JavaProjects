package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);

        List<Integer> list1 = new ArrayList<>(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(13);
        list2.add(17);
        list2.add(19);
        list2.add(23);
        list2.add(29);

        list1.addAll(list2);
        System.out.println(list1);


    }
}
