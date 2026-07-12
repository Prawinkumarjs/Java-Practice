package week5;

import java.util.*;
import java.sql.*;

public class insert_multipledata_forloop {
    public static void main(String[] args) {
        try{

            Scanner sc = new Scanner(System.in);

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
                "root",
                "root");

            Statement stmt = con.createStatement();

            System.out.print("Enter the number of employee for entry: ");
            int num = sc.nextInt();

            for(int i = 1; i <= num ; i++){

                System.out.print("Enter Empid: ");
                int empId = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Enter Empname: ");
                String empName = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                String query = "INSERT INTO companies VALUES("
                                                               + empId +",'"
                                                               + empName + "',"
                                                               + salary + ")";

            

                int rows = stmt.executeUpdate(query);
                System.out.println(rows + "Employee Record Inserted Successfully");
                System.out.println();

            }

            //System.out.println(rows + "Employee Record Inserted Successfully");

            con.close();
            sc.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
