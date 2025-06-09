
from datetime import datetime

import mestrual_app

from unittest import TestCase

class TestMestrual(TestCase):
    

    def test_check_that_function_exist(self):
        mestrual_app.calculate_next_period( "2025-05-09", 25)
           
        
    def test_calculate_next_period(self):
        last_period = "2025-06-01"
        cycle_length = 28
        expected = datetime(2025, 6, 29)
        actual =  mestrual_app.calculate_next_period(last_period, cycle_length)
        self.assertEqual(actual, expected)
        
        
        
    def test_calculate_ovulation_and_fertile_window(self):
        next_period_date = datetime(2025, 6, 29)

        ovulation, fertile_start, fertile_end =  mestrual_app.calculate_ovulation_and_fertile_window(next_period_date)

        self.assertEqual(ovulation, datetime(2025, 6, 15))
        self.assertEqual(fertile_start, datetime(2025, 6, 10))
        self.assertEqual(fertile_end, datetime(2025, 6, 16))

    
       
        
       