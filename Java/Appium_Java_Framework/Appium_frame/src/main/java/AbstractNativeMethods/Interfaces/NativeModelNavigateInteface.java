package AbstractNativeMethods.Interfaces;

import io.appium.java_client.android.AndroidDriver;

public interface NativeModelNavigateInteface {

    /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    # Se crean una interface de Metodos                  #
    # mediante la Implementación - ModelNavigateInteface #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades de                #
    #  de los Objetos mediante JAVA - Void               #
    #                                                    #
    ######################################################
    */

    void navigateUrl(String url, AndroidDriver driver);
    void navigateRefresh(AndroidDriver driver);
    void navigateBack(AndroidDriver driver);
    void navigateForward(AndroidDriver driver);
}
