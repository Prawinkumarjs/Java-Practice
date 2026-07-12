package week5;

import java.util.*;
import java.sql.*;

public class update_data_users {

    public static void main(String[] args) {
        
        try{
            Scanner sc = new Scanner(System.in);

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
                "root",
                "root");
            
            Statement stmt = con.createStatement();

            System.out.print("Enter EmployeeId: ");
            int empId = sc.nextInt();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            String query = "update employee set salary=" + salary + "where empId=" + empId;
            int row = stmt.executeUpdate(query);

            if(row>0){
                System.out.println("Salary Updated successfully");
            }
            else{
                System.out.println("Employee not found");
            }
            sc.close();
            con.close();


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
