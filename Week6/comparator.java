package Week6;

import java.util.*;

class Employee1 {

    int id;
    String name;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class comparator {

    public static void main(String[] args) {

        ArrayList<Employee1> list = new ArrayList<>();

        list.add(new Employee1(103, "Priya"));
        list.add(new Employee1(101, "Hari"));
        list.add(new Employee1(102, "Ganesh"));

        // Sort by Employee Name
        Collections.sort(list, new Comparator<Employee1>() {

            @Override
            public int compare(Employee1 e1, Employee1 e2) {

                return e1.name.compareTo(e2.name);

            }
        });

        System.out.println("Sorted by Name");

        for (Employee1 e : list) {
            System.out.println(e.id + " " + e.name);
        }
    }
}