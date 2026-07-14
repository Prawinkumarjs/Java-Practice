package Week6;
import java.util.*;

public class email_generator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Name: ");
        String name = sc.nextLine();
        name = name.trim();
        name = name.replace(" ", ".");
        name = name.toLowerCase();
        System.out.println("Official Email: " + name + "@company.com");
        sc.close();
        
    }
    
}
