package Week4;

import java.util.*;

public class assignment3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(72);
        marks.add(90);
        marks.add(88);
        marks.add(65);
        marks.add(95);
        marks.add(80);
        marks.add(91);
        marks.add(78);
        marks.add(86);
        marks.add(70);

        System.out.println("Marks greater than or equal to 85");

        marks.stream()
        .filter(mark -> mark >= 85)
        .forEach(System.out::println);
    }
    
}
