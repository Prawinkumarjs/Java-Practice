
class employee4{
    int empId;
    String name;
    double salary;
    
    employee4(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class developer1 extends  employee4{
    String programmingLanguage;

    developer1(int empId,
        String name, 
        double salary,
        String programminglanguage)
    {
        super(empId,name,salary);
        this.programmingLanguage = programminglanguage;
    }
    @Override
    void display(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class tester extends  employee4{
    String testingtool;

    tester(int empId,
        String name, 
        double salary,
        String testingtool)
    {
        super(empId,name,salary);
        this.testingtool = testingtool;
    }
    @Override
    void display(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Testing tool:" + testingtool);
    }
}

public class demopolymorp {
    public static void main(String[] args) {
        employee4 emp;
        emp = new developer1(101, "ram", 50000, "JAVA");
        emp.display();

        System.out.println("--------------------------");
        emp = new tester(102, "ravi", 45000, "Selenium");
        emp.display();
    }
}
