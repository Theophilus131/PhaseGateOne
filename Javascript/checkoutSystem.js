const prompt = require("prompt-sync")();

   
        let productNames = [];
        let quantities = [];
        let prices = [];

		let customerName = prompt("Enter customer's name: ");
		let cashierName = prompt("Cashier's name: ");


        while (true) {
            let productName = prompt("Enter product name: ");

           let quantity = parseFloat(prompt("Enter quantity: "));

           let price = parseFloat(prompt("Enter price per unit: "));

    
            productNames.push(productName);
            quantities.push(quantity);
            prices.push(price);

           
            let answer = prompt("do you wish to add another product? (yes/no): ");
      
            if (answer.toLowerCase() === "no") {
                break;
            }
        }

        
       console.log("\n========================================================");
       console.log("SEMICOLON STORES ");
		console.log("MAIN BRANCH		");
        console.log("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
        console.log("TEL: 03293828343");
        console.log("DATE: 09-06-2025");
        console.log("Customer Name: " + customerName);
        console.log("Customer: " + customerName);
        console.log("========================================================\n");

       console.log("Product\t\tQty\tPrice\tTotal");
        console.log("--------------------------------------------------");

       let subTotal = 0;

       
        for (let i = 0; i < productNames.length; i++) {
            let name = productNames[i];
            let qty = quantities[i];
            let price = prices[i];
            let total = qty * price;
			

          console.log(` ${name}\t\t ${qty} \t ${price} \t ${total}`);

            subTotal += total;
        }

      
	  
        let discount = 8 / 100;      
        let totalDiscount = subTotal - discount;
		
        let vat = totalDiscount * 0.075;

        let grandTotal = totalDiscount + vat;

       
        console.log("--------------------------------------------------");
        console.log(`Subtotal: ${subTotal.toFixed(2)}`);
		console.log(`Discount: ${discount.toFixed(2)}`);
		console.log(`VAT (7.5%): ${vat.toFixed(2)}`);
		
		console.log("============================================");
        console.log(`Grand Total: ${grandTotal.toFixed(2)}`);
		console.log("============================================");
        console.log("Thank you for you patronage");
		console.log("============================================");
       

