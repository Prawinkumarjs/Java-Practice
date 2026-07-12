package Week3;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {

        HashSet<String> courses = new HashSet<>();

        courses.add("Python");
        courses.add("Web Development");
        courses.add("Java");
        courses.add("Java");
        System.out.println("Registered Courses: ");

        for(String learncourse : courses){
            System.out.println(learncourse);
        }
        System.out.println();

        if(courses.contains("Java")){
            System.out.println("Java Course Available");
        }

        System.out.println();

        courses.remove("Python");

        System.out.println("After removing python");

        for(String learncourses: courses){
            System.out.println(learncourses);
        }

        System.out.println();
        System.out.println("Total Courses: " + courses.size());
        
    }
}
