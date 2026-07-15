package Week6;

public class recursion {
    static void display(int n){
    if(n == 0){
        return;
    }
    System.out.println("Employee ID : emp10" + n);
    display(n-1);
}
    public static void main(String[] args) {
        int n = 5;
        display(n);

        
    }
    
}
