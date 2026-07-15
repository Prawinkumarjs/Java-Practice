package Week6;
import java.util.*;


class Employee implements Comparable<Employee>{
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    // comparable methods
    @Override
    public int compareTo(Employee e){
        return this.id - e.id;
    }
}

public class comparable {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(103, "Priya"));
        list.add(new Employee(100, "Ganesh"));
        list.add(new Employee(100, "Hari"));

        //sort employees by id
        Collections.sort(list);
        // display output
        System.out.println("Employee List");
        for(Employee e : list){
            System.out.println(e.id + " " + e.name);
        }
    }
    
}
