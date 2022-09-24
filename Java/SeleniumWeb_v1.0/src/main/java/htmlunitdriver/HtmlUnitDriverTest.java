package htmlunitdriver;


import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HtmlUnitDriverTest {

    /*
    ##########################################
    #                                        #
    #  Clase - HtmlUnitDriverTest            #
    #  Realiza La Ejecución en Segundo Plano #
    #  las pruebas se realizan sin levantar  #
    #  la Interface del Usuario              #
    #                                        #
    ##########################################
    */

    //Metodo - que crea los Objetos de tipo "WebDriver - HtmlUnitDriver" para hacer la pruebas sin navegador
    public static WebDriver getHtmlUnitDriver() {
        //Driver for HtmlUnitDriver
        HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.getDefault());
        driver.setJavascriptEnabled(true);
        // Se crean Opciones para hacer el setBrowser del objeto HtmlUnitDriver
        return new HtmlUnitDriver();
    }

}
