from selenium import webdriver

class frame(object):
    def __init__(self, driver):
        self.driver = driver

    def switch_to_frame_ID(self,element):
        # switchong to a rame which has id as 'ifr'
        driver.switch_to_frame(element)

    def switch_to_frame_NAME(self, element):
        # switchong to a rame which has id as 'ifr'
        driver.switch_to_frame(element)

    def switch_to_frame_Index(self,index):
        # switchong to a rame which has id as 'ifr'
        driver.switch_to_frame(index)

