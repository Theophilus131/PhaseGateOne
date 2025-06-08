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

	System.out.println("How many Quality of product: ");
	double quality = input.nextDouble();

	System.out.println("price par unit: ");
	double price = input.nextDouble();
	
	double VAT = 7.5 / 100;

	double totalPrice = (quality * price) + VAT;

	System.out.println("Amount to be paid :" + totalPrice );
	


	








	}

}