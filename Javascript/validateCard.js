const prompt = require("prompt-sync")();

function cardType(cardNumber){

	let cardType = "";
	
	let indexZero = Number(cardNumber.charAt(0));
	
	let IndexOne = Number(cardNumber.charAt(1));

		
	if(cardNumber.length === 16 && indexZero === 4){

		cardType = "Visa card";}
	
	else if(cardNumber.length === 16 && indexZero === 5){

		cardType = "MasterCard";
	}
	
	else if(cardNumber.length === 16 && indexZero === 6 ){

		cardType = "Discover Card";
		}
	
	else if(cardNumber.length === 15 && indexZero === 3 && indexOne === 7){

		cardType = "American Express Card "; 
	}
	
	else{
		cardType = "invalid card ";
		
		}

		return cardType;
}

