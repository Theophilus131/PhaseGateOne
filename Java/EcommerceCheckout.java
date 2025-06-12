import java.util.Scanner;
import java.util.ArrayList;

public class EcommerceCheckout {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Double> quantities = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        System.out.print("What is customer's name: ");
        String customerName = input.nextLine();
		
		System.out.println(" Cahiers name :");
		String cashierName = input.nextLine();

        while (true) {
            System.out.print("Enter product name: ");
            String productName = input.nextLine();

            System.out.print("How many quantities of the product did customer buy: ");
            double quantity = input.nextDouble();

            System.out.print("Price per unit: ");
            double price = input.nextDouble();
			
            input.nextLine();

            productNames.add(productName);
            quantities.add(quantity);
            prices.add(price);

            System.out.print("Add another item? (yes/no): ");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }

        
        System.out.println("\n===============================");
        System.out.println("SEMICOLON STORES: ");
        System.out.println("MAIN BRANCH:");
        System.out.println("LOCATION: 312, HEBERT MACAULY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date: 09 - 06 - 2025");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("===============================\n");

        System.out.printf("%-20s%-10s%-10s%-10s%n", "Product", "Qty", "Price", "Total");
        System.out.println("----------------------------------------------");

        double grandTotal = 0;
        for (int i = 0; i < productNames.size(); i++) {
            String name = productNames.get(i);
            double qty = quantities.get(i);
            double price = prices.get(i);
            double total = qty * price;
            grandTotal += total;

            System.out.printf("%-20s%-10.2f%-10.2f%-10.2f%n", name, qty, price, total);
        }

        System.out.println("----------------------------------------------");
        System.out.printf("Grand Total: %.2f%n", grandTotal);
        System.out.println("Thank you for your patronage ");

        input.close();
    }
}
