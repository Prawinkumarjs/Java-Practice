import java.util.*;

class Course{
    int courseid;
    String coursename;
    String Trainername;
    int fees;

    Course(int courseid,
        String coursename, 
        String Trainername,
        int fees
        )
        {
            this.courseid = courseid;
            this.coursename = coursename;
            this.Trainername = Trainername;
            this.fees = fees;
            

        }

        void display(){
            System.out.println();
            System.out.println("Course ID: " + courseid);
            System.out.println("Course Name: " + coursename);
            System.out.println("Trainer Name: " + Trainername);
            System.out.println("Course Fees: " + fees);
            System.out.println();

        }
}

public class Training_Institute_Management_System {

    // Fee Validation Method
    public static void validateFee(int fee) throws Exception {

        if (fee <= 0) {
            throw new Exception("Invalid Course Fee");
        }

    }

    public static void main(String[] args) {
        
        
        ArrayList<Course> inststcourse = new ArrayList<>();
        // add course by arraylist
        inststcourse.add(new Course(101, "Python", "John", 5000));
        inststcourse.add(new Course(102, "Java", "Jack", 5500));
        inststcourse.add(new Course(103, "Data Analysis", "Indhu", 6000));
        inststcourse.add(new Course(104, "AIML", "Karuppan", 7000));
        inststcourse.add(new Course(105, "Web Development", "Sandy", 6500));
        // duplicate 
        inststcourse.add(new Course(105, "Web Development", "Sandy", 6500));

        // display arraylist
        for(Course iCourse: inststcourse){
            iCourse.display();
        }


        // hashmap
        HashMap<Integer, Course> instcourse = new HashMap<>();

        // add course by hashmap

        instcourse.put(101, new Course(101, "Python", "John", 5000));
        instcourse.put(102, new Course(102, "Java", "Jack", 5500));
        instcourse.put(103, new Course(103, "Data Analysis", "Indhu", 6000));
        instcourse.put(104, new Course(104, "AIML", "Karuppan", 7000));
        instcourse.put(105, new Course(105, "Web Development", "Sandy", 6500));

        // search operation
        Course admCourse = instcourse.get(101);

        if(instcourse.containsKey(101)){
            System.out.println("Searching...");
            System.out.println();
            System.out.println("Course Found!!!");
            System.out.println("Yes we Got Course ");
            System.out.println();
            System.out.println("Details of Course:");
            admCourse.display();
        }
        else{
            System.out.println("Invalid ID");
        }

        // removing the course

        instcourse.remove(105);

        if(instcourse.containsKey(105)){
            System.out.println("Retry Again");
        }
        else{
            System.out.println("Course Removed Successfully...");
            System.out.println("Here the Course List After Removing..");
            admCourse.display();
    

        }

        // Hashset<string>
        HashSet<String> Technologies = new HashSet<>();

        // adding technologies using hashset

        Technologies.add("Java");
        Technologies.add("Python");
        Technologies.add("SpringBoot");
        Technologies.add("SQL");
        Technologies.add("AIML");
        Technologies.add("SQL");  // duplicate
        
        
        System.out.println();
        System.out.println("Technologies List");

        // printing
        for(String technology: Technologies){
            System.out.println(technology);
        }
        System.out.println();

        // remove springboot

        Technologies.remove("SpringBoot");
        if(Technologies.contains("SpringBoot")){
            System.out.println("Error! Retry");
        }
        else{
            System.out.println("SpringBoot Removed Successfully");
            System.out.println();
            System.out.println("Updated List");
            System.out.println();
            for(String technology: Technologies){
            System.out.println(technology);
        }
        System.out.println();
            
        }
        System.out.println("Total Technologies: " + Technologies.size());
        System.out.println();

        // marks of course secured by student

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> Stdmark = new ArrayList<>();

        System.out.println("Enter the Student Mark of 5 Courses: ");

        for(int i = 1; i <= 5;i++){
            System.out.print("Mark " + i + ":");
            Stdmark.add(sc.nextInt());    
        }

        System.out.println();
        System.out.println("Student Marks: ");

        for(Integer secmark : Stdmark){
            
            System.out.println(secmark);
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

        try {

            validateFee(-2000);

            Course course = new Course(106,"C++", "Ram", -2000);

        } catch (Exception e) {

            System.out.println("\n" + e.getMessage());

        }
        


        sc.close();

        


}



    
    
}
