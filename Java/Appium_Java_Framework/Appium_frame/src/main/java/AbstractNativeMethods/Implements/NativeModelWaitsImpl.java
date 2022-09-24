package AbstractNativeMethods.Implements;

import AbstractNativeMethods.Interfaces.NativeModelWaits;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class NativeModelWaitsImpl implements NativeModelWaits {


    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelActionsImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de esperas      #
    #  Implicitas / Explicitas de Selenium.  #
    #                                        #
    ##########################################
    */


    // Implicit Waits
    //Metodo generico para hacer una espera de implicitamente de 20 Milisegundos
    public void timeOutImplicitWaitMilOne(AndroidDriver driver) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        return;
    }

    //Metodo generico para hacer una espera de implicitamente de 50 Milisegundos
    public void timeOutImplicitWaitMilTwo(AndroidDriver driver) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
        return;
    }

    //Metodo generico para hacer una espera de implicitamente de 05 SECONDS
    public void timeOutImplicitWaitSegOne(AndroidDriver driver) {
        driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
        return;
    }

    //Metodo generico para hacer una espera de implicitamente de 10 SECONDS
    public void timeOutImplicitWaitSegTwo(AndroidDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return;
    }

    //Metodo generico para hacer una espera de implicitamente de 10 MINUTES
    public void timeOutImplicitWaitMinOne(AndroidDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        return;
    }

    //Metodo generico para hacer una espera de implicitamente de 10 MINUTES
    public void timeOutImplicitWaitMinTwo(AndroidDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        return;
    }

    //Metodo generico para hacer una espera de implicitamente de 1 HOURS
    public void timeOutImplicitWaitHorOne(AndroidDriver driver) {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.HOURS);
        return;
    }

    //Metodo generico para hacer una espera de implicitamente de 2 HOURS
    public void timeOutImplicitWaitHorTwo(AndroidDriver driver) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.HOURS);
        return;
    }

    /*
    //Explicit Waits
    //Metodo generico para hacer una espera de Explicitamente de un Elemento Web localizable  presente
    public void ExplicitWaitElementLocated(AndroidDriver driver, String element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name(element)));

    }

    //Metodo generico para hacer una espera de Explicitamente un Elemento Web  clickleable
    public void ExplicitWaitToBeClickable(AndroidDriver driver, String element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
    }

    //Metodo generico para hacer una espera de Explicitamente de un Elemento Web localizable Visible
    public void ExplicitWaitToInvisibility(AndroidDriver driver, String element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
     */
}
