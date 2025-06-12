
import card_validation

from unittest import TestCase

class TestCardValidation(TestCase):

    def test_check_short_input(self):
        result = card_validation.validating_card_detail("123")
        expected = "invalid card type"
        self.assertEqual(result, expected)
        
    def test_check_visa_card_is_valid(self):
        result = card_validation.validating_card_detail("4111111111111111")
        expected = "Visa"
        self.assertEqual(result, expected)
        
    