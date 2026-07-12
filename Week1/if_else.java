import java.util.*;

public class if_else {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age: ");
        int age = sc.nextInt();
        

        if (age >= 18 && age <= 100) System.out.println("Eligible for Vote");
        else if(age < 0 || age > 100) System.out.println("Enter the correct age!!!");
        else System.out.println("Not Eligible for Vote");

        // System.out.println(age >= 18 ? "YES Eligible" : "NOT ELIGIBLE");
        sc.close();
    }
}
