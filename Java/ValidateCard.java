
	import java.util.Scanner;
	
	public class ValidateCard{
	
	public static String validatingCardDetail(String cardNumber){
	
	int cardLength = cardNumber.length();
	
	String cardType;
	
	if(cardLength == 16 && cardNumber.charAt(0) == '4'){
		cardType = "Visa";
	}
	
	if(cardLength == 16 && cardNumber.charAt(0) == '5'){
		cardType = "MasterCard";
	}
	if(cardLength == 16 && cardNumber.charAt(0) == '6'){
		cardType = "Discover";
	}
	if(cardLength == 15 && cardNumber.substring(0, 2).equals("37")){
		cardType = "American Express";
	} else {
	
		return "invalid card type";
	}
	
	int total = 0;
	boolean doubleDigit = false;
	
	for(int count = cardLength - 1; count >= 0; count--){
	int digit = Character.getNumericValue(cardNumber.charAt(count));
	
	if(doubleDigit){
	digit *= 2;
	
	if(digit > 9){
	digit -= 9;
	}
		}
	total += digit;
	doubleDigit = !doubleDigit;
	
	}
	
	if(total % 10 == 0){
	return "valid " +cardType+ " card";
	}else {
	
	return "invalid " +cardType+ " card";
	}
	
	
	}
	
	
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("kindly enter you card details to verify: ");
	String cardNumber = input.nextLine();

	
	 System.out.println(validatingCardDetail(cardNumber));
	
		}
	
	
	
	}