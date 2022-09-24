package AbstractNativeMethods.Implements;

import AbstractNativeMethods.Interfaces.NativeModelNavigateInteface;
import io.appium.java_client.android.AndroidDriver;

public class NativeModelNavigateImpl implements NativeModelNavigateInteface {


    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelNavigateImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de Navegaciones #
    #  en Selenium.                          #
    #                                        #
    ##########################################
    */

    //Metodo generico para navegar en una url especifica tipo "https://"
    public void navigateUrl(String url, AndroidDriver driver){
        driver.navigate().to(url);
        return;
    }

    //Metodo generico para actualizar una url especifica tipo "https://"
    public void navigateRefresh(AndroidDriver driver){
        driver.navigate().refresh();
        return;
    }

    //Metodo generico para navegar una pagina Atras de donde estas posocionado en una url tipo "https://"
    public void navigateBack(AndroidDriver driver){
        driver.navigate().back();
        return;
    }

    //Metodo generico  para navegar una pagina Adelante de donde estas posocionado en una url tipo "https://"
    public void navigateForward(AndroidDriver driver){
        driver.navigate().forward();
        return;
    }
}

