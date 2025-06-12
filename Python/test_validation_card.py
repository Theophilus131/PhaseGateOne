

import card_validation

from unittest import TestCase

class TestCardValidation(TestCase):

	def test_check_short_input(self):
	
		result = card_validation.validating_card_detail("123")
		expected = "invalid card type"
		self.assertEqual(result, expected)
    