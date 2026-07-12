class employee1{
    int empid;
    String empname;
    double salary;

    // constructor
    employee1(int id, String name, double sal) {

        empid = id;
        empname = name;
        salary = sal;
    }

    void display(){
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee Salary: " + salary);
        System.out.println("------------------------");
    }
}

public class democonstructor {
    public static void main(String[] args) {
        employee1 emp1 = new employee1(101,"SAM",50000);
        employee1 emp2 = new employee1(102,"RAM",50000);

        emp1.display();
        emp2.display();

    }    
}

