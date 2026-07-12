import java.util.*;

public class Marksheetgpt {

    // Helper Method for Integer Validation
    public static int getValidInteger(Scanner sc) {

        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter numbers only: ");
            sc.next();
        }

        return sc.nextInt();
    }

    // Helper Method for Name Validation
    public static String getValidName(Scanner sc) {

        String name = sc.nextLine();

        while (!name.matches("[a-zA-Z ]+")) {

            System.out.print("Invalid Name! Enter alphabets only: ");
            name = sc.nextLine();
        }

        return name;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("""
                Welcome to RIT CAMPUS!!!
                For Your Marksheet
                Enter the following details...>>>
                """);

        // Student Name
        System.out.print("Enter Your Name: ");
        String studentName = getValidName(sc);

        // Roll Number
        System.out.print("Enter Your Roll Number: ");
        int rollNumber = getValidInteger(sc);

        // Tamil Mark
        System.out.print("Enter Your Tamil Mark: ");
        int tamilMark = getValidInteger(sc);

        // English Mark
        System.out.print("Enter Your English Mark: ");
        int englishMark = getValidInteger(sc);

        // Maths Mark
        System.out.print("Enter Your Maths Mark: ");
        int mathsMark = getValidInteger(sc);

        // Science Mark
        System.out.print("Enter Your Science Mark: ");
        int scienceMark = getValidInteger(sc);

        // Social Mark
        System.out.print("Enter Your Social Mark: ");
        int socialMark = getValidInteger(sc);

        // Total Calculation
        int totalMark = tamilMark + englishMark + mathsMark + scienceMark + socialMark;

        // Average
        double average = totalMark / 5.0;

        // Percentage
        double percentage = (totalMark / 500.0) * 100;

        // Subject Fail Check
        boolean subjectFail =
                tamilMark < 35 ||
                englishMark < 35 ||
                mathsMark < 35 ||
                scienceMark < 35 ||
                socialMark < 35;

        char grade;
        String result;

        // Grade Calculation
        if (percentage >= 90) {
            grade = 'A';
        }

        else if (percentage >= 75) {
            grade = 'B';
        }

        else if (percentage >= 50) {
            grade = 'C';
        }

        else {
            grade = 'F';
        }

        // Final Result Logic
        if (subjectFail) {
            result = "FAIL";
            grade = 'F';
        }

        else {
            result = "PASS";
        }

        // Output Section
        System.out.println("\n<<<------RIT CAMPUS------>>>");
        System.out.println("STUDENT PORTAL");
        System.out.println("Student Details");

        System.out.println("Name        : " + studentName);
        System.out.println("Roll Number : " + rollNumber);

        System.out.println("\nMarks");

        System.out.println("Tamil   : " + tamilMark);
        System.out.println("English : " + englishMark);
        System.out.println("Maths   : " + mathsMark);
        System.out.println("Science : " + scienceMark);
        System.out.println("Social  : " + socialMark);

        System.out.println("\nResult Summary");

        System.out.println("Total Marks : " + totalMark);

        System.out.printf("Average     : %.2f\n", average);

        System.out.printf("Percentage  : %.2f%%\n", percentage);

        System.out.println("Grade       : " + grade);

        System.out.println("Result      : " + result);

        sc.close();
    }
}