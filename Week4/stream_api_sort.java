package Week4;

import java.util.*;

public class stream_api_sort {
    public static void main(String[] args) {
        
        ArrayList<Integer> salaries = new ArrayList<>();

        salaries.add(35000);
        salaries.add(25000);
        salaries.add(45000);
        salaries.add(87000);
        salaries.add(56000);

        System.out.println("Sorted Salaries");

        salaries.stream()
        .sorted()
        .forEach(System.out::println);
    }
    
}
