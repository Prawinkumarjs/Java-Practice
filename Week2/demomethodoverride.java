
class employee3{
    int empId;
    String name;
    double salary;
    
    employee3(int empId, String name, double salary){
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

class developer extends  employee3{
    String programmingLanguage;

    developer(int empId,
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


public class demomethodoverride {
    public static void main(String[] args) {
        developer dev = new developer(101, "Ram",50000,"JAVA");
        dev.display();
    }

    
}
