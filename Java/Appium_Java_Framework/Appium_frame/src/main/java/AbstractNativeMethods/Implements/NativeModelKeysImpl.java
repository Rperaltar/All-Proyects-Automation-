package AbstractNativeMethods.Implements;

import AbstractNativeMethods.Interfaces.NativeModelKeyInterface;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Keys;

public class NativeModelKeysImpl implements NativeModelKeyInterface {

    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelKeysImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de Eventos      #
    #  de tipo key en Selenium.                          #
    #                                        #
    ##########################################
    */

    //Metodo generico para dar enter como funcion del teclado en un Elemento Web
    public void keyEnter(AndroidElement element){
        element.sendKeys(Keys.ENTER);
        return;
    }

    //Metodo generico para dar Cancelar como funcion del teclado en un Elemento Web
    public void keyCancel(AndroidElement element){
        element.sendKeys(Keys.CANCEL);
        return;
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyAlt(AndroidElement element){
        element.sendKeys(Keys.ALT + "F4");
        return;
    }

    //Metodo generico para  realizar una acción como funcion del teclado
    public void keyTab(AndroidElement element){
        element.sendKeys(Keys.TAB);
        return;
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyAdd(AndroidElement element){
        element.sendKeys(Keys.ADD);
        return;
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyControl(AndroidElement element){
        element.sendKeys(Keys.CONTROL);
        return;
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyCommand(AndroidElement element){
        element.sendKeys(Keys.COMMAND);
        return;
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyBack(AndroidElement element){
        element.sendKeys(Keys.BACK_SPACE);
        return;
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyF11(AndroidElement element){
        element.sendKeys(Keys.F11);
        return;
    }

}
