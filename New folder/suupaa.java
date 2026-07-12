import java.util.Scanner;

public class suupaa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Customer Details
        System.out.print("Enter the Customer Name: ");
        String cusname = sc.nextLine();

        System.out.print("Enter the Customer's Mobile Number: ");
        String cusmobileno = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        int cusid = sc.nextInt();

        // Number of Products
        System.out.print("Enter Number of Products: ");
        int n = sc.nextInt();

        // Grand Total
        int grandTotal = 0;

        System.out.println("\n-----PRODUCT DETAILS-----");

        // Loop for Products
        for (int i = 1; i <= n; i++) {

            System.out.println("\nProduct " + i);

            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String productName = sc.nextLine();

            System.out.print("Enter Product Price: ");
            int productPrice = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            // Item Total
            int itemTotal = productPrice * quantity;

            // Add to Grand Total
            grandTotal = grandTotal + itemTotal;

            // Product Output
            System.out.println("Product Name : " + productName);
            System.out.println("Product Price: " + productPrice);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Item Total   : " + itemTotal);
        }

        // Discount
        double discount;

        if (grandTotal > 5000) {

            discount = grandTotal * 0.20;
        }

        else if (grandTotal > 3000) {

            discount = grandTotal * 0.10;
        }

        else {

            discount = 0;
        }

        // Final Amount
        double finalAmount = grandTotal - discount;

        // Final Bill
        System.out.println("\n\n-----SUPERMARKET BILL-----");

        System.out.println("Customer Name      : " + cusname);
        System.out.println("Customer Mobile No : " + cusmobileno);
        System.out.println("Customer ID        : " + cusid);

        System.out.println("\nGrand Total : " + grandTotal);

        System.out.printf("Discount    : %.2f\n", discount);

        System.out.printf("Final Amount: %.2f\n", finalAmount);

        System.out.println("\n-----THANK YOU-----");
        System.out.println("-----VISIT AGAIN-----");

        sc.close();
    }
}