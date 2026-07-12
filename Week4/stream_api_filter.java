package Week4;

import java.util.*;

public class stream_api_filter {

    public static void main(String[] args) {

        ArrayList<Integer> salaries = new ArrayList<>();

        salaries.add(25000);
        salaries.add(45000);
        salaries.add(50000);
        salaries.add(60000);

        System.out.println(" Employee's Salary > 40000");

        salaries.stream()
                .filter(salary -> salary > 40000)
                .forEach(salary -> System.out.println("Salary: " + salary));
    }
}
