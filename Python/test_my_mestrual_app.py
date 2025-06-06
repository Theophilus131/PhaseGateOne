
import mestrual_app

from unittest import TestCase

class TestMestrual(TestCase):
    
    def test_check_that_function_exist(self):
        mestrual_app.get_valid_cycle_length()

    def test_check_that_function_exist(self):
        mestrual_app.calculate_next_period( "2025-05-09", 25)
        
        
    
       
        
       