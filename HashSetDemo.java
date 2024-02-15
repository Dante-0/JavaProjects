package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
//            nullValue();
//            duplicateValue();
            unordered();
    }

    private static void duplicateValue() {
            Set<String> set = new HashSet<>();
            set.add("Element 1");
            set.add("Element 1");
            System.out.println(set.toString());
    }

    private static void unordered() {
            Set<String> set = new HashSet<>();
            set.add("Element1");
            set.add("Element2");
            set.add("Element4");
            set.add("Element5");
            set.add("Element7");
            set.add("Element6");
        System.out.println(set.toString());
    }

    private static void nullValue() {
            Set<String> set = new HashSet<>();
            set.add(null);
            set.add(null);
            System.out.println(set.toString());
        }
    }

