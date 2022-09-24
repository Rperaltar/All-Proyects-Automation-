package AbstractNativeMethods.Interfaces;

import io.appium.java_client.android.AndroidDriver;

public interface NativeModelWaits {

    /*
    #################################################
    #            Patron de Diseño                   #
    #           ScreeenPlayActions                  #
    #                                               #
    # Se crean una interface de Metodos             #
    # mediante la Implementación - ModelWaits       #
    #                                               #
    #  Con el Objetivo de                           #
    #  inicializar las funcionalidades de           #
    #  de los Objetos mediante JAVA - Void          #
    #                                               #
    #################################################
    */

    void timeOutImplicitWaitMilOne(AndroidDriver driver);
    void timeOutImplicitWaitMilTwo(AndroidDriver driver);
    void timeOutImplicitWaitSegOne(AndroidDriver driver);
    void timeOutImplicitWaitSegTwo(AndroidDriver driver);
    void timeOutImplicitWaitMinOne(AndroidDriver driver);
    void timeOutImplicitWaitMinTwo(AndroidDriver driver);
    void timeOutImplicitWaitHorOne(AndroidDriver driver);
    void timeOutImplicitWaitHorTwo(AndroidDriver driver);
    /*
    void ExplicitWaitElementLocated(AndroidDriver driver, String element);
    void ExplicitWaitToBeClickable(AndroidDriver driver, String element);
    void ExplicitWaitToInvisibility(AndroidDriver driver, String element);

     */
}
