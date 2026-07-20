package Test;

import java.util.*;
import java.sql.*;
import java.io.*;

class Employee {
    int empId;
    String empName;
    String department;
    String designation;
    double salary;

    Employee(int empId, String empName,
             String department,
             String designation,
             double salary) {

        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }
}

class DBConnection {

    static Connection con;

static Connection getConnection() {

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/abctechnologies",
                "root",
                "root");

        System.out.println("Database Connected");

    }
    catch(Exception e) {

        System.out.println("Database Connection Failed");
        e.printStackTrace();

    }

    return con;
}
}

class EmployeeDAO {

    void registerEmployee(Employee emp) {

    Connection con = DBConnection.getConnection();

    try {

        String query = "INSERT INTO employee VALUES(?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, emp.empId);
        ps.setString(2, emp.empName);
        ps.setString(3, emp.department);
        ps.setString(4, emp.designation);
        ps.setDouble(5, emp.salary);

        int result = ps.executeUpdate();

        if(result > 0) {
            System.out.println("Employee Registered Successfully");
        }

    }
    catch(SQLException e) {

        System.out.println(e);
    }

}

    void viewEmployees() {

    Connection con = DBConnection.getConnection();

    try {

        String query = "SELECT * FROM employee";

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);


        boolean found = false;


        while(rs.next()) {

            found = true;

            System.out.println("----------------------------");
            System.out.println("Employee ID : " + rs.getInt(1));
            System.out.println("Employee Name : " + rs.getString(2));
            System.out.println("Department : " + rs.getString(3));
            System.out.println("Designation : " + rs.getString(4));
            System.out.println("Salary : " + rs.getDouble(5));

        }


        if(!found) {
            System.out.println("No Employee Records Found");
        }


    }
    catch(SQLException e) {

        System.out.println(e);

    }

}

    void searchEmployee(int id) {

    Connection con = DBConnection.getConnection();

    try {

        String query = "SELECT * FROM employee WHERE empId=?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1,id);

        ResultSet rs = ps.executeQuery();


        if(rs.next()) {

            System.out.println("Employee Found");

            System.out.println("Name : "+rs.getString(2));
            System.out.println("Department : "+rs.getString(3));
            System.out.println("Designation : "+rs.getString(4));
            System.out.println("Salary : "+rs.getDouble(5));

        }
        else {

            System.out.println("Employee Not Found");

        }

    }
    catch(SQLException e) {

        System.out.println(e);

    }

}

    void updateSalary(int id,double salary) {

    Connection con = DBConnection.getConnection();

    try {

        String query =
        "UPDATE employee SET salary=? WHERE empId=?";


        PreparedStatement ps =
        con.prepareStatement(query);


        ps.setDouble(1,salary);
        ps.setInt(2,id);


        int result = ps.executeUpdate();


        if(result>0)
            System.out.println("Salary Updated Successfully");
        else
            System.out.println("Employee Not Found");


    }
    catch(SQLException e) {

        System.out.println(e);

    }

}

    void deleteEmployee(int id) {

    Connection con = DBConnection.getConnection();

    try {

        String query =
        "DELETE FROM employee WHERE empId=?";


        PreparedStatement ps =
        con.prepareStatement(query);


        ps.setInt(1,id);


        int result = ps.executeUpdate();


        if(result>0)
            System.out.println("Employee Deleted Successfully");
        else
            System.out.println("Employee Not Found");


    }
    catch(SQLException e) {

        System.out.println(e);

    }

}

    void sortByName() {

    Connection con = DBConnection.getConnection();

    try {

        String query =
        "SELECT * FROM employee ORDER BY empName";


        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);


        while(rs.next()) {

            System.out.println(
            rs.getInt(1)+" "+
            rs.getString(2)+" "+
            rs.getDouble(5));

        }

    }
    catch(SQLException e) {

        System.out.println(e);

    }

}

    void sortBySalary() {

    Connection con = DBConnection.getConnection();

    try {

        String query =
        "SELECT * FROM employee ORDER BY salary DESC";


        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);


        while(rs.next()) {

            System.out.println(
            rs.getString(2)+" "+
            rs.getDouble(5));

        }

    }
    catch(SQLException e) {

        System.out.println(e);

    }

}

    void exportToFile() {

    Connection con = DBConnection.getConnection();


    try {

        Statement st = con.createStatement();

        ResultSet rs =
        st.executeQuery("SELECT * FROM employee");


        BufferedWriter bw =
        new BufferedWriter(
        new FileWriter("employee.txt"));


        while(rs.next()) {

            bw.write(
            rs.getInt(1)+" "+
            rs.getString(2)+" "+
            rs.getString(3)+" "+
            rs.getString(4)+" "+
            rs.getDouble(5));

            bw.newLine();

        }


        bw.close();

        System.out.println("Data Exported Successfully");


    }
    catch(Exception e) {

        System.out.println(e);

    }

}
}

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {

            System.out.println("\n==============================");
            System.out.println("EMPLOYEE PAYROLL SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Register Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Sort by Name");
            System.out.println("7. Sort by Salary");
            System.out.println("8. Export to File");
            System.out.println("9. Exit");
            System.out.print("Enter Your Choice : ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid Menu Choice!");
                continue;
            }

            switch (choice) {

                case 1:

                    int id;
                    double salary;
                    String name, department, designation;

                    try {
                        System.out.print("Enter Employee ID : ");
                        id = Integer.parseInt(sc.nextLine());
                        if(id <= 0) {
                            System.out.println("ID must be greater than 0");
                            break;
                        }

                        }
                        catch(Exception e) {
                            System.out.println("Invalid ID. Enter numbers only");
                            break;

                        }

                    System.out.print("Enter Employee Name : ");
                    name = sc.nextLine();
                    if(!name.matches("[a-zA-Z ]+")) {
                        System.out.println("Name should contain only alphabets");
                        break;
                        }

                    System.out.print("Enter Department : ");
                    department = sc.nextLine();
                    if(!department.matches("[a-zA-Z ]+")) {
                        System.out.println("Department should contain only alphabets");
                        break;
                        }

                    System.out.print("Enter Designation : ");
                    designation = sc.nextLine();
                    if(!designation.matches("[a-zA-Z ]+")) {
                        System.out.println("Designation should contain only alphabets");
                        break;
                        }

                    try {
                        System.out.print("Enter Salary : ");
                        salary = Double.parseDouble(sc.nextLine());
                        if(salary <= 0) {
                            System.out.println("Salary must be greater than 0");
                            break;
                        }
                    }
                    catch(Exception e) {
                        System.out.println("Invalid Salary");
                        break;
                    }

                    Employee emp = new Employee(id, name, department, designation, salary);

                    dao.registerEmployee(emp);

                    break;

                case 2:
                    dao.viewEmployees();
                    break;


                case 3:

                    System.out.print("Enter Employee ID : ");
                    int searchId=Integer.parseInt(sc.nextLine());

                    dao.searchEmployee(searchId);
                    break;


                case 4:

                    System.out.print("Enter Employee ID : ");
                    int updateId=Integer.parseInt(sc.nextLine());

                    System.out.print("Enter New Salary : ");
                    double newSalary=Double.parseDouble(sc.nextLine());

                    dao.updateSalary(updateId,newSalary);

                    break;


                case 5:

                    System.out.print("Enter Employee ID : ");
                    int deleteId=Integer.parseInt(sc.nextLine());

                    dao.deleteEmployee(deleteId);

                    break;


                case 6:

                    dao.sortByName();
                    break;


                case 7:

                    dao.sortBySalary();
                    break;
                case 8:
                    dao.exportToFile();
                    break;

                case 9:
                    System.out.println("Thank You...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Menu Choice.");
            }
        }
       
    }
        
}