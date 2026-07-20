import java.util.Scanner;

public class EmployeeMain {

    static Scanner sc = new Scanner(System.in);
    static EmployeeDAO dao = new EmployeeDAO();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n==============================");
            System.out.println(" EMPLOYEE PAYROLL SYSTEM ");
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

                    // Employee ID Validation
                    while (true) {
                        System.out.print("Enter Employee ID : ");
                        try {
                            id = Integer.parseInt(sc.nextLine());

                            if (id > 0)
                                break;
                            else
                                System.out.println("Employee ID must be greater than 0.");
                        }
                        catch (Exception e) {
                            System.out.println("Invalid Employee ID.");
                        }
                    }

                    // Employee Name Validation
                    while (true) {
                        System.out.print("Enter Employee Name : ");
                        name = sc.nextLine().trim();

                        if (name.matches("[A-Za-z ]+"))
                            break;
                        else
                            System.out.println("Name should contain only alphabets and spaces.");
                    }

                    // Department Validation
                    while (true) {
                        System.out.print("Enter Department : ");
                        department = sc.nextLine().trim();

                        if (!department.isEmpty())
                            break;
                        else
                            System.out.println("Department cannot be empty.");
                    }

                    // Designation Validation
                    while (true) {
                        System.out.print("Enter Designation : ");
                        designation = sc.nextLine().trim();

                        if (!designation.isEmpty())
                            break;
                        else
                            System.out.println("Designation cannot be empty.");
                    }

                    // Salary Validation
                    while (true) {
                        System.out.print("Enter Salary : ");

                        try {
                            salary = Double.parseDouble(sc.nextLine());

                            if (salary > 0)
                                break;
                            else
                                System.out.println("Salary must be greater than 0.");
                        }
                        catch (Exception e) {
                            System.out.println("Invalid Salary.");
                        }
                    }

                    Employee emp = new Employee(id, name, department, designation, salary);

                    dao.registerEmployee(emp);

                    break;

                case 2:

                    dao.viewEmployees();

                    break;

                case 3:

                    System.out.print("Enter Employee ID : ");

                    try {

                        id = Integer.parseInt(sc.nextLine());

                        dao.searchEmployee(id);

                    } catch (Exception e) {

                        System.out.println("Invalid Employee ID.");
                    }

                    break;

                case 4:

                    try {

                        System.out.print("Enter Employee ID : ");
                        id = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter New Salary : ");
                        salary = Double.parseDouble(sc.nextLine());

                        if (salary <= 0) {
                            System.out.println("Salary must be greater than 0.");
                        }
                        else {
                            dao.updateSalary(id, salary);
                        }

                    } catch (Exception e) {

                        System.out.println("Invalid Input.");
                    }

                    break;

                case 5:

                    try {

                        System.out.print("Enter Employee ID : ");

                        id = Integer.parseInt(sc.nextLine());

                        dao.deleteEmployee(id);

                    } catch (Exception e) {

                        System.out.println("Invalid Employee ID.");
                    }

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