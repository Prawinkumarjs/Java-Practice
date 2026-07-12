class employee6{
    private  int empid;
    private String name;
    private double salary;

    employee6(int empid, String name, double salary){
        this.empid = empid;
        this.name = name;
        setSalary(salary);
    }

    void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
        else{
            System.out.println("Invalid salary");
        }
    }

    double getSalary(){
        return salary;
    }

    void display(){
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee salary: " + salary);
    }

}

public class demoencapulsation {
    public static void main(String[] args) {
        employee6 emp = new employee6(101, "RAM", 50000);
        emp.display();
        System.out.println();
        System.out.println("Salary Using Getter: " + emp.getSalary());
    }
    
}
