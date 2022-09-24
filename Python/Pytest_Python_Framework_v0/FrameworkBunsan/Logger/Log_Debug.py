


class Logger(object):
     def __init__(self, logger):
         """
         Specify the file path to save the log.py, log.py level, and call file
                        Save the log.py to the specified file
           :param logger:
           """
           #  Create a logger
         self.logger = logging.getLogger(logger)
         self.logger.setLevel(logging.DEBUG)

         #  Create a handler to write to the log.py file
         rq = time.strftime('%Y%m%d%H%M', time.localtime(time.time()))
         log_path = os.path.dirname(os.getcwd()) + '/Logs/'
         log_name = log_path + rq + '.log.py'
         fh = logging.FileHandler(log_name)
         fh.setLevel(logging.INFO)

         #  Create another handler for output to the console
         ch = logging.StreamHandler()
         ch.setLevel(logging.INFO)

         #  Define the output format of the handler
         formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
         fh.setFormatter(formatter)
         ch.setFormatter(formatter)

         #  Add handler to logger
         self.logger.addHandler(fh)
         self.logger.addHandler(ch)

     def getlog(self):
         return self.logger
