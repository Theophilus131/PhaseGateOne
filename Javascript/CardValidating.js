const prompt = require("prompt-sync")();

let cardNumber = prompt("kindly enter card details to verify : ");

function validateCard(cardNumber){
	
	let cardLength = cardNumber.length;
	
	let cardType = "" ;
	
	if(cardLength === 16 && cardNumber.charAt(0) === '4'){
		cardType = "Visa";
	}
	
	if(cardLength === 16 && cardNumber.charAt(0) === '5'){
		cardType = "MasterCard";
	}
	if(cardLength === 16 && cardNumber.charAt(0) === '6'){
		cardType = "Discover";
	}
	if(cardLength === 15 && cardNumber.substring(0, 2) === ("37")){
		cardType = "American Express";
	} else {
	
		return "invalid card type";
	}
	
	let total = 0;
	let doubleDigit = false;
	
	for(let count = cardLength - 1; count >= 0; count--){
	let digit = parseInt(cardNumber(count));
	
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
console.log(validateCard(cardNumber));
	
		
	
	


