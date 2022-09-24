import logging

class log4j:

        # Construtor elements WebDriver
        def __init__(self, driver):
                self.driver = driver

        def log(self):

                #Create and configure logger
                logging.basicConfig(filename="/Logs/",
                        format='%(asctime)s: %(levelname)s: %(message)s',
                        dateformat='%m/%d/%Y/ %I:%M:%S %p')

                # Creating an object
                logger = logging.getLogger()
                # Setting the threshold of logger to DEBUG
                logger.setLevel(logging.DEBUG)

                logger.debug('This is a debug message')
                logger.info('This is an info message')
                logger.warning('This is a warning message')
                logger.error('This is an error message')
                logger.critical('This is a critical message')
