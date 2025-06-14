
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
        
    def test_chect_master_card_is_valid(self):
        
        result = card_validation.validating_card_detail("5399831619690403")
        expected = "master_card"
        self.assertEqual(result, expected)
        
    def test_check_american_express_is_valid(self):
        result = card_validation.validating_card_detail("378282246310005")
        expected = "America Express"
        self.assertEqual(result, expected)
        
    def test_check_discover_card_is_valid(self):
        result = card_validation.validating_card_detail("601100000000004")
        expected = "Discover"
        self.assertEqual(result, expected)