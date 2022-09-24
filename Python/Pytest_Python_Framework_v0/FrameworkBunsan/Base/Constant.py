from selenium.webdriver.common.by import By
import datetime

class Const:

    # Construtor elements WebDriver
    def __init__(self, driver):
       self.driver = driver

    #Variables Url`` Login
    Baseurl = ("https://www.demoblaze.com/")
    User = "TestQA_testing"
    Password = "123456"

    #Variables formato para crear objeto con un TimeStamp-screenshot
    PathAshot = "/Users/roberto/Documents/Tools_Automation/Python/FrameworkBunsan/ScreenShot/"
    File = "Image_"
    Ext = ".png"
    Date_time = datetime.datetime.now().strftime('%Y-%m-%d_%H:%M:%S')
    TimeStamp =  PathAshot + File + Date_time + Ext

    #Variables time`s
    Time_Implicit = 4000







