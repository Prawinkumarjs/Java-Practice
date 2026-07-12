import java.util.*;

public class Student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter the Student age: ");
    
        int age = sc.nextInt(); // int can't be used sc.nextline // nextLine() returns String, not int
        sc.nextLine(); // this is used to clear buffer
        
        System.out.println("Enter the Student Department: ");
        String dept = sc.nextLine();

        System.out.println("---Students Details---");
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + dept);
        sc.close();
        

    }
}
