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


function lengthOfCard(cardNumber){

 let length = cardNumber.length;

	return length;
	}

function validateCard(cardNumber){
	
	let cardLength = cardNumber.length;
	let validCard = "";
	let total = 0;
	let doubleDigit = false;
	
	for(let count = cardLength - 1; count >= 0; count--){
	let digit = Number(cardNumber.charAt(count));
	
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
	validCard = "valid ";
		}

	else if(total % 10 != 0){
	validCard = "invalid ";
	}
	
	return validCard;

}

let cardNumbers = prompt("kindly enter card details to verify : ");

const userCard = cardType(cardNumbers);

console.log("=====================================");
console.log("====credit card Type: " +userCard  );
console.log("====credit card Number: "+ cardNumbers);

let cardLengths = lengthOfCard(cardNumbers);
console.log("=== length of card: " +cardLengths);

let cardStatus =  validateCard(cardNumbers);
console.log("credit card validity status: " +cardStatus);

console.log("=====================================");








