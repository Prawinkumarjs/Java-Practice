package week5;

import java.sql.*;
import java.util.*;

public class update_data_prepared_stmt {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            // Establish Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "root");

            // SQL Query
            String query = "UPDATE employee SET salary = ? WHERE empId = ?";

            // Prepare Statement
            PreparedStatement ps = con.prepareStatement(query);

            // User Input
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();

            System.out.print("Enter New Salary: ");
            double salary = sc.nextDouble();

            // Set Values
            ps.setDouble(1, salary);
            ps.setInt(2, empId);

            // Execute Update
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Salary Updated Successfully!");
            } else {
                System.out.println("Employee ID Not Found!");
            }

    
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}