package lskitImpl.browserLog;

import Base.Constantes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.PageFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class BrowserLog extends Constantes {

    /*
    ###########################
    #  Clase - BrowserLog     #
    #  el metodo              #
    #  Crea un "File.log"     #
    #  del navegador cuando   #
    #  ejecutas los test      #
    ###########################
     */


    static WebDriver driver;

    //Constructor - de la clase BrowserLog
    public BrowserLog(WebDriver driver) {
        BrowserLog.driver = driver;
        PageFactory.initElements(driver, this);

    }
   //Metodo - crea un File.log es un resultado de las pruebas ejecutadas mediante los Verbos - HTTP's en el navegador
    public LogEntries getAnalyzeLogBrowser() throws IOException {

        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());

            FileOutputStream out = new FileOutputStream(PATH_BROWSER_LOG + NAME_BROWSER_LOG + TIME_STAMP + EXT_BROWSER_LOG);
            out.write(entry.toString().getBytes());
        }
        return logEntries;
    }
}
