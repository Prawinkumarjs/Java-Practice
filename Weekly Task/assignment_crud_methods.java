import java.util.*;
import java.sql.*;

public class assignment_crud_methods {

    static Scanner sc = new Scanner(System.in);
    static Connection con;

    static void connectDatabase() {
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "root");

            System.out.println("Connection Successful");

        } catch (SQLException e) {
            System.out.println("Database Connection Failed!");
            System.out.println(e.getMessage());
        }
    }

    static int menu() {

        System.out.println("\n----------- EMPLOYEE CRUD -----------");
        System.out.println("1. Insert Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Update Employee Salary");
        System.out.println("4. Delete Employee");
        System.out.println("5. Exit");
        System.out.print("Enter Choice : ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid Choice! Enter numbers only.");
            sc.next();
            return 0;
        }

        return sc.nextInt();
    }

    static void insertEmployee() {

        try {

            System.out.print("Enter Employee ID : ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid Employee ID! Only numbers are allowed.");
                sc.next();
                return;
            }

            int empId = sc.nextInt();

            if (empId <= 0) {
                System.out.println("Employee ID must be greater than 0.");
                return;
            }

            sc.nextLine();

            System.out.print("Enter Employee Name : ");
            String empName = sc.nextLine().trim();

            if (empName.isEmpty()) {
                System.out.println("Employee Name cannot be empty.");
                return;
            }

            if (!empName.matches("[a-zA-Z ]+")) {
                System.out.println("Invalid Employee Name! Only alphabets are allowed.");
                return;
            }

            System.out.print("Enter Salary : ");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid Salary! Enter numeric value.");
                sc.next();
                return;
            }

            double salary = sc.nextDouble();

            if (salary <= 0) {
                System.out.println("Salary must be greater than 0.");
                return;
            }

            String query = "INSERT INTO fireemployee VALUES(?,?,?)";

            try (PreparedStatement ps = con.prepareStatement(query)) {

                ps.setInt(1, empId);
                ps.setString(2, empName);
                ps.setDouble(3, salary);

                int row = ps.executeUpdate();

                if (row > 0)
                    System.out.println("Employee Inserted Successfully!");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void viewEmployees() {

        try {

            String query = "SELECT * FROM fireemployee";

            try (PreparedStatement ps = con.prepareStatement(query);
                 ResultSet rs = ps.executeQuery()) {

                boolean found = false;

                System.out.println("\nEmployee Details");
                System.out.println("--------------------------------");

                while (rs.next()) {

                    found = true;

                    System.out.println("Employee ID     : " + rs.getInt("empId"));
                    System.out.println("Employee Name   : " + rs.getString("empName"));
                    System.out.println("Employee Salary : " + rs.getDouble("salary"));
                    System.out.println();
                }

                if (!found)
                    System.out.println("No Employees Found.");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void updateEmployee() {

        try {

            System.out.print("Enter Employee ID : ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid Employee ID! Only numbers are allowed.");
                sc.next();
                return;
            }

            int empId = sc.nextInt();

            if (empId <= 0) {
                System.out.println("Employee ID must be greater than 0.");
                return;
            }

            System.out.print("Enter New Salary : ");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid Salary! Enter numeric value.");
                sc.next();
                return;
            }

            double salary = sc.nextDouble();

            if (salary <= 0) {
                System.out.println("Salary must be greater than 0.");
                return;
            }

            String query = "UPDATE fireemployee SET salary=? WHERE empId=?";

            try (PreparedStatement ps = con.prepareStatement(query)) {

                ps.setDouble(1, salary);
                ps.setInt(2, empId);

                int row = ps.executeUpdate();

                if (row > 0)
                    System.out.println("Employee Updated Successfully!");
                else
                    System.out.println("Employee Not Found!");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void deleteEmployee() {

        try {

            System.out.print("Enter Employee ID : ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid Employee ID! Only numbers are allowed.");
                sc.next();
                return;
            }

            int empId = sc.nextInt();

            if (empId <= 0) {
                System.out.println("Employee ID must be greater than 0.");
                return;
            }

            String query = "DELETE FROM fireemployee WHERE empId=?";

            try (PreparedStatement ps = con.prepareStatement(query)) {

                ps.setInt(1, empId);

                int row = ps.executeUpdate();

                if (row > 0)
                    System.out.println("Employee Deleted Successfully!");
                else
                    System.out.println("Employee Not Found!");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void closeConnection() {

        try {

            if (con != null)
                con.close();

            sc.close();

            System.out.println("Thank You!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        connectDatabase();

        if (con == null)
            return;

        while (true) {

            int choice = menu();

            switch (choice) {

                case 1:
                    insertEmployee();
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    updateEmployee();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    closeConnection();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}