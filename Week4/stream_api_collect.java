package Week4;

import java.util.*;
import java.util.stream.Collectors;

public class stream_api_collect {
    public static void main(String[] args) {
        
        ArrayList<Integer> score = new ArrayList<>();
        score.add(70);
        score.add(95);
        score.add(60);
        score.add(90);
        score.add(85);

        
        List<Integer> eligibleemployees = score.stream()
                                          .filter(scores -> scores >= 80)
                                          .collect(Collectors.toList());
        
        System.out.println("Eligible Employees");
        eligibleemployees.forEach(System.out::println);

    }
    
}
