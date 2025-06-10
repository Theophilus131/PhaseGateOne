
from datetime import datetime, timedelta


def get_valid_date(year, month, day):
    try:
        date(year, month, day)
        return True
    except ValueError:
        return False
   
            
def cycle_start(year, month, day):
    return f" Your cycle starts on {date(year, month,day)}"
 
def flow_date(year, month, day):
    start_date = date(year, month, day)
    stop_date = start_date + timedelta(days = 5)
    
    return f" your flow starts on {start_date} and ends on {stop_date}"
    
def cycle_Stops(year, month, day, cycle):
    end_date = date(year, month, day) + timedelta(days = cycle_length)
    return f" your cycle ends on {end_date}"
    

def calculate_ovulation(year, month, day, cycle_length):
    start = date(year, month, end)
    end = start + timedelta(days = cycle)
    ovulation_date = start - timedelta(days = 14)
    
    return f" your ovulation date is {ovulation_date}"
    
def calculate_fertile_window(year,month, day, cycle_length):
    start = date(year, month, day)
    end = start + timedelta(days = cycle_length)
    fertile_window_start = end - timedelta(days = 21)
    fertile_windown_end = end - timedelta(days = 12)
    
    return f" ypur fertile window is from {fertile_window_start} to {fertile_windown_end}"
    
def calculate_safe_period(year, month, day, cycle):
    period_start = date(year, month, day)
    period_end = period_start + timedelta(days = 21)
    fertile_window_start = end - timedelta(days = 21)
    fertile_windown_end = end - timedelta(days = 12)
    
    return f" safe period is all days except { fertile_window_start} and {fertile_windown_end}
    
    
       
if __name__ == "__main__":
    
   while True:
       try:
           year = int(input("Enter the year (2025): "))
           month = int(input("Enter the month (1 - 12)"))
           day = int (input ("Enter day (1 - 31): "))
           cycle_length = int(input("Enter your cycle length ( 28 )"))