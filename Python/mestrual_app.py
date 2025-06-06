from datetime import datetime, timedelta

print("===\n Menstrual App ===\n")

def calculate_next_period(last_period_str, cycle_length):
    
    last_period_date = datetime.strptime(last_period_str, "%Y-%m-%d")
    
    next_period_date = last_period_date + timedelta(days=cycle_length)
    
    return next_period_date.strftime("%Y-%m-%d")
    
    

if __name__ == "__main__":
   

    last_period = input("Enter your last period start date (YYYY-MM-DD): ")
    cycle_len = int(input("Enter your cycle length (e.g., 28): "))

    next_period = calculate_next_period(last_period, cycle_len)
    print("Your next period is expected on:", next_period)