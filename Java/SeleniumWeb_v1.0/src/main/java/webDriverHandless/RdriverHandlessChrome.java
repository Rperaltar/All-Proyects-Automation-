package webDriverHandless;

import Base.Constantes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;


public class RdriverHandlessChrome extends Constantes {

    /*
    ##########################################
    #                                        #
    #  Clase - Rdriver                       #
    #  Se crean 4 Objetos de tipo WebDriver  #
    #   1.- CreateChromeDriver               #
    #   2.- CreateFireFox                    #
    #   3.- CreateInternetExplorerDriver     #
    #   4.- CreateOperaDriver                #
    #  para levantar la sesión deseada       #
    #  a nivel navegador.                     #
    #                                        #
    ##########################################
    */

    // Constructor de la clase - Rdriver
    public RdriverHandlessChrome(){
    }

    // Objeto - que crea las propiedades de tipo de sistema operativo y levanta la sessión con el driver - "GECKO_DRIVER"
    private static String modifyIfWindows(String driverPath) {
        if (System.getProperty("os.name").toLowerCase().contains("windows")){
            return driverPath + ".exe";
        } else {
            return driverPath;
        }
    }

    //Metodo - que crea los Objetos de tipo "WebDriver" para cada navegador agregando algunas Opciones
    private static WebDriver getDriver() {
            //Incognito Options for Chrome
            ChromeOptions chromeOptions = new ChromeOptions();

        return new ChromeDriver(chromeOptions);
    }
    
    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Chrome
    public static WebDriver CreateChromeDriver(String driverPath) {
            System.setProperty("webdriver.chrome.driver", modifyIfWindows(driverPath + CHROME_DRIVER));
        return getDriver();
    }
}
