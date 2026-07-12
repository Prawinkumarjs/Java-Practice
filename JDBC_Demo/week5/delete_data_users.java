package week5;


import java.sql.*;
import java.util.*;

public class delete_data_users {

    public static void main(String[] args) {
        
        try{
            Scanner sc = new Scanner(System.in);

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
                "root",
                "root");
            
            Statement stmt = con.createStatement();

            System.out.print("Enter EmployeeId: ");
            int empId = sc.nextInt();
            

            String query = "delete from employee where empId=" + empId;
            int row = stmt.executeUpdate(query);

            if(row>0){
                System.out.println("Employee deleted successfully");
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
