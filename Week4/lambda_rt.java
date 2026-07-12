package Week4;

interface salary{
    double salaryCalculate(double basic, double allowance);
}

public class lambda_rt {
    public static void main(String[] args) {
        
        salary sal = (basic, allowance) -> basic + allowance;
        System.out.println("Net Salary: " + sal.salaryCalculate(30000, 3000));
    }
    
}
