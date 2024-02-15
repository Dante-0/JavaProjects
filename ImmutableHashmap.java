package collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ImmutableHashmap {
    public static void main(String[] args) {



        Map<String, String> map = Map.ofEntries(
                Map.entry("1","Banana"),
                Map.entry("2", "Mango"));
        System.out.println(map);


    }
}
