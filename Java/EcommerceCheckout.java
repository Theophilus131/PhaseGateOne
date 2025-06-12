
import java.util.Scanner;
import java.util.ArrayList;

public class EcommerceCheckout {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

   
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Double> quantities = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

       
        System.out.print("Enter customer's name: ");
        String customerName = input.nextLine();
		
		System.out.print(" Cahiers name :");
		String cashierName = input.nextLine();

        
        while (true) {
            System.out.print("Enter product name: ");
            String productName = input.nextLine();

            System.out.print("Enter quantity: ");
            double quantity = input.nextDouble();

            System.out.print("Enter price per unit: ");
            double price = input.nextDouble();

            input.nextLine(); 

           
            productNames.add(productName);
            quantities.add(quantity);
            prices.add(price);

           
            System.out.print("do you wish to add another product? (yes/no): ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }

        
        System.out.println("\n========================================================");
        System.out.println("SEMICOLON STORES ");
		System.out.println("MAIN BRANCH		");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
        System.out.println("TEL: 03293828343");
        System.out.println("DATE: 09-06-2025");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer: " + customerName);
        System.out.println("========================================================\n");

       
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Product", "Qty", "Price", "Total");
        System.out.println("--------------------------------------------------");

        double subTotal = 0;

       
        for (int i = 0; i < productNames.size(); i++) {
            String name = productNames.get(i);
            double qty = quantities.get(i);
            double price = prices.get(i);
            double total = qty * price;

          
            System.out.printf("%-20s %-10.2f %-10.2f %-10.2f%n", name, qty, price, total);

            subTotal += total;
        }

      
	  
        double discount = 8 / 100;      
        double totalDiscount = subTotal - discount;
		
        double vat = totalDiscount * 0.075;

        double grandTotal = totalDiscount + vat;

       
        System.out.println("--------------------------------------------------");
        System.out.printf("Subtotal: %.2f%n", subTotal);
        System.out.printf("Discount: %.2f%n", totalDiscount);
        System.out.printf("VAT (7.5%%): %.2f%n", vat);
		
		System.out.println("============================================");
        System.out.printf("Grand Total: %.2f%n", grandTotal);
		System.out.println("============================================");
        System.out.println("Thank you for you patronage");
		System.out.println("============================================");
       
	   input.close();
    }
}
