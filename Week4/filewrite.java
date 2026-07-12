package Week4;

import java.io.FileWriter;

public class filewrite {
    public static void main(String[] args) {
        
        try{
            FileWriter writer = new FileWriter("Employee.txt");

            writer.write("Employee ID: 101\n");
            writer.write("Employee Name: Sam\n");
            writer.write("Salary: 50000\n");
            writer.close();
            System.out.println("Employee Data Saved");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
