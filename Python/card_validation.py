
card_number =  input("kindly enter your card details for verification :")


def validating_card_detail(card_number):
    
    card_length = len(card_number)
   
	
    if card_length == 16 and card_number[0] == "4":
        return "Visa"
    elif card_length == 16 and card_number[0]== "5":
        return "master_card"
    elif card_length == 16 and card_number[0] == "6":
        return "Discover"
    elif card_length == 15 and card_number[:2]== "37":
        return "America Express"
    else:
        return "invalid card type"
        
    total = 0
    double = False
    
    for count in range(card_length -1, -1, -1):
        digit = int(card_number(count))
        
    if double:
        digit *= 2
    if digit > 9:
        digit -= 9
        
    total += digit
    double = not double
    
    if total % 10 == 0:
        return f" Valid {card_type} card"
    else:
        
        return f" Invalid {card_type} card "    
        
print(validating_card_detail(card_number))