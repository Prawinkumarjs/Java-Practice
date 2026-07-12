package Week3;

public class thrownewexcept {
    public static void main(String[] args) {
        int age = 16;
        if (age < 18){
            throw new ArithmeticException("Age must be 18 or above");
        }
        System.out.println("Employee Eligible");
    }
    
}
