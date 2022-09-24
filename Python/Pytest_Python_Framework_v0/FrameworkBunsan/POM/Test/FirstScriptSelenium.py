import time
import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

class PythonOrgSearch(unittest.TestCase):

 def setUp(self):
  self.driver = webdriver.Firefox\
  (executable_path
       =r'C:\Users\maricruz vargas\Documents\Todo_Bunsan\Proyecto_PrimeTime\JAVA_AUT_PRIME\FrameFrontEndWebPrimeTime\src\main\java\drivers\geckodriver.exe')
  self.driver.implicitly_wait(10)
  self.baseUrl = "https://www.demoblaze.com/"

 def test(self):
  driver = self.driver
  driver.get(self.baseUrl)
  print(driver.title)

  time.sleep(2)
  driver.find_element_by_id("signin2").click()
  time.sleep(2)
  driver.find_element_by_id("sign-username").send_keys("Test")
  time.sleep(2)
  driver.find_element_by_id("sign-password").send_keys("12345")
  time.sleep(2)
  driver.find_element_by_css_selector("#signInModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)").click()

  assert ("https://www.demoblaze.co/", driver.title)

 def tearDown(self):
   self.driver.quit()
if __name__ == "__main__":
 unittest.main()