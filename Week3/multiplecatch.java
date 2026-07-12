package Week3;

public class multiplecatch {
    public static void main(String[] args) {
        
        try{
            int salary = Integer.parseInt("abc");
            int arr[] = new int[3];
            // int salary = Integer.parseInt("100");
            // int arr[] = new int[3];
            // arr[1] = 12;
            // arr[2] = 13;
            System.out.println(arr[2]);
            System.out.println(salary);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Salary Format");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Invalid Array Index");
        }
    }
    
}
