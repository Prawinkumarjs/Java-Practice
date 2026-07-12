package week5;

import java.util.*;
import java.sql.*;

public class insert_data_prepared_stmt {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            // connection the drivermanager
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
                "root",
                "root");
            
            //query as preparedstatement and have place holder
            String query = "INSERT INTO employee VALUES(?,?,?)";

            // preparedstmt 
            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Enter the number of employee new entry: ");
            int num = sc.nextInt();

            for(int i = 1; i <= num; i++){

                System.out.print("Enter Employee ID: ");
                int empId = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                String empName = sc.nextLine();
                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();

                ps.setInt(1, empId);
                ps.setString(2, empName);
                ps.setDouble(3, salary);

                int row = ps.executeUpdate();
                
                if(row  > 0){
                    System.out.println("Employee Inserted Successfully");
                }
            }
            sc.close();
            con.close();


        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
