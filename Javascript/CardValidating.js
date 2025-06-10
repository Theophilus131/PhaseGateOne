const prompt = require("prompt-sync")();

let cardNumber = Number(prompt("kindly enter card details to verify : "));

function CardNumber(cardNumber){
let cardLength = cardNumber.length;
let visaCards = {};
let masterCard = {};
let discoverCard = {};
let americaExpressCard = {};

if(cardLength == 13 || cardLength == 16 && cardNumber[0] == 4){

return VisaCards; 
}

if(cardLength == 13 || cardLength == 16 && cardNumber[0]== 5){

return MasterCard;
}

if(cardLength == 13 || cardLength == 16 && cardNumber [3][7]){

return discoverCard;
}

if(cardLength == 13 || cardLength == 16 && cardnumber [6]){

return americaExpressCard;
}

let evenSum = 0;
let oddSum = 0;
let total = 0

for(let i = 0; i < cardNumber.length; i-- )

	evenSum += cardNumber,length[i];
	
	oddSum += cardNumber.length[i];
{

 	total = evenSum + oddSum;

if(total % 10 == 0){
console.log("valid card: ");

else{console.log("invalid card : ")

}

	





