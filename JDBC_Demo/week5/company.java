package week5;
import java.sql.DriverManager;
import java.sql.Connection;

public class company {
    public static void main(String[] args) {

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
                                                    "root",
                                                "root");
            
            System.out.println("Connected Successfully");
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


        
    }
    
}
