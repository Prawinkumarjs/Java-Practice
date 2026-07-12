import java.util.*;

public class Dummy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to RIT CINEMAS...");
        System.out.println("Today's show is Coolie...");
        System.out.println("Coolie...(A Certificate Film)");

        System.out.println("What Can I help you!!!..");
        System.out.println("1. Booking the Ticket.\n2.Enquire for the Ticket. \n3. Cancelling the Ticket. \n4.Exit");

        System.out.println("Enter your option: ");
        int option = sc.nextInt();
        sc.nextLine();

        System.out.println("  ");

        switch(option){
            case 1:
                System.out.println("1.Booking the Ticket");
                System.out.println("Enter Your Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Your Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                if(age >= 18 && age <= 100){
                    System.out.println("---$ RIT CINEMA $---");
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("""
                            Your Ticket is Confirmed!!
                            Your Ticket no. 202XXXX
                            Thanks for Visiting
                            """);
                    System.out.println("Thank You... Visit Again... :)");
                }
                else if(age < 0 || age > 100){
                    System.out.println("Please enter correct age!!!");
                }

                else{
                    System.out.println("---$ RIT CINEMA $---");
                    System.out.println("""
                            OOPS!!! Sorry for Inconvenience!!!
                            Your not 18 years old
                            This moive is only for above 18 years only!!!
                            """);
                }
            break;


            //case 2.Enquire for the Ticket.

            case 2:
                System.out.println("2.Enquire for the Ticket");
                System.out.println("Please Enter Your Details for Enquiry...");
                System.out.println("Enter Your Name: ");
                String Name = sc.nextLine();
                System.out.println("Enter Your TicketNo: ");
                String TicketNo = sc.next();
                //sc.nextLine();
                
                //if(TicketNo == "202XXXX" )
                if(TicketNo.equals("202XXXX"))
                    {
                    System.out.println("---$ RIT CINEMA $---");
                    System.out.println("Yes Ticket is Booked and Confirmed.Your Show time is hh:mm");
                    System.out.println("Here the details");
                    System.out.println("Name: " + Name);
                    System.out.println("""  
                            TicketNo: 202XXXX
                            Enjoy Your Movie...:)
                            """);
                    //System.out.println("Thank You... Visit Again... :)");

                }
                else{
                    System.out.println("---$ RIT CINEMA $---");
                    System.out.println("""
                            Sorry Your Ticket is not found!!
                            Please Try again and enter correctly!!!!
                            """);
                }
                break;
            
            // case 3.Cancelling the Ticket
            case 3:
                System.out.println("3. Cancelling the Ticket");
                System.out.println("""
                        For Cancelling your ticket, do the following instruction.
                        """);
                System.out.println("Enter Your Name: ");
                String Cname = sc.nextLine();
                System.out.println("Enter Your TicketNo: ");
                String Ticket_No = sc.nextLine();

                //if (Ticket_No == "202XXXX") 
                if(Ticket_No.equals("202XXXX"))
                    {
                    System.out.println("---$ RIT CINEMA $---");
                    System.out.println("Yes, Your Ticket is Cancelled..:(");
                    System.out.print("""
                            Here the details  
                            TicketNo: 202XXXX
                            """);
                    System.out.println("Name: "+ Cname);
                    System.out.println("Thank You... Visit Again... :)");
                    
                }
                else{
                    System.out.println("---$ RIT CINEMA $---");
                    System.out.println("""
                            Sorry We couldn't find it!!
                            Please try again and enter correctly!!
                            """);
                }
                break;


            // case 4.Exit
            case 4:
                System.out.println("---$ RIT CINEMA $---");
                System.out.println("Thank You... Visit Again... :)");
                break;
            default:
                System.out.println("---$ RIT CINEMA $---");
                System.out.println("Invalid Choice! Please enter 1 to 4.");







        }
            
        
        sc.close();
    }
}