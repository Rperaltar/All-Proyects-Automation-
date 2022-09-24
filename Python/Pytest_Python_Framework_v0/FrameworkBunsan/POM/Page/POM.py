import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from Base.Constant import Const


class LoginPage(object):

    #Construtor inicia los elemmentos en el WebDriver
    def __init__(self, driver):
       self.driver = driver

    #Locators
    LOGIN_BTN = (By.CSS_SELECTOR,'#signInModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)')
    MENU_BTN = (By.ID,'signin2')

    #Ejemplo 1 de como generar la accion mas el locator
    def loginBtn(self):
        return self.driver.find_element(*LoginPage.LOGIN_BTN).click()

    def MenuBtn(self):
        self.driver.find_element(*LoginPage.MENU_BTN).click()

    #Ejemplo 2 de como generar la accion mas el locator
    def Username(self,user):
        self.driver.find_element_by_id("sign-username").send_keys(user)

    def Password(self, passwd):
        return self.driver.find_element_by_id("sign-password").send_keys(passwd)

    #Ejemplo2 metodo Login
    def LoginUser(self,user,passwd):
        self.MenuBtn()
        self.Username(user)
        self.Password(passwd)
        self.loginBtn()
        return

    #ejemplo3 metodos Login
    def Menu(self):
        self.MenuBtn()
    def Login(self):
        self.loginBtn()
    def User(self,user):
        self.Username(user)
    def Passwd(self,passwd):
        self.Password(passwd)
