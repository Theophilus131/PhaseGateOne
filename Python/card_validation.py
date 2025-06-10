
card_number =  input("kindly enter your card details for verification :")


def validating_card_detail(card_number):
    
    card_length = len(card_number)
    #sum_even = 0
    #sum_odd = 0
    
    #for count in card_number:
        #if card_number[count]
	
    if card_length == 16 and card_number.startswith("4"):
        return "Visa"
    elif card_length == 16 and card_number("5"):
        return "master_card"
    elif card_length == 16 and card_number(6):
        return "Discover"
    elif card_length == 15 and card_number(3):
        return "America Express"
    else:
        return "invalid card type"
            
        
print(validating_card_detail(card_number))