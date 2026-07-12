package week5;

import java.sql.*;
import java.util.Scanner;

public class delete_data_prepared_stmt {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            // Establish Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "root");

            // SQL Query
            String query = "DELETE FROM employee WHERE empId = ?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(query);

            // User Input
            System.out.print("Enter Employee ID to Delete: ");
            int empId = sc.nextInt();

            // Set Parameter
            ps.setInt(1, empId);

            // Execute Delete
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Record Deleted Successfully!");
            } else {
                System.out.println("Employee ID Not Found!");
            }

           
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}