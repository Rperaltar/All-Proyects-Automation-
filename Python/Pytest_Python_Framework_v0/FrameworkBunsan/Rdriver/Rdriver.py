
class rdriver:

    def __init__(self, driver):
        self.driver = driver

    driver = None

    def get_driver(self):

        default_driver = None

        if (default_driver == "Chrome"):
            self.driver = webdriver.chrome("")

        elif (default_driver == "Firefox"):
            self.driver = webdriver.Firefox("")

        elif (default_driver == "iOS"):
            self.driver = iOS.get()

        elif (default_driver == "Android"):
            self.driver = Android.get()

        return self.driver

    def DriverFirefox(self):
        self.driver = webdriver.Firefox \
            (executable_path=r'/Users/roberto/Documents/Tools_Automation/Python/PycharProyect/Drivers/geckodriver')
        self.baseUrl = Const.Baseurl

    def DriverChorme(self,path):
        self.driver = webdriver.chrome(path)


