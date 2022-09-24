from selenium import webdriver

class select(object):
        def __init__(self, driver):
            self.driver = driver

        def select_by_index(self,element,value):
            dropdown = Select(driver.find_element_by_id(element))
            dropdown.select_by_index(value)

        def select_by_value(self, element, value):
            dropdown = Select(driver.find_element_by_id(element))
            dropdown.select_by_value(value)

        def select_by_visible_text(self, element, value):
            dropdown = Select(driver.find_element_by_id(element))
            dropdown.select_by_visible_text(value)

        def options(self, element, value):
            dropdown = Select(driver.find_element_by_id(element))
            dropdown.options()

        def first_selected_option(self, element, value):
            dropdown = Select(driver.find_element_by_id(element))
            dropdown.first_selected_option()

        def all_selected_options(self, element):
            dropdown = Select(driver.find_element_by_id(element))
            dropdown.all_selected_options()

        def deselect_by_index(self, element, value):
            dropdown = Select(driver.find_element_by_id(element))
            dropdown.deselect_by_index(value)

        def deselect_by_value(self, element, value):
            dropdown = Select(driver.find_element_by_id(element))
            dropdown.deselect_by_value(value)

        def deselect_by_visible_text(self, element, value):
            dropdown = Select(driver.find_element_by_id(element))
            dropdown.deselect_by_visible_text(value)
