package week5;

import java.sql.*;
import java.util.*;

public class select_data_prepared_stmt {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            // Establish Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "root");

            // SQL Query
            String query = "SELECT * FROM employee WHERE empId = ?";

            // PreparedStatement
            PreparedStatement ps = con.prepareStatement(query);

            // User Input
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();

            // Set Value
            ps.setInt(1, empId);

            // Execute Query
            ResultSet rs = ps.executeQuery();

            // Check if record exists
            if (rs.next()) {

                System.out.println("\nEmployee Details");
                System.out.println("---------------------------");
                System.out.println("Employee ID   : " + rs.getInt("empId"));
                System.out.println("Employee Name : " + rs.getString("empName"));
                System.out.println("Salary        : " + rs.getDouble("salary"));

            } else {

                System.out.println("Employee Not Found.");

            }


            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());;

        }
    }
}