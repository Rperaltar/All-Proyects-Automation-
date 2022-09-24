package AbstractNativeMethods.Interfaces;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public interface NativeActionsInterface {

   /*
    #################################################
    #               Patron de Diseño                #
    #              ScreeenPlayActions               #
    #                                               #
    #  Se crean una interface de Metodos            #
    #  mediante la Implementación - ModelActions    #
    #                                               #
    #  Con el Objetivo de                           #
    #  inicializar las funcionalidades de           #
    #  de los Objetos mediante JAVA - Void          #
    #                                               #
    #################################################
    */

    void sleep();
    void sleepMed();
    void quit(AndroidDriver driver);
    void close(AndroidDriver driver);
    void printInt(String msgLog);
    void clear(AndroidElement element);
    void reFresh(AndroidDriver driver);
    void click(AndroidElement element);
    void scrollUp(AndroidDriver driver);
    void maximize(AndroidDriver driver);
    void fullScreen(AndroidDriver driver);
    void scrollDown(AndroidDriver driver);
    void closeFrame(AndroidDriver driver);
    void scrollDownMax(AndroidDriver driver);
    void getUrl(String url, AndroidDriver driver);
    void swichToActiveElement(AndroidDriver driver);
    void swichToDefaultContent(AndroidDriver driver);
    void sendKeys(AndroidElement element, String key);
    void navigateUrl(String url, AndroidDriver driver);
    void moveTo(AndroidElement element, AndroidDriver driver);
    void swichToFrameInt(AndroidDriver driver, Integer Init);
    void swichFrame(AndroidElement element, AndroidDriver driver);
    void selectByVisibleText(AndroidElement element, String value);

}
