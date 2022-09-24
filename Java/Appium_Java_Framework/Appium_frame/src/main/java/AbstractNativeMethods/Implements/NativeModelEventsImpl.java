package AbstractNativeMethods.Implements;

import AbstractNativeMethods.Interfaces.NativeModelEventsInterface;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

class NativeModelEventsImpl implements NativeModelEventsInterface {

    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelEventsImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de Eventos      #
    #  de Selenium.                          #
    #                                        #
    ##########################################
    */

    //Metodo generico para dar click o aceptar las ventanas emegentes un "Pop-up" de Alerta
    public void acceptAlert(AndroidDriver driver){
        driver.switchTo().alert();
        return;
    }

    //Metodo generico para dar dobleclic en un Elemento Web
    public void dobleClick(AndroidDriver driver, AndroidElement element){
        Actions dobleClic = new Actions(driver);
        dobleClic.contextClick(element).build().perform();
        return;
    }

    //Metodo generico para posicionarce en un Elemento Web y darle clic al mismo tiempo
    public void contextClick(AndroidDriver driver,AndroidElement element){
        Actions contClick = new Actions(driver);
        contClick.contextClick(element).build().perform();
        return;
    }

    //Metodo generico para posicionarce en un Elemento Web y darle clic al mismo tiempo
    public void clickHold(AndroidDriver driver,AndroidElement element){
        Actions clickhold = new Actions(driver);
        clickhold.contextClick(element).build().perform();
        return;
    }

    //Metodo generico para posicionarce en una funcionalidad de tipo barra ya sea latera y / horizontal
    // y hace el deslice hacia izquierda o derecha de la misma
    public void dragDrop(AndroidDriver driver,AndroidElement element,WebElement webElement){
        (new Actions(driver)).dragAndDrop(element, webElement).perform();
        return;
    }

}
