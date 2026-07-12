class employee2 {
    int empid;
    String name;
    double salary;

    employee2(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }
}

class developer extends employee2 {
    String programminglanguages;

    developer(int empid, String name, double salary, String programminglanguages) {
        super(empid, name, salary);   // call parent constructor
        this.programminglanguages = programminglanguages;
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Programming Language: " + programminglanguages);
    }
}

public class demoinheritance {
    public static void main(String[] args) {
        developer dev = new developer(101, "ram", 50000, "JAVA");
        dev.display();
    }
}