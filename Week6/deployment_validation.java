package Week6;
import java.util.*;

public class deployment_validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        String dept[] = department.split(",");
        System.out.println();
        for(String d:dept){
            System.out.println(d.trim());
        }
        sc.close();
    }
    
}
