from Base.Constant import Const
from selenium import webdriver

class Actions(object):
    def __init__(self, driver):
        self.driver = driver

    def click(self, element):
        return element.click()

    def clear(self, element):
        return element.clear()

    def sendKeys(self, inputfield, value):
        inputfield.send_keys(value)

    def selectFromDD(self, dropdown, value):
        ddelement = Select(dropdown)
        ddelement.select_by_value(value)

    def getText(self, element):
        return element.text

    def get_title(self):
        return self.driver.title

    def get_url(self):
        return self.driver.current_url

    def getLog(self):
        self.get_Log("Browser")


    def hover(self, *locator):
        element = self.find_element(*locator)
        hover = ActionChains(self.driver).move_to_element(element)
        hover.perform()
        return

    def wait_element(self, *locator):
        try:
          WebDriverWait(self.driver, 10).until(EC.presence_of_element_located(locator))
        except TimeoutException:
            print("\n * ELEMENT NOT FOUND WITHIN GIVEN TIME! --> %s" % (locator[1]))
        self.driver.quit()
        return


    def sleep(self):
        time.sleep(2)

    def click(self, element):
        element.click()

    def click(self) -> None:
        self._element.click()

    def implicitWait(self):
        self.driver.implicitly_wait(100)

    def screenShot(self):
        self.driver.get_screenshot_as_file(Const.TimeStamp)

    # web element if it is enabled.
    def WebDriverWait(self, by_locator):
        return WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))

    # this function moves the mouse pointer over a web element whose locator has been passed to it.
    def move_to(self, *locator):
        element = self.find_element(*locator)
        hover = ActionChains(self.driver).move_to_element(element)
        hover.perform()

        # this function asserts comparison of a web element's text with passed in text.
    def assert_element_text(self, by_locator, element_text):
        assert web_element.text == element_text

    def sendKeys(self, inputfield, value):
        inputfield.send_keys(value)

    def send_keys(self, value: str) -> None:
        self._element.send_keys(value)

    def maximize_window(self):
        self.maximize_window()

    def close(self):
            self._driver.close()
            self._driver.quit()

    def navigate_to(self, url):
        print: "Navigate to '%s'" % url
        self.driver.get(url)

    def accept_alert(self):
        self.driver.switch_to.alert.accept()

    def dismiss_alert(self):
        self.driver.switch_to.alert.dismiss()

    def switch_to_frame(self, frame_reference):
        self.driver.switch_to.frame(frame_reference)

    def switch_to_window(self, window_name):
        self.driver.switch_to.window(window_name)

    def presence_of_element_located(driver, locator):
        return WebDriverWait(driver, TIMEOUT).until(EC.presence_of_element_located(locator))

    def element_to_be_clickable(driver, locator):
        return WebDriverWait(driver, TIMEOUT).until(EC.element_to_be_clickable(locator))