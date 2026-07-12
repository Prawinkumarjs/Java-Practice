class employee5{
    void createemployee(){
        System.out.println("Employee Created");
    }
    void createemployee(int empid, String name){
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
    }
    void createemployee(int empid, String name, double salary){
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee name: " + name);
        System.out.println("Salaray: " + salary);
    }
}


public class demooverload {
    public static void main(String[] args) {
        employee5 emp = new employee5();
        emp.createemployee();
        emp.createemployee(101, "RAM");
        emp.createemployee(102,"RAVI",50000);

    }
    
}
