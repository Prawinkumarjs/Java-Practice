package Week3;
import java.util.HashMap;


class Student1{
    int studentid;
    String studentname;
    String deparment;

    //constructor with the parameters

    Student1(int studentid, String studentname, String department){
        this.studentid = studentid;
        this.studentname = studentname;
        this.deparment = department;
    }

    //display the student information

    void display(){
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);
        System.out.println("Department: " + deparment);
        System.out.println("----------------------------");
    }
}

public class hashmap_array {
    public static void main(String[] args) {
        

        // hashmap 
        HashMap<Integer,Student1>  studentmap = new HashMap<>();

        //put function is used as input 
        studentmap.put(101,new Student1(001, "Rex", "ECE"));
        studentmap.put(102, new Student1(002, "Kevin", "MECH"));
        studentmap.put(103, new Student1(003, "Vilgax ", "IT"));


        //get function is used to get or fetch output
        Student1 student = studentmap.get(102);
        Student1 student1 = studentmap.get(103);

        // function call for display
        student.display();
        student1.display();
    }
    
}
