	import java.util.Scanner;
	import java.util.ArrayList;
	public class EcommerceCheckout{

	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);	

	ArrayList <String> productNames  = new ArrayList <>();
	ArrayList<Double> quantities = new ArrayList<>();
	ArrayList<Double> prices = new ArrayList<>();

	System.out.println("What is customer's name : ");
	String customerName = input.nextLine();

	
	
	while(true){
	System.out.println("What did customer buy: (to continue type 'yes') ");
	String productName = input.nextLine();	
	if(productName.equalsIgnoreCase("yes")){
		break;
	}
		
	
	System.out.println("How many Quantity of the product did customer buy: ");
	double quantity = input.nextDouble();

	System.out.println("price par unit: ");
	double price = input.nextDouble();
	
	productNames.add(productName);
	quantities.add(quantity);
	prices.add(price);
	
	
	}
	
//public static void header(){
System.out.print("SEMICOLON STORES");
System.out.print("MAIN BRANCH");
System.out.print("LOCATION: 312, HEBERT MACAULY WAY, SABO YABA, LAGOS.");
System.out.print("TEL: 03293828343");
System.out.print("Date: 09 - ");
System.out.print("Cashier: Cashier's Name ");
System.out.print("Customer Name: ");

	


//header();





	}

}