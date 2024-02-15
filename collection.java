package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("banana");
        col.add("apple");
        col.add("mango");
        System.out.println(col);

        col.remove("banana");
        System.out.println(col);

        System.out.println(col.contains("apple"));

        col.forEach((element) -> {
            System.out.println(element);
        });

        col.clear();
        System.out.println(col);
    }
}
