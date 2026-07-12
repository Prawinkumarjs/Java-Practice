package Week3;

public class withexpectionhandling {
    public static void main(String[] args) {
        // int salary = -1000;
        try{
            int salary = -1000;
            if(salary <= 0){
                System.out.println(10/0);
            }
        }
        catch(ArithmeticException e){ 
            System.out.println("Invalid Salary");
        }

        System.out.println("Employee Record Processed..");
    }
    
}
