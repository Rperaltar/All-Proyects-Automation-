package AbstractNativeMethods.Interfaces;

import io.appium.java_client.android.AndroidDriver;

public interface NativeModelGetInteface {

   /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    # Se crean una interface de Metodos                  #
    # mediante la Implementación - ModelGetInteface      #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades de                #
    #  de los Objetos mediante JAVA - Void               #
    #                                                    #
    ######################################################
    */


    void getUrl(String url, AndroidDriver driver);
    String getTitle(AndroidDriver driver);
    void getPageSource(AndroidDriver driver);
    void getCurrentUrl(AndroidDriver driver);
    void getManage(AndroidDriver driver);
    void getWindowHandle(AndroidDriver driver);
    void getWindowHandles(AndroidDriver driver);

}
