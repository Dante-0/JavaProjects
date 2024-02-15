package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchDemo {
    public static void main(String[] args) {
        LinkedList<String> program = new LinkedList<>();

        program.add("C");
        program.add("C++");
        program.add("Core Java");
        program.add("Java EE");
        program.add("Spring ");
        program.add("Spring Framework");
        program.add("Hibernate Framework");

        boolean result = program.contains("C");
        System.out.println("Result = " + result);

        int index = program.indexOf("Core Java");
        System.out.println("Index = " + index);

        int lastIndex = program.lastIndexOf(program);
        System.out.println("Last = " + program);

        Iterator<String> iterator = program.iterator();
        while(iterator.hasNext()){
            String prog = (String) iterator.next();
            System.out.println(prog);
        }


        program.forEach((element) -> {
            System.out.println(element);
        });

        for(String str:program){
            System.out.println(str);
        }


    }
}
