import java.util.*;


public class Mark_sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                Welcome to RIT CAMPUS!!!
                For Your Marksheet 
                Enter the following details...>>>
                """);
        
        System.out.print("Enter Your Name: ");
        String StudentName = sc.nextLine();

        System.out.print("Enter Your Roll Number: ");
        int RollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Your Tamil Mark: ");
        int Tamilmark = sc.nextInt();
        
        System.out.print("Enter Your English Mark: ");
        int Englishmark = sc.nextInt();
        
        System.out.print("Enter Your Maths Mark: ");
        int Mathsmark = sc.nextInt();
        
        System.out.print("Enter Your Science Mark: ");
        int Sciencemark = sc.nextInt();
        
        System.out.print("Enter Your Social Mark: ");
        int Socialmark = sc.nextInt();

        int totalmark = Tamilmark + Englishmark + Mathsmark + Sciencemark + Socialmark ;
        int Average = totalmark / 5 ;
        double percentage = (totalmark / 500.0 ) * 100;
        char grade ;
        String result ;


        if(percentage >= 90){
            grade = 'A' ;
        }
        else if (percentage >= 75 ) {
            grade = 'B';
        }
        else if(percentage >=50 ){
            grade = 'C';
        }
        else{
            grade = 'F'; 
        }

        if(grade == 'A'|| grade == 'B' || grade == 'C'){
            result = "PASS";
        }
        else{
            result = "FAIL";
        }


        System.out.println("<<<------RIT CAMPUS------>>>");
        System.out.println("STUDENT PORTAL");
        System.out.println("Student Details");

        System.out.println("Name: " + StudentName);
        System.out.println("Roll Number: " + RollNumber);
        System.out.println("Tamil: " + Tamilmark);
        System.out.println("English: " + Englishmark);
        System.out.println("Maths: " + Mathsmark);
        System.out.println("Science: " + Sciencemark);
        System.out.println("Social: " + Socialmark);

        System.out.println("Total Marks: " + totalmark);
        System.out.println("Average: " + Average);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        //System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);        
        
        sc.close();

    }
}
