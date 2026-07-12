package Week3;

import java.util.ArrayList;

public class arraylistprimitivetoobject {
    public static void main(String[] args) {
        ArrayList<Integer> mark = new ArrayList<>();

        mark.add(83);
        mark.add(89);
        mark.add(93);
        mark.add(100);
        mark.add(99);

        System.out.println(mark); // this is autoboxing

        System.out.println("Student Mark: ");
        for(Integer Marks : mark){
            System.out.println(Marks);
        }
    }
    
}
