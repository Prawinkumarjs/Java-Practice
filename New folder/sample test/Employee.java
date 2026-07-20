public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;
    private String department;
    private String designation;
    private double salary;

    // Default Constructor
    public Employee() {

    }

    // Parameterized Constructor
    public Employee(int empId, String empName, String department,
                    String designation, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getter Methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    // Setter Methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Sort by Employee Name (Ascending)
    @Override
    public int compareTo(Employee e) {
        return this.empName.compareToIgnoreCase(e.empName);
    }

    // Display Employee Details
    @Override
    public String toString() {

        return String.format(
                "%-8d %-20s %-15s %-20s %.2f",
                empId,
                empName,
                department,
                designation,
                salary
        );
    }
}