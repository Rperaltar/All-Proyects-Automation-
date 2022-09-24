import unittest
from selenium import webdriver
from POM.Page.POM import LoginPage
from Base.Constant import Const
from ScreenShot.Ashot import Ashot
from Actions.Implement import Actions
from Logger.log import log4j
import logging


class Script(unittest.TestCase):

    #Levanta el WebDriver
       def setUp(self):
           self.driver = driver = webdriver.chrome(r'C:\Users\Robert\Documents\Automation_Py\Automation_Py\Python\Pytest_Python_Framework\FrameworkBunsan\Drivers\chromedriver.exe')
           self.baseUrl = Const.Baseurl

        #Ejemplo1 test
       def test(self):
           self.driver = self.driver;
           self.driver.get(self.baseUrl)
           self.driver.maximize_window()

           # //test ejemplo 1
           login = LoginPage(driver)
           login.LoginUser(Const.User,Const.Password)
           driver.get_screenshot_as_file(Const.TimeStamp)
           logger.info('test')

        #Ejemplo2 test
       def test2(self):
           driver = self.driver;
           self.driver.get(self.baseUrl)
           self.driver.maximize_window()
           logger.info("url open")

           login = LoginPage(driver)
           BTN_MENU   = login.MenuBtn()
           WAIT       = self.driver.implicitly_wait(4000)
           USER_LOGIN = login.Username(Const.User)
           PASS_LOGIN = login.Password(Const.Password)
           SING_IN    = login.loginBtn()
           LOG        = logger.info('test2 -login')
           SCREENSHOT = self.driver.get_screenshot_as_file(Const.TimeStamp)

           ASSERT     = self.assertIn("STORE", self.driver.title)
           ASSERTT    = self.assertEqual(self.driver.title.__contains__("STORE"),True)
           logger.info("test passed")
           PRINT      = print(self.driver.title)

        #Ejemplo3 test
       def test3(self):
           driver = self.driver;
           driver.get(self.baseUrl)

           # //test ejemplo 2
           login = LoginPage(driver)
           login.Menu()
           driver.implicitly_wait(Const.Time_Implicit)
           login.User(Const.User)
           login.Passwd(Const.Password)
           login.Login()
           driver.get_screenshot_as_file(Const.TimeStamp)

        #test failded ejmeplo sirve en -java
       def test4(self):
           driver = self.driver;
           driver.get(self.baseUrl)

           # //test ejemplo 2
           login = LoginPage(driver)
           actions = Actions(driver)
           login.MenuBtn()
           actions.implicitWait()
           login.Username(Const.User)
           login.Password(Const.Password)
           login.loginBtn()
           actions.screenShot()

       def closeTest(self):
           self.driver.quit()

if __name__ == "__main__":
    unittest.main()
