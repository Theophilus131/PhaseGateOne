
card_number = int(input("kindly enter your card details for verification :"))


def validating_card_detail(card_number):
    card_length = len(card_number)
    sum_even = 0
    sum_odd = 0
    
    for count in card_number:
        #if card_number[count]
	
    if card_length == 16 and card_number[0] == 4:
        return {Visa}
	elif card_length == 16 and card_number[0] == 5:
        return {master_card}
    elif card_length == 16 and card_number[0] == 6:
        return {Discover}
    elif card_length == 15 and card_number[0] == 3:
        return {America Expree}
	else:
		return invalid
            
        
print(validating_card_detail(card_number))