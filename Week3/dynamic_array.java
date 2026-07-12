package Week3;

import java.util.ArrayList;

public class dynamic_array {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Revi");
        student.add("Ratha");
        student.add("Max");

        System.out.println("Student list");
        for(String students : student){
            System.out.println(students);
        }

        
        System.out.println();
        System.out.println("--Adding New Student--");
        System.out.println();
        student.add("Gwen");
        for(String students : student){
            System.out.println(students);
        }
        System.err.println();
    }
}
