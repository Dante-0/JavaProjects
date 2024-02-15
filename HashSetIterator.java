package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterator {
    public static void main(String[] args) {

        Set<String> courses = new HashSet<String>();

        courses.add("Java");
        courses.add("C");
        courses.add("C++");
        courses.add("Python");
        courses.add("Scala");

//        for (String course : courses) {
//            System.out.println(course);
//        }

//        for (Iterator iterator = courses.iterator(); iterator.hasNext();){
//            String string = (String) iterator.next();
//            System.out.println(string);
//        }

//        Iterator<String> iterator = courses.iterator();
//        while(iterator.hasNext()){
//            String string = (String) iterator.next();
//            System.out.println(string);
//        }

//        courses.forEach( course-> System.out.println(course));

//          courses.stream().filter(course -> !"Java".equals(course)).forEach(course-> System.out.println(course));

    }

}
