package collection;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

      Map<String, String> map = new HashMap<String, String>();
      map.put("key1", "value1");
      map.put("key2", "value2");
      map.put("key3", "value3");
      map.put("key4", "value4");

      Iterator<String> iterator = map.keySet().iterator();
      while(iterator.hasNext()){
          String key = (String) iterator.next();
          System.out.println(key);
      }

      Iterator<String> iterator1 = map.values().iterator();
      while(iterator1.hasNext()){
          String value = (String) iterator1.next();
          System.out.println(value);
      }

    }
}
