from selenium.webdriver.support.wait import WebDriverWait
from selenium import webdriver

class exWait(object):


    def __init__(self, driver):
        self.driver = driver

    def presence_of_element_located(self,element):
        wait = WebDriverWait(driver, 30)
        wait.until(expected_conditions.presence_of_all_elements_located
                   ((By.ID,element)))

    def visibility_of_element_located(self, element):
        wait = WebDriverWait(driver, 30)
        wait.until(expected_conditions.visibility_of_all_elements_located
                   ((By.ID, element)))

    def text_to_be_present_in_element(self, element):
        wait = WebDriverWait(driver, 30)
        wait.until(expected_conditions.text_to_be_present_in_element
                   ((By.ID, element)))

    def frame_to_be_available_and_switch_to_it(self, element):
        wait = WebDriverWait(driver, 30)
        wait.until(expected_conditions.visibility_of_all_elements_located
                   ((By.ID, element)))

    def element_to_be_clickable(self, element):
        wait = WebDriverWait(driver, 30)
        wait.until(expected_conditions.element_to_be_clickable
                   ((By.ID, element)))

    def element_located_to_be_selected(self, element):
        wait = WebDriverWait(driver, 30)
        wait.until(expected_conditions.element_located_to_be_selected
                   ((By.ID, element)))




