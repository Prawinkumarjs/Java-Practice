package week5;

import java.sql.*;

public class insert_data_jdbc {

    public static void main(String[] args) {
        
        try{

            // establishing connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
                                                    "root",
                                                "root");
                                            
            // creating stmt object
            Statement stmt = con.createStatement();

            //sql query
            // String query = "INSERT INTO employee VALUES(101,'ram', 30000)";
            String query1 = "INSERT INTO employee VALUES(103,'sam', 30000)";


            // executing query
            // int rows = stmt.executeUpdate(query);
            int rows1 = stmt.executeUpdate(query1);

            // System.out.println(rows + "Employee Record Inserted Successfully");
            System.out.println(rows1 + "Employee Record Inserted Successfully");
            con.close();

        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
