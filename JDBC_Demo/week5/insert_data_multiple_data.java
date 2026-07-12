package week5;

import java.sql.*;
import java.util.*;

public class insert_data_multiple_data {

    public static void main(String[] args) {
        
        try{

            Scanner sc = new Scanner(System.in);

            // establishing connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
                                                    "root",
                                                "root");
                                            
            // creating stmt object
            Statement stmt = con.createStatement();

            //sql query
           // String query = "INSERT INTO employee VALUES(101,'ram', 30000)";

            // user entry of data

            System.out.print("Enter empId: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter empName: ");
            String empName = sc.nextLine();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            // String query1 = "INSERT INTO employee VALUES("+empId + ',' + empName + ',' + salary +  ")";
            String query1 = "INSERT INTO employee VALUES("
                                                        + empId + ",'"
                                                        + empName + "',"
                                                        + salary + ")";

            // executing query
            //int rows = stmt.executeUpdate(query);
            int rows1 = stmt.executeUpdate(query1);

            // System.out.println(rows + rows1 +"Employee Record Inserted Successfully");
            System.out.println(rows1 +"Employee Record Inserted Successfully");
            con.close();
            sc.close();

        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}



// System.out.println("Enter the number of employee to be enter: ");
            // int n = sc.nextInt();

            // for(int i = 1; i<=n;i++){

            // }