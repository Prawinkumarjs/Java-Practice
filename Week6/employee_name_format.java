package Week6;
import java.util.*;

public class employee_name_format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Name: ");
        String name = sc.nextLine();
        name = name.trim();
        String formatted = name.substring(0,1).toUpperCase() +
                            name.substring(1).toLowerCase();
        
        System.out.println("Formatted Name: " + formatted);
        sc.close();

    }
    
}
