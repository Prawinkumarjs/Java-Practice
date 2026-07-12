package Week4;

import java.io.FileReader;
import java.io.FileWriter;


public class file_write_and_read {

    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("Employee Details.txt");

            writer.write("Employee ID: 100\n");
            writer.write("Employee Name: Prawin\n");
            writer.write("Salary: 20000\n");
            writer.close();
            System.out.println("Employee Data has been saved successfully...");

            System.out.println();
            System.out.println("Here the detail...");
            System.out.println();

            FileReader reader = new FileReader("Employee Details.txt");
            int ch;
            while ((ch = reader.read())!= -1) {
                System.out.print((char)ch);
                
            }
            reader.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
