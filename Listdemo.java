package collection;

import java.util.ArrayList;
import java.util.List;

public class Listdemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 1");
        list.add("element 2");
        System.out.println(list);

        list.add(null);
        list.add(null);
        System.out.println(list);
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");
        list.add("element 5");
        System.out.println(list);

        System.out.println(list.get(6));

    }
}
