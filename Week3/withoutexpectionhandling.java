package Week3;

public class withoutexpectionhandling {
    public static void main(String[] args) {
        int salary = -1000;
        if( salary <= 0){
            System.out.println(10/0);
        }
        System.out.println("Employee added");
    }
    
}
