import unittest

import to_do_list

class Test_to_do_list(unittest.TestCase):
	def test_add_number(self):
		self.assertEqual(to_do_list.add_number(1, 14), 15)