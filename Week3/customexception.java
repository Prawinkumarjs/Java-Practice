package Week3;

class InvalidSalaryException extends Exception{
    InvalidSalaryException(String message){
        super(message);
    }
}

public class customexception {
    static void validatesalary(double salary) throws InvalidSalaryException{
        if(salary <= 0){
            throw new InvalidSalaryException("Salary must be greater than zero");
        }
    }

    public static void main(String[] args) {
        
        try{
            validatesalary(-5000);
        }
        catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }

    }
    
}
