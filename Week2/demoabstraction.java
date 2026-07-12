abstract class employee7 {
    int empid;
    String name;
    double salary;

    employee7(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    abstract void work();

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class developer2 extends employee7 {

    developer2(int empid, String name, double salary) {
        super(empid, name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " is working as a Developer.");
    }
}

public class demoabstraction {
    public static void main(String[] args) {

        developer2 dev = new developer2(101, "Ram", 50000);

        dev.display();
        System.out.println();

        dev.work();
    }
}