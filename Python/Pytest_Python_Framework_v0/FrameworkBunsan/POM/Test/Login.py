
from selenium import webdriver
from Examples_POM.Actions import Actions
from Examples_POM.POM import locators
from Examples_POM.contantes import Constantes
from selenium.webdriver.common.keys import Keys

class login():

    def setUp(self):
        self.driver = webdriver.Firefox\
            (executable_path=Constantes.PATH)

    def test(self, getData):
        self.driver = webdriver.Firefox()
        self.driver.get(Constantes.Baseurl)

        actions = Actions(self.driver)
        pagelogin = locators(self.driver)

        actions.click(pagelogin.getMenuBtn())
        actions.sendKeys(LoginPage.getUsername(),getData["test"])
        actions.sendKeys(LoginPage.getPassword(),getData["1234"])
        actions.click(LoginPage.loginBtn)

        assert ("","")

    def tearDown(self):
        self.driver.close()
if __name__ == "__main__":
    unittest.main()