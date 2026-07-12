package Week4;
import java.util.*;

public class method_reference {
    public static void main(String[] args) {
        
        ArrayList<String> employee = new ArrayList<>();

        employee.add("Ram");
        employee.add("Vinoth");
        employee.add("Karthi");
        employee.add("Sathya");
        employee.add("Santhosh");

        System.out.println("Employees Details: ");

        employee.forEach(System.out::println);
    }
    
}
