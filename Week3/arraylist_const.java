package Week3;

import java.util.*;

class Student{
    //initialize
    int studentid;
    String studentname;
    String department;

    // contructor

    Student(int studentid, String studentname, String department){
        this.studentid = studentid;
        this.studentname = studentname;
        this.department = department;
    }

    //display

    void display(){
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class arraylist_const {
    public static void main(String[] args) {

        // arraylist
        ArrayList<Student> students = new ArrayList<>();

        // assigning or adding 
        students.add(new Student(101,"Ram","ECE"));
        students.add(new Student(102, "Tyson", "Mech"));
        students.add(new Student(103, "Ash", "IT"));

        for(Student s: students){
            
            s.display();

        }
    }
    
}
