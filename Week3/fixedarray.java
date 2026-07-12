package Week3;

public class fixedarray {
    public static void main(String[] args) {
        String[] student = new String[3];

        student[0] = "Revi";
        student[1] = "Sam";
        student[2] = "Nun";
        
        System.out.println("Student Lists");
        for( String students : student){
            System.out.println(students);
        }
    }
    
}
