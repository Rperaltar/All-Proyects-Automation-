package AbstractNativeMethods.Interfaces;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

public interface NativeModelEventsInterface {

    /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    # Se crean una interface de Metodos                  #
    # mediante la Implementación - ModelEvents           #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades de                #
    #  de los Objetos mediante JAVA - Void               #
    #                                                    #
    ######################################################
    */


    void acceptAlert(AndroidDriver driver);
    void clickHold(AndroidDriver driver, AndroidElement element);
    void dobleClick(AndroidDriver driver, AndroidElement element);
    void contextClick(AndroidDriver driver, AndroidElement element);
    void dragDrop(AndroidDriver driver, AndroidElement element, WebElement webElement);

}
