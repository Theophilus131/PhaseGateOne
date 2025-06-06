from datetime import datetime, timedelta

def get_valid_cycle_length():
   
    while True:
        try:
            cycle_length = int(input("Enter your average cycle length (21–35 days): "))
            if 21 <= cycle_length <= 35:
                return cycle_length
            else:
                print("Cycle length must be between 21 and 35 days. Try again.")
        except ValueError:
            print("Invalid input. Please enter a number.")
            
def calculate_next_period(last_period_str, cycle_length):
    last_period_date = datetime.strptime(last_period_str, "%Y-%m-%d")
    next_period_date = last_period_date + timedelta(days=cycle_length)
    return next_period_date


def calculate_ovulation_and_fertile_window(next_period_date):
    
    ovulation_date = next_period_date - timedelta(days=14)
    
    fertile_start = ovulation_date - timedelta(days=5)
    
    fertile_end = ovulation_date + timedelta(days=1)
    
    return ovulation_date, fertile_start, fertile_end            
            
            



if __name__ == "__main__":
    
    last_period = input("Enter the first day of your last period (YYYY-MM-DD): ")
    
    cycle_len = get_valid_cycle_length()

    next_period_date = calculate_next_period(last_period, cycle_len)
    print(" Your next period is expected on:", next_period_date)


    ovulation, fertile_start, fertile_end = calculate_ovulation_and_fertile_window(next_period_date)
    print(" Ovulation day:", ovulation.date())
    print(" Fertile window:", fertile_start.date(), "to", fertile_end.date())