import java.util.*;

 public class array2table {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] tables2 = new int[11];

        for(int i = 0; i <= 10; i++){
            tables2[i] = i*2;
        }

        for(int i = 0; i<=10; i++){
            System.out.println("2 X " + i + " = " + tables2[i]);
        }

        // System.out.println("------------------");

        // for(int i = 0; i <= 10; i++){
        //     System.out.println("2 X " + i + " = " + (tables2[i]= i * 2));
        // }


        


        
        
        sc.close();
    }

    
}