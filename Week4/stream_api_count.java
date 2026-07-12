package Week4;

import java.util.*;

public class stream_api_count {

    public static void main(String[] args) {
        
        ArrayList<Integer> score = new ArrayList<>();
        score.add(70);
        score.add(85);
        score.add(60);
        score.add(90);
        score.add(95);

        long count = score.stream()
                     .filter(scores -> scores >= 80)
                     .count();

        System.out.println("Employees Eligible for Promotion: " + count);
    }
    
}
