package Week4;

interface employee{
    void performTask();
}
public class lambda2employee {
    public static void main(String[] args) {
        
        employee emp = () -> System.out.println("Employee Completed Daily Task");
        employee emp1 = ()-> System.out.println("Varata mamae durr..");
        emp.performTask();
        emp1.performTask();
    }
    
}
