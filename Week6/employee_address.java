package Week6;

import java.util.Scanner;

public class employee_address {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Address: ");
        String address = sc.nextLine();

        // Remove leading and trailing spaces
        address = address.trim();

        System.out.println("\n------ Address Details ------");

        // Length
        System.out.println("Length: " + address.length());

        // Uppercase
        System.out.println("Upper Case: " + address.toUpperCase());

        // Lowercase
        System.out.println("Lower Case: " + address.toLowerCase());

        // Contains
        System.out.println("Contains 'Chennai': " + address.contains("Chennai"));

        // Starts With
        System.out.println("Starts With 'No': " + address.startsWith("No"));

        // Ends With
        System.out.println("Ends With 'India': " + address.endsWith("India"));

        // Replace
        System.out.println("Replace Chennai with Madurai:");
        System.out.println(address.replace("Chennai", "Madurai"));

        // Substring
        if (address.length() > 10) {
            System.out.println("Substring: " + address.substring(10));
        }

        // Split
        System.out.println("\nAddress Words:");

        String[] words = address.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}