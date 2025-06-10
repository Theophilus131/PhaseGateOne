from datetime import date, timedelta

def get_valid_date(year, month, day):
    try:
        date(year, month, day)
        return True
    except ValueError:
        return False

def cycle_start(year, month, day):
    return f"Your cycle starts on {date(year, month, day)}"

def flow_date(year, month, day):
    start_date = date(year, month, day)
    stop_date = start_date + timedelta(days=5)
    return f"Your flow starts on {start_date} and ends on {stop_date}"

def cycle_stops(year, month, day, cycle_length):
    end_date = date(year, month, day) + timedelta(days=cycle_length)
    return f"Your cycle ends on {end_date}"

def calculate_ovulation(year, month, day, cycle_length):
    start = date(year, month, day)
    ovulation_date = start + timedelta(days=(cycle_length - 14))
    return f"Your ovulation date is {ovulation_date}"

def calculate_fertile_window(year, month, day, cycle_length):
    start = date(year, month, day)
    fertile_window_start = start + timedelta(days=(cycle_length - 21))
    fertile_window_end = start + timedelta(days=(cycle_length - 12))
    return f"Your fertile window is from {fertile_window_start} to {fertile_window_end}"

def calculate_safe_period(year, month, day, cycle_length):
    fertile_window_start = date(year, month, day) + timedelta(days=(cycle_length - 21))
    fertile_window_end = date(year, month, day) + timedelta(days=(cycle_length - 12))
    return f"Safe period is all days except {fertile_window_start} to {fertile_window_end}"

if __name__ == "__main__":
    while True:
        try:
            year = int(input("Enter the year (e.g. 2025): "))
            month = int(input("Enter the month (1 - 12): "))
            day = int(input("Enter the day (1 - 31): "))
            cycle_length = int(input("Enter your cycle length (e.g. 28): "))

            if not get_valid_date(year, month, day):
                print("Invalid date. Please try again.\n")
                continue

            print("\nResult:")
            print(cycle_start(year, month, day))
            print(flow_date(year, month, day))
            print(cycle_stops(year, month, day, cycle_length))
            print(calculate_ovulation(year, month, day, cycle_length))
            print(calculate_fertile_window(year, month, day, cycle_length))
            print(calculate_safe_period(year, month, day, cycle_length))

<<<<<<< HEAD
            break
        except ValueError:
            print("Invalid input. Please enter numbers only.\n")
=======
    ovulation, fertile_start, fertile_end = calculate_ovulation_and_fertile_window(next_period_date)
    print(" Ovulation day:", ovulation.date())
    print(" Fertile window:", fertile_start.date(), "to", fertile_end.date())
    
    flow, safe_before, safe_after = calculate_flow_and_safe_days(last_period, fertile_start, fertile_end, next_period_date)

    print(" Flow days:", flow[0].strftime("%Y-%m-%d"), "to", flow[1].strftime("%Y-%m-%d"))
    print(" Safe before fertile:", safe_before[0].strftime("%Y-%m-%d"), "to", safe_before[1].strftime("%Y-%m-%d"))
    print(" Safe after fertile:", safe_after[0].strftime("%Y-%m-%d"), "to", safe_after[1].strftime("%Y-%m-%d"))


# ur code is failling if i enter the date in the wrong format
# 
>>>>>>> d06c13edf0083915ad01857240e175600f049d2a
