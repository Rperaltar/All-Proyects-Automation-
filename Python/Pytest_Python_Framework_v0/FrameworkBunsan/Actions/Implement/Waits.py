from selenium.webdriver.support.wait import WebDriverWait


class wait(object):

    def __init__(self, driver):
        self.driver = driver

    def Implicit_Wait_Title_is(self,element):
        wait = WebDriverWait(driver,30)
        wait.until(expected_conditions.title_contains(element))

    def Implicit_Wait_Title_Contains(self, element):
        wait = WebDriverWait(driver, 30)
        wait.until(expected_conditions.title_contains(element))