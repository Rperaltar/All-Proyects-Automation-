package AbstractNativeMethods.Implements;


import AbstractNativeMethods.Interfaces.NativeActionsInterface;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NativeActionsImpl implements NativeActionsInterface {

    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelActionsImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de Acciones     #
    #  de Selenium.                          #
    #                                        #
    ##########################################
    */

    //Metodo generico para dar clic en un Elemento Web
    public void click(AndroidElement element) {
        element.click();
        return;
    }

    //Metodo generico para agregar texto a un textbox de un Elemento Web
    public void sendKeys(AndroidElement element, String key) {
        element.sendKeys(key);
        return;
    }

    //Metodo generico para limpiar un textbox de un Elemento Web
    public void clear(AndroidElement element)
    {
        element.clear();
        return;
    }

    //Metodo generico para cerrar el la ventana del navegador
    public void close(AndroidDriver driver) {
        driver.close();
        return;
    }

    //Metodo generico para cerrar el la ventana del navegador
    public void quit(AndroidDriver driver) {
        driver.quit();
        return;
    }

    //Metodo generico para abrir la url de una pagina web en un navegador
    public void getUrl(String url, AndroidDriver driver) {
        driver.get(url);
        return;
    }

    //Metodo generico para abrir una url de una pagina web especifica en un navegador
    public void navigateUrl(String url, AndroidDriver driver) {
        driver.navigate().to(url);
        return;
    }

    //Metodo generico para refrescar y / o actualizar la pagina
    public void reFresh(AndroidDriver driver) {
        driver.navigate().refresh();
        return;
    }

    //Metodo generico para mandar un Mensaje de Consola
    public void printInt(String msgLog) {
        System.out.println(msgLog);
        return;

    }

    // Metodo generico que hace que se duerma por unos milisegundo el navegador
    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        return;
    }

    //Metodo generico que hace que se duerma por unos milisegundo el navegador
    public void sleepMed() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }

    //Metodo generico para hacer un scroll y / o bajar dentro de la pagina
    public void scrollDownMax(AndroidDriver driver) {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,10000)", "");
        return;
    }

    //Metodo generico para hacer un un scroll y / o bajar dentro de la pagina
    public void scrollDown(AndroidDriver driver) {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,500)", "");
        return;
    }

    //Metodo generico para scroll y / o subir dentro de la pagina
    public void scrollUp(AndroidDriver driver) {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,-1000)", "");
        return;
    }

    //Metodo generico para dar seleccionar en un Elemento Web dentro de Un comboBox o ListBox
    public void selectByVisibleText(AndroidElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
        return;
    }

    //Metodo generico para ir o posicionarce en un Elemento Web
    public void moveTo(AndroidElement element, AndroidDriver driver) {
        Actions menu = new Actions(driver);
        menu.moveToElement(element).build().perform();
        return;
    }

    //Metodo generico para que la pantalla de la Pagina Web se haga de tipo fullscreen
    public void fullScreen(AndroidDriver driver) {
        driver.manage().window().fullscreen();
        return;
    }

    //Metodo generico para Maximizar una Pagina Web
    public void maximize(AndroidDriver driver) {
        driver.manage().window().maximize();
        return;
    }

    //Metodo generico para Buscar e Ingresar en Un WebElement de tipo / iframe
    public void swichFrame(AndroidElement element, AndroidDriver driver) {
        driver.switchTo().frame(element);
        return;
    }


    //Metodo generico para Buscar y Salir de Un WebElement de tipo / iframe
    public void closeFrame(AndroidDriver driver) {
        driver.switchTo().defaultContent();
        return;
    }

    //Metodo generico para Buscar y entrar a un tipo de WebElement
    //Activos como por ejemplo un "FileUpload" para subir y / o selecionar un archivo.
    public void swichToActiveElement(AndroidDriver driver) {
        driver.switchTo().activeElement();
        return;
    }

    //Metodo generico para Buscar e Ingresar en Un WebElement de tipo / iframe con un array inicializado en "[0]"
    public void swichToFrameInt(AndroidDriver driver,Integer Init){
        driver.switchTo().frame(Init);
        return;
    }

    //Metodo generico para salir de un WebElement de tipo / iframe
    public void swichToDefaultContent(AndroidDriver driver){
        driver.switchTo().defaultContent();
        return;
    }
}
