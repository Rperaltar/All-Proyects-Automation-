from selenium import webdriver

class handler(object):
        def __init__(self, driver):
            self.driver = driver

        def current_window_handle(self):
            driver.current_window_handle;

        def window_handles(self):
            driver.window_handles;

        def switch_to_window(self,uuid):
            driver.switch_to_window(uuid);
