package Week3;

import java.util.*;

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> Stdmark = new ArrayList<>();

        System.out.println("Enter the Student Mark of 5 Subject: ");

        for(int i = 1; i <= 5;i++){
            System.out.print("Mark " + i + ":");
            Stdmark.add(sc.nextInt());    
        }

        System.out.println();
        System.out.println("Student Marks: ");

        for(Integer secmark : Stdmark){
            // for(int j = 1; j <= 5; j++){
            // System.out.println("Mark "+ j +":" + secmark);
            System.out.println("Mark :" + secmark);
        // }
        }

        // total marks

        int totalmark = 0;
        for(Integer totmark : Stdmark){
            totalmark = totalmark + totmark;
        }

        // average
        double average = (double)totalmark/ Stdmark.size();

        // highest and lowest
        int highest = Collections.max(Stdmark);
        int lowest = Collections.min(Stdmark);

        


        //display
        System.out.println();
        System.out.println("Total Marks: " + totalmark);
        System.out.println("Average: " + average);

        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        


        sc.close();
    }
    
}
