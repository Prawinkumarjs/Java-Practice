package week5;

import java.sql.*;
import java.util.*;

public class employeeCRUD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "root");

            while (true) {

                System.out.println("\n---------- EMPLOYEE CRUD ------------");
                System.out.println("1. Insert Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Update Employee Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    // INSERT
                    case 1:

                        String insertQuery = "INSERT INTO employee VALUES(?,?,?)";
                        PreparedStatement ps1 = con.prepareStatement(insertQuery);

                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setDouble(3, salary);

                        int rows = ps1.executeUpdate();

                        if (rows > 0)
                            System.out.println("Employee Inserted Successfully!");

                        ps1.close();
                        break;

                    // SELECT
                    case 2:

                        String selectQuery = "SELECT * FROM employee";
                        PreparedStatement ps2 = con.prepareStatement(selectQuery);

                        ResultSet rs = ps2.executeQuery();

                        System.out.println("\nEmployee Details");
                        System.out.println("-----------------------------------------");

                        while (rs.next()) {

                            System.out.println("Employee ID   : " + rs.getInt("empId"));
                            System.out.println("Employee Name : " + rs.getString("empName"));
                            System.out.println("Salary        : " + rs.getDouble("salary"));
                            System.out.println("-----------------------------------------");
                        }

                        rs.close();
                        ps2.close();
                        break;

                    // UPDATE
                    case 3:

                        String updateQuery =
                                "UPDATE employee SET salary=? WHERE empId=?";

                        PreparedStatement ps3 = con.prepareStatement(updateQuery);

                        System.out.print("Enter Employee ID: ");
                        int updateId = sc.nextInt();

                        System.out.print("Enter New Salary: ");
                        double newSalary = sc.nextDouble();

                        ps3.setDouble(1, newSalary);
                        ps3.setInt(2, updateId);

                        int updateRows = ps3.executeUpdate();

                        if (updateRows > 0)
                            System.out.println("Employee Updated Successfully!");
                        else
                            System.out.println("Employee Not Found!");

                        ps3.close();
                        break;

                    // DELETE
                    case 4:

                        String deleteQuery =
                                "DELETE FROM employee WHERE empId=?";

                        PreparedStatement ps4 = con.prepareStatement(deleteQuery);

                        System.out.print("Enter Employee ID: ");
                        int deleteId = sc.nextInt();

                        ps4.setInt(1, deleteId);

                        int deleteRows = ps4.executeUpdate();

                        if (deleteRows > 0)
                            System.out.println("Employee Deleted Successfully!");
                        else
                            System.out.println("Employee Not Found!");

                        ps4.close();
                        break;

                    // EXIT
                    case 5:

                        System.out.println("Thank You!");
                        con.close();
                        sc.close();
                        System.exit(0);

                    default:

                        System.out.println("Invalid Choice!");
                }
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }
}