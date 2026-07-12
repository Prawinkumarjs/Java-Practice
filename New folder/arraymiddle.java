import java.util.*;

public class arraymiddle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arrary: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("-------");

        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }

        if(n%2!=0){
            System.out.println("Middle element: " + (array[array.length/2]));
        }
        else{
            System.out.println("Middle element1: " + (array[(array.length/2)-1]));
            System.out.println("Middle element2: " + (array[array.length/2]));
        }


        sc.close();
        
    }
}
