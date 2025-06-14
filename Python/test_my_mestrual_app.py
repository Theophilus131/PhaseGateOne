from datetime import datetime
import mestrual_app
from unittest import TestCase

class TestMestrual(TestCase):

    def test_check_flow_date_is_correct(self):

        result = mestrual_app.flow_date(2025, 5, 9)
        expected = "Your flow starts on 2025-05-09 and ends on 2025-05-14"
        self.assertEqual(result, expected)

    def test_check_ovulation_date_is_correct(self):
        
        actual = mestrual_app.calculate_ovulation(2025, 6, 24, 28)
        expected = "Your ovulation date is 2025-07-08"
        self.assertEqual(actual, expected)
        
    def test_check_fertile_window_is_correct(self):
        
        actual = mestrual_app.calculate_fertile_window(2025, 6, 24, 28)
        expected = "Your fertile window is from 2025-07-01 to 2025-07-10"
        self.assertEqual(actual, expected)
        
    def test_check_safe_period_is_correct(self):
        
        actual = mestrual_app.calculate_safe_period(2025, 6, 24, 28)
        expected = "Safe period is all days except 2025-07-01 to 2025-07-10"
        self.assertEqual(actual, expected)