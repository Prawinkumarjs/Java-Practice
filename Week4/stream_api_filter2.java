package Week4;

import java.util.*;

public class stream_api_filter2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(56);
        marks.add(78);
        marks.add(89);
        marks.add(90);
        marks.add(45);
        marks.add(34);

        System.out.println("Students marks above 76");

        marks.stream()
                .filter(mark -> mark > 76)
                .forEach(System.out::println);
    }
    
}
