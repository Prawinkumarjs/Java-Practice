import java.io.*;
import java.util.Scanner;

public class buf_r_w_user {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("attendance.txt"));

            System.out.print("Enter number of employees: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            for (int i = 1; i <= n; i++) {

                System.out.println("\nEmployee " + i);

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Status (Present/Absent): ");
                String status = sc.nextLine();

                writer.write("Employee ID: " + id);
                writer.newLine();

                writer.write("Employee Name: " + name);
                writer.newLine();

                writer.write("Status: " + status);
                writer.newLine();
                writer.newLine();
            }

            writer.close();

            System.out.println("\nEmployee records saved successfully!");

            System.out.println("\nReading Employee Records:\n");

            BufferedReader reader =
                    new BufferedReader(new FileReader("attendance.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}