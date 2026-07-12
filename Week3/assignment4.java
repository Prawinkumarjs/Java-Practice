package Week3;

import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

// Student Class
class AdmissionStudent {

    String name;
    int age;

    AdmissionStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("\n===== Student Details =====");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class assignment4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();

            // Validate Age
            if (age < 18) {
                throw new InvalidAgeException(
                        "Admission Failed! Age must be 18 or above.");
            }

            // Create Student Object
            AdmissionStudent student = new AdmissionStudent(name, age);

            System.out.println("\nAdmission Successful!");
            student.display();

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        } finally {

            sc.close();
        }
    }
}