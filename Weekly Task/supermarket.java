import java.util.*;

public class supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user details
        System.out.print("Enter the Customer Name: ");
        String cusname = sc.nextLine();

        System.out.print("Enter the Customer's Mobile Number: ");
        String cusmobileno = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        int cusid = sc.nextInt();
        sc.nextLine();
        
        //product details 
        System.out.print("Enter the Name of the product: ");
        String cusproduct = sc.nextLine();

        System.out.print("Enter the Price of Product: ");
        int productprice = sc.nextInt();

        System.out.print("Enter the Quantity of Product: ");
        int quantity = sc.nextInt();
        


        // total amount
        int totalamount = productprice * quantity;

        // discount
        double discount ;
        if(totalamount > 5000){
            discount = totalamount * 0.20;
        }
        else if(totalamount > 3000){
            discount = totalamount * 0.10;
        }
        else{
            discount = 0;
        }
        
        // final bill
        double finalamount = totalamount - discount;

        // output screen

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("-----SUPERMARKET BILL-----");
        System.out.println("Customer Name: " + cusname);
        System.out.println("Customer ID: " + cusid);
        System.err.println("Customer Mobile No: " + cusmobileno);
        System.out.println(" ");

        System.out.println("Product Name: " + cusproduct);
        System.out.println("Product Price: " + productprice );
        System.out.println("Quantity: " + quantity);
        System.out.println(" ");

        System.out.println("Total Amount: " + totalamount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalamount);
        System.out.println("-----Thank you-----");
        System.out.println("-----Visit Again-----");


        
        sc.close();

    }
}
