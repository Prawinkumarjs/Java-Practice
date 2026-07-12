package week5;

import java.sql.*;

public class select_retrive_data_by_executivequery {

    public static void main(String[] args) {
        
        try{

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
                                                    "root",
                                                "root");


            Statement stmt = con.createStatement();
            String query = "SELECT * FROM companies";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Employee Details");
            System.out.println("-----------------------------");

            while (rs.next()) {
                System.out.println("Employee ID: " +  rs.getInt("empId"));
                System.out.println("Employee Name: " + rs.getString("empName"));
                System.out.println("Salary: " + rs.getDouble("salary"));
                System.out.println();
                
            }

            
            con.close();



        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}