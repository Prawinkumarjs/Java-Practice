// student grace mark
package Week4;

import java.util.*;

public class stream_api_map2 {

    public static void main(String[] args) {
        
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(45);
        marks.add(95);
        marks.add(98);

        System.out.println("Marks after grace");

        marks.stream()
        .map(maks -> maks + 5)
        .forEach(System.out::println);
    }
}