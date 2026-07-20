import java.sql.*;
import java.util.*;
import java.io.FileWriter;

public class EmployeeDAO {

    Connection con = DBConnection.getConnection();

    // ================= REGISTER EMPLOYEE =================
    public void registerEmployee(Employee emp) {

        try {

            String sql = "INSERT INTO employee VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, emp.getEmpId());
            ps.setString(2, emp.getEmpName());
            ps.setString(3, emp.getDepartment());
            ps.setString(4, emp.getDesignation());
            ps.setDouble(5, emp.getSalary());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("\nEmployee Registered Successfully...");
            }

        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("\nDuplicate Employee ID!");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // ================= VIEW ALL EMPLOYEES =================
    public void viewEmployees() {

        try {

            String sql = "SELECT * FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            System.out.println("\n----------------------------------------------------------------------------");
            System.out.printf("%-8s %-20s %-15s %-20s %-10s\n",
                    "ID","NAME","DEPARTMENT","DESIGNATION","SALARY");
            System.out.println("----------------------------------------------------------------------------");

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.printf("%-8d %-20s %-15s %-20s %-10.2f\n",
                        rs.getInt("empid"),
                        rs.getString("empname"),
                        rs.getString("department"),
                        rs.getString("designation"),
                        rs.getDouble("salary"));
            }

            if (!found) {
                System.out.println("No Employees Found.");
            }

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // ================= SEARCH EMPLOYEE =================
    public void searchEmployee(int id) {

        try {

            String sql = "SELECT * FROM employee WHERE empid=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("\nEmployee Found");

                System.out.println("--------------------------");
                System.out.println("Employee ID   : " + rs.getInt("empid"));
                System.out.println("Employee Name : " + rs.getString("empname"));
                System.out.println("Department    : " + rs.getString("department"));
                System.out.println("Designation   : " + rs.getString("designation"));
                System.out.println("Salary        : " + rs.getDouble("salary"));

            } else {

                System.out.println("\nEmployee Not Found.");

            }

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // ================= UPDATE SALARY =================
    public void updateSalary(int id, double salary) {

        try {

            String sql = "UPDATE employee SET salary=? WHERE empid=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("\nSalary Updated Successfully...");
            }
            else {
                System.out.println("\nEmployee Not Found.");
            }

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        // ================= DELETE EMPLOYEE =================
    public void deleteEmployee(int id) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Are you sure (Y/N): ");
            char choice = sc.next().toUpperCase().charAt(0);

            if(choice == 'Y') {

                String sql = "DELETE FROM employee WHERE empid=?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, id);

                int rows = ps.executeUpdate();

                if(rows > 0) {
                    System.out.println("\nEmployee Deleted Successfully...");
                }
                else {
                    System.out.println("\nEmployee Not Found.");
                }

            }
            else {
                System.out.println("\nDelete Operation Cancelled.");
            }

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // ================= SORT BY NAME (COMPARABLE) =================
    public void sortByName() {

        ArrayList<Employee> list = new ArrayList<>();

        try {

            String sql = "SELECT * FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                list.add(new Employee(
                        rs.getInt("empid"),
                        rs.getString("empname"),
                        rs.getString("department"),
                        rs.getString("designation"),
                        rs.getDouble("salary")
                ));
            }

            Collections.sort(list);

            System.out.println("\n------------- SORTED BY NAME -------------");
            System.out.printf("%-8s %-20s %-15s %-20s %-10s\n",
                    "ID","NAME","DEPARTMENT","DESIGNATION","SALARY");

            for(Employee e : list) {
                System.out.println(e);
            }

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // ================= SORT BY SALARY (COMPARATOR) =================
    public void sortBySalary() {

        ArrayList<Employee> list = new ArrayList<>();

        try {

            String sql = "SELECT * FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                list.add(new Employee(
                        rs.getInt("empid"),
                        rs.getString("empname"),
                        rs.getString("department"),
                        rs.getString("designation"),
                        rs.getDouble("salary")
                ));
            }

            Collections.sort(list, new Comparator<Employee>() {

                @Override
                public int compare(Employee e1, Employee e2) {

                    if(e1.getSalary() < e2.getSalary())
                        return 1;
                    else if(e1.getSalary() > e2.getSalary())
                        return -1;
                    else
                        return 0;
                }
            });

            System.out.println("\n--------- SORTED BY SALARY (DESC) ---------");
            System.out.printf("%-8s %-20s %-15s %-20s %-10s\n",
                    "ID","NAME","DEPARTMENT","DESIGNATION","SALARY");

            for(Employee e : list) {
                System.out.println(e);
            }

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // ================= EXPORT TO FILE =================
    public void exportToFile() {

        try {

            String sql = "SELECT * FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            FileWriter fw = new FileWriter("employee.txt");

            fw.write("Employee Details\n");
            fw.write("=============================================================\n");

            while(rs.next()) {

                fw.write(
                        rs.getInt("empid") + "\t" +
                        rs.getString("empname") + "\t" +
                        rs.getString("department") + "\t" +
                        rs.getString("designation") + "\t" +
                        rs.getDouble("salary") + "\n"
                );
            }

            fw.close();

            System.out.println("\nEmployee Details Exported Successfully...");

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}