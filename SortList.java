package collection;

import java.util.*;

public class SortList {
    public static void main(String[] args) {


//        List<Integer> list = new ArrayList<Integer>();
//        list.add(10);
//        list.add(30);
//        list.add(20);
//        list.add(50);
//        list.add(40);
//
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);
//
//        Collections.reverse(list);
//        System.out.println(list);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Ramesh", 30, 4000000));
        employees.add(new Employee(20, "Santosh", 29, 3500000));
        employees.add(new Employee(30, "Sanjay", 30, 4500000));
        employees.add(new Employee(40, "Pramod", 29, 5000000));



        Collections.sort(employees, new Comparator<Employee>() {

            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        });

        Collections.sort(employees, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        System.out.println(employees);


    }
}

        class MySort implements Comparator<Employee>{

        @Override
            public int compare(Employee o1, Employee o2){
            return (int) (o2.getSalary() - o1.getSalary());
        }
        }




