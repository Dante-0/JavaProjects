package collection;

import java.util.ArrayList;
import java.util.List;

public class AccessArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("C");
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add(".net");

        System.out.println(list.size());

        System.out.println(list.get(1));

        System.out.println(list.get(2));

        System.out.println(list.set(4, "C#"));
        System.out.println(list);
    }
}
