package Week3;

public class trycatchfinally {
    public static void main(String[] args) {
        try{
            System.out.println("Database Connected");
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Database Connection Closed");
        }
    }
    
}
