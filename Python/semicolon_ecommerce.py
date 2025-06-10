from datetime import datetime, timedelta

def main():
	print("Welcome to semicolon Stores chechout System: ")
	customer_name = input("Enter customer name: ")
	
	product_names = []
	quantities = []
	unit_prices =	[]
	
	while True:
	
		product = input("Enter want you want to buy (or 'done' to finish): ")
		
		if product.lower() == 'done':
			break
		
		price = float("Enter unit price: ")
		quantity = int("Enter quantity of product bought: ")
		
		product_names.append(product)
		price.append(price)
		quantities.append(quantity)
	
	cashier_name = input("Enter cashier name: ")
	
	discount = input("is there any discount for this customer? (yes/no): ")
	
	total = quantities * unit_prices
	
	discount_amount = total
	
	vat_charges = total * (75/100)
	
	total_amount_to_pay = total + vat_charges
	
	
	print_receipt()
	
	print("SEMICON STORES ")
	print("MAIN BRANCH ")
	print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
	print("TEL: 03293828323 ")
	print("DATE: ")
	print(f" Cashier: {cashier_name} ")
	print(f" Customer Name: {customer_name}  ")
	print("==============================================================")
	print(f"{'ITEM':<15} {'QTY':>5} {'PRICE':>10} {'TOTAL(NGN)':>12}")
	print("----------------------------------------------------------------")
	
	
	
	
	if __name__ == "__main__":
	
		main()