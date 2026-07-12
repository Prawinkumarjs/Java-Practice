import java.util.Scanner;

public class empty {

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

        // Arrays
        String[] productNames = new String[n];
        int[] productPrices = new int[n];
        int[] quantities = new int[n];
        int[] totals = new int[n];

        int grandTotal = 0;

        // Product Input
        for(int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.println("\nProduct " + (i + 1));

            System.out.print("Enter Product Name: ");
            productNames[i] = sc.nextLine();

            System.out.print("Enter Product Price: ");
            productPrices[i] = sc.nextInt();

            System.out.print("Enter Quantity: ");
            quantities[i] = sc.nextInt();

            totals[i] = productPrices[i] * quantities[i];

            grandTotal = grandTotal + totals[i];
        }

        // Discount
        double discount;

        if(grandTotal > 5000) {

            discount = grandTotal * 0.20;
        }

        else if(grandTotal > 3000) {

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

        System.out.println("\n---------------------------------------------------------");

        System.out.printf("%-15s %-10s %-10s %-10s\n",
                "Product", "Price", "Quantity", "Total");

        System.out.println("---------------------------------------------------------");

        for(int i = 0; i < n; i++) {

            System.out.printf("%-15s %-10d %-10d %-10d\n",
                    productNames[i],
                    productPrices[i],
                    quantities[i],
                    totals[i]);
        }

        System.out.println("---------------------------------------------------------");

        System.out.println("Grand Total : " + grandTotal);

        System.out.printf("Discount    : %.2f\n", discount);

        System.out.printf("Final Amount: %.2f\n", finalAmount);

        System.out.println("\n-----THANK YOU-----");
        System.out.println("-----VISIT AGAIN-----");

        sc.close();
    }
}