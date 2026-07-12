package Week3;

import java.util.ArrayList;

public class boxingandunboxing {
    public static void main(String[] args) {
        ArrayList <Integer> marks = new ArrayList<>();

        // autoboxing
        marks.add(82);
        marks.add(93);
        marks.add(89);
        marks.add(99);
        marks.add(100);

        int Total = 0;
        for(Integer mark : marks){
            Total = Total + mark;
           // System.out.println(Total);
        }

        // unboxing
        double average = (double) Total / marks.size();
        System.out.println("Total Marks: " + Total);
        System.out.println("Average: " + average);
        
    }
    
}
