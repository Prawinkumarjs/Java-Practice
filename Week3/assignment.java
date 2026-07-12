package Week3;

import java.util.ArrayList;
import java.util.HashMap;

class Collegestudent{
    int studentid;
    String studentname;
    String department;

    Collegestudent(int studentid, String studentname, String deparment){
        this.studentid = studentid;
        this.studentname = studentname;
        this.department = deparment;
    }

    void display(){
        // System.out.println("----Display Student details using Array List----");
        System.out.println();
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);
        System.out.println("Department: " + department);
        System.out.println("---------------------------------");

    }
    
}

public class assignment {
    public static void main(String[] args) {
        
        ArrayList<Collegestudent> cstudents = new ArrayList<>();
        HashMap<Integer, Collegestudent> clgstudent = new HashMap<>();

        cstudents.add(new Collegestudent(101,"Ram","ECE"));
        cstudents.add(new Collegestudent(102, "Tyson", "Mech"));
        cstudents.add(new Collegestudent(103, "Ash", "IT"));

        for(Collegestudent cs: cstudents){
            cs.display();
        }

        clgstudent.put(001, new Collegestudent(001, "Maddy", "ECE"));
        clgstudent.put(002, new Collegestudent(002, "Jack", "MECH"));
        clgstudent.put(003, new Collegestudent(003, "Tom", "IT"));

        Collegestudent student = clgstudent.get(002);

        if(clgstudent.containsKey(002)){
            System.out.println("Student Found");
            System.out.println("Detail of the student:");
            student.display();
        }

        clgstudent.put(004, new Collegestudent(004, "Max", "CSE"));

        Collegestudent student1 = clgstudent.get(004);
        student1.display();

        clgstudent.remove(4);

        if(clgstudent.containsKey(4)){
            System.out.println("Student Exists");
        }
        else{
            System.out.println("Student Removed Successfully");
        }


    }
    
}
