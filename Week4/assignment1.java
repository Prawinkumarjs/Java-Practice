package Week4;
import java.io.*;


public class assignment1 {
    public static void main(String[] args) {
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Result.txt"));
            for(int i = 1; i <= 20; i++){
                writer.write("Student ID : " + i);
                writer.newLine();
                writer.write("Student Name: Student" + i);
                writer.newLine();
                writer.write("Status: Pass");
                writer.newLine();
                writer.newLine();
            }
            writer.close();
            System.out.println("Student Result is Stored");
            System.out.println();

            System.out.println("Student Result Details");
            System.out.println();

            BufferedReader reader = new BufferedReader(new FileReader("Result.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
}
