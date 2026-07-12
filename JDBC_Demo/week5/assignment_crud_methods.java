package week5;
import java.util.*;
import java.sql.*;

public class assignment_crud_methods {

    static Scanner sc = new Scanner(System.in);
    static Connection con;

    static void connectDatabase(){
        try{
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "root");
            
            System.out.println("Connection Successful");
        }catch(Exception e){
            e.getMessage();
        }
    }

    static int menu(){
        System.out.println("\n---------- EMPLOYEE CRUD ------------");
        System.out.println("1. Insert Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Update Employee Salary");
        System.out.println("4. Delete Employee");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    static void insertEmployee(){
        try{
            String insertquery = "INSERT INTO fireemployee VALUES(?,?,?)";
            PreparedStatement ps1 = con.prepareStatement(insertquery);

            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            ps1.setInt(1, empId);
            ps1.setString(2, empName);
            ps1.setDouble(3, salary);

            int row = ps1.executeUpdate();

            if(row > 0){
                System.out.println("Employee Inserted Successfully!!!");
            }
            ps1.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    static void viewEmployees(){
        try{
            String selectquery = "SELECT * FROM fireemployee";
            PreparedStatement ps2 = con.prepareStatement(selectquery);

            ResultSet rs = ps2.executeQuery();

            System.out.println("\nEmployee Details");
            System.out.println("----------------------------------");

            while (rs.next()) {
                System.out.println("Employee ID     : " + rs.getInt("empId"));
                System.out.println("Employee Name   : " + rs.getString("empName"));
                System.out.println("Employee Salary : " + rs.getDouble("salary") );
                
            }
            rs.close();
            ps2.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void deleteEmployee(){
        try{
            String deleteQuery = "DELETE FROM fireemployee WHERE empId=?";
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
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void updateEmployee(){
        try{
            String updateQuery = "UPDATE fireemployee SET salary=? WHERE empId=?";
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
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    static void closeConnection(){
        try{
            System.out.println("Thank You !");
            con.close();
            sc.close();
            System.exit(0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){

    connectDatabase();

    while(true){

        int choice = menu();

        switch(choice){

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
                System.out.println("Invalid Choice");
        }
    }
}
    
}
