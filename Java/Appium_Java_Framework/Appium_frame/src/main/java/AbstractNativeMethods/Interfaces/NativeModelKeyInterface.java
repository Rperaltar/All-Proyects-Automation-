package AbstractNativeMethods.Interfaces;

import io.appium.java_client.android.AndroidElement;

public interface NativeModelKeyInterface {

  /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    # Se crean una interface de Metodos                  #
    # mediante la Implementación - ModelKey              #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades de                #
    #  de los Objetos mediante JAVA - Void               #
    #                                                    #
    ######################################################
    */


    void keyAlt(AndroidElement element);
    void keyTab(AndroidElement element);
    void keyEnter(AndroidElement element);
    void keyCancel(AndroidElement element);
    void keyAdd(AndroidElement element);
    void keyControl(AndroidElement element);
    void keyCommand(AndroidElement element);
    void keyBack(AndroidElement element);
    void keyF11(AndroidElement element);
}
