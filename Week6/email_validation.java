package Week6;

import java.util.*;

public class email_validation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine().trim();

        if (email.contains("@") &&
            email.endsWith(".com") &&
            !email.startsWith("@")) {

            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}