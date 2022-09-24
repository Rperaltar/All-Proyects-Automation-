package AbstractNativeMethods.Implements;

import AbstractNativeMethods.Interfaces.NativeModelGetInteface;
import io.appium.java_client.android.AndroidDriver;

public class NativeModelGetImpl implements NativeModelGetInteface {

    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelGetImpl              #
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

    //Metodo generico para setear la url a despelegar en el navegador Web
    public void getUrl(String url, AndroidDriver driver){
        driver.get(url);
        return;
    }

    //Metodo generico para setear titulo de la url a despelegar en el navegador Web
    public String getTitle(AndroidDriver driver){
        driver.getTitle();
        return null;
    }

    //Metodo generico para setear el origen y datos de la url a despelegar en el navegador Web
    public void getPageSource(AndroidDriver driver){
        driver.getPageSource();
        return;
    }

    //Metodo generico para setear el nombre de la url a despelegar en el navegador Web
    public void getCurrentUrl(AndroidDriver driver){
        driver.getCurrentUrl();
        return;
    }

    //Metodo generico para setear la url a despelegar en el navegador Web
    public void getManage(AndroidDriver driver){
        driver.getClass();
        return;
    }

    //Metodo generico para
    public void getWindowHandle(AndroidDriver driver){
        driver.getWindowHandle();
        return;
    }

    //Metodo generico para setear la url a despelegar en el navegador Web
    public void getWindowHandles(AndroidDriver driver){
        driver.getWindowHandles();
        return;
    }

}
