class employee  {
    int employeeid ;
    String employeename ;
    double salary ;

    void display(){
        System.out.println("Employee ID: " + employeeid);
        System.out.println("Employee Name: " + employeename);
        System.out.println("Employee Salary: " + salary);
        System.out.println("------------------------");
    }

    
}


public class demoemployee {
    public static void main(String[] args) {
        employee emp1 = new employee();

        emp1.employeeid = 101;
        emp1.employeename = "Sai";
        emp1.salary = 50000.00;
        
        employee emp2 = new employee();
        emp2.employeeid = 102;
        emp2.employeename = "Ravi";
        emp2.salary = 45000.00;

        emp1.display();
        emp2.display();

    }
    
}
