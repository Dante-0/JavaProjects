package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterations {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("C","C++", "Java", "Spring", "Hibernate");

        for(int i = 0; i<courses.size(); i++){
            System.out.println(courses.get(i));
        }

        for(String course:courses){
            System.out.println(course);
        }

        for(Iterator iterator = courses.iterator(); iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        Iterator<String> iterator = courses.iterator();
        while(iterator.hasNext()){
            String course = (String) iterator.next();
            System.out.println(course);

        }
        courses.stream().forEach(course -> System.out.println(course));

        courses.forEach((course) -> System.out.println(course));

    }
}
