

class asserts(object):
    def __init__(self, driver):
        self.driver = driver

    def assertEqual(self, actual, expected, errorMessage):
            self.assertEqual(actual,expected,errorMessage)

    def asserNotEqual(self, actual, expected, errorMessage):
            self.asserNotEqual(actual,expected,errorMessage)

    def assertTrue(self, actual, expected, errorMessage):
            self.assertTrue(actual,expected,errorMessage)

    def assertIsNone(self, actual):
            self.assertIsNone(driver, actual)

    def assertIn(self, actual, expected, errorMessage):
        self.assertIn(actual,expected,errorMessage)

    def assertNotIn(self, actual, expected, errorMessage):
        self.assertNotIn(actual,expected,errorMessage)

