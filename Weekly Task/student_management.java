import java.util.*;

public class student_management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // student id user
        System.out.print("Enter the Student ID: ");
        int studentid = sc.nextInt();
        sc.nextLine();
        // student name user
        System.out.print("Enter the Student Name: ");
        String studentname = sc.nextLine();
        //subject mark user
        System.out.print("Enter the Mark of Subject1: ");
        int subject1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Mark of Subject2: ");
        int subject2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Mark of Subject3: ");
        int subject3 = sc.nextInt();
        sc.nextLine();

        // total mark
        int totalmark = subject1 + subject2 + subject3;

        // average mark
        double averagemark = totalmark / 3.0;

        // grade
        char grade;
        if(averagemark >= 90){
            grade = 'A';
        }
        else if(averagemark >= 75){
            grade = 'B';
        }
        else if (averagemark >= 50) {
            grade = 'C';   
        }
        else{
            grade = 'D';
        }

        //result(pass/fail)
        String result ;
        if (subject1 >= 35 && subject2 >= 35 && subject3 >= 35) {
            result = "PASS";
        }
        else{
            result = "FAIL";
        }

        
        // output screen
        System.out.println("-----STUDENT REPORT-----");

        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);

        System.out.println("Subject1: " + subject1);
        System.out.println("Subject2: " + subject2);
        System.out.println("Subject3: " + subject3);

        System.out.println("Total: " + totalmark);
        System.out.println("Average: " + averagemark);

        System.out.println("Grade: " + grade);
        System.err.println("Result: " + result);

        sc.close();
    }
}
