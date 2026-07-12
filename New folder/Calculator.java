import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int Number1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Number2: ");
        int Number2 = sc.nextInt();
        sc.nextLine();
        System.out.println("""
                1.Addition 
                2.Subtraction
                3.Multiplication
                4.Division
                5.Modulus
                """);

        System.out.print("Enter the Operation to perform: ");
        int operation = sc.nextInt();
        sc.nextLine();

        switch (operation) {
            case 1:
                System.out.println("Number1: " + Number1);
                System.out.println("Number2: " + Number2);
                System.out.println("Addition of Two Number: " + (Number1 + Number2));
                break;
            case 2:
                System.out.println("Number1: " + Number1);
                System.out.println("Number2: " + Number2);
                System.out.println("Subtraction of Two Number: " + (Number1 - Number2));
                break;
            case 3:
                System.out.println("Number1: " + Number1);
                System.out.println("Number2: " + Number2);
                System.out.println("Multiplication of Two Number: " + (Number1 * Number2));
                break;
            case 4:
                System.out.println("Number1: " + Number1);
                System.out.println("Number2: " + Number2);
                if(Number2 != 0){
                    System.out.println("Division of Two Number: " + (Number1 / Number2));
                }
                else System.out.println("Cannot divide by zero!!");
                break;
            case 5:
                System.out.println("Number1: " + Number1);
                System.out.println("Number2: " + Number2);
                if(Number2 != 0){
                    System.out.println("Modulus of Two Number: " + (Number1 % Number2));
                }
                else System.out.println("Cannot perform modulus by zero!");
                break;
        
            default:
                System.out.println("Invalid Operation. Please Enter 1 to 5!!");
                break;
        }



        sc.close();
    }
}
