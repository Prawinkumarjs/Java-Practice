package Week4;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class buffer_read_and_write {
    public static void main(String[] args) {
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("attendance.txt"));
            for(int i = 0; i <= 100; i++){
                writer.write("Employee ID: " + i);
                writer.newLine();
                writer.write("Employee Name: Employee" + i);
                writer.newLine();
                writer.write("Status: Present");
                writer.newLine();
                writer.newLine();
            }
            writer.close();
            System.out.println("Employee's status is  Recorded");

            System.out.println();
            System.out.println("Reading Employee Records");
            System.out.println();

            BufferedReader reader = new BufferedReader(new FileReader("attendance.txt"));
            String line ;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
            reader.close();


        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    
}
