from selenium import webdriver

class alert(object):
        def __init__(self, driver):
            self.driver = driver

        def AlertpopUp(self):
            ale = driver.switch_to_alert()
            # clicks 'OK' button
            ale.accept();

        def AlertpopUp(self):
            ale = driver.switch_to_alert()
            # clicks 'OK' button
            ale.dismiss();

        def AlertpopUp(self):
            ale = driver.switch_to_alert()
            # clicks 'OK' button
            ale.text();


