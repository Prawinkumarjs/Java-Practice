package Week4;


import java.util.*;

public class stream_api_map {
    public static void main(String[] args) {
        
        ArrayList <Integer> salaries = new ArrayList<>();

        salaries.add(25000);
        salaries.add(30000);
        salaries.add(40000);
        salaries.add(50000);

        System.out.println("Salaries after increment");

        salaries.stream()
        .map(salary -> salary + 5000)
        .forEach(System.out::println);
    
    }
    
}
