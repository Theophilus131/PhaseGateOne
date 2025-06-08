	import java.util.Scanner;
	import java.util.ArrayList;
	public class EcommerceCheckout{

	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);	

	ArrayList <String> shoppingCart = new ArrayList <>();

	System.out.println("What is customer's name : ");
	String customerName = input.nextLine();

	System.out.println("What did customer buy: ");
	String productName = input.nextLine();

	System.out.println("How many Quantity of the product did customer buy: ");
	double quality = input.nextDouble();

	System.out.println("price par unit: ");
	double price = input.nextDouble();
	
	}
public static void header(){
System.out.print("SEMICOLON STORES");
System.out.print("MAIN BRANCH");
System.out.print("LOCATION: 312, HEBERT MACAULY WAY, SABO YABA, LAGOS.");
System.out.print("TEL: 03293828343");
System.out.print("Date: 09 - ");
System.out.print("Cashier: Cashier's Name ");
System.out.print("Customer Name: ");

	


header();





	}

}