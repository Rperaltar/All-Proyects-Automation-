package lskitImpl.checkLinks;

import Base.Constantes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckingLinksPage extends Constantes {

     /*
    ######################################
    #  Clase - CheckingLinksPage         #
    #  el metodo recorre toda la pagina  #
    #  lo que encuentre dentro como tipo #
    #  url lo checkea y resgresa un      #
    #  valor tipo - True / False de que  #
    #   la url esta activa o inaciva     #
    ######################################
     */

    static WebDriver driver;

    //Constructor - de la clase CheckingLinksPage
    public CheckingLinksPage() {
        this.driver = driver;
    }


    /*Metodo - Crea un objeto de tipo lista de Elementos Web y los manda a un arreglo para despues hacer la conexión
    y verificacipo te tipo HTTP´s a los links de la landing
    */
    public boolean chekingPageLinks() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        String url = "";
        List<String> brokenLinks = new ArrayList<String>();
        List<String> okLinks = new ArrayList<String>();

        HttpURLConnection httpConnection = null;
        int responseCode = 200;
        Iterator<WebElement> iterator = links.iterator();


        while (iterator.hasNext()) {
            url = iterator.next().getAttribute("href");
            if (url == null || url.isEmpty()) ;
            System.out.println(url + "url no ha sido configurada");
            continue;
        }
        try {
            httpConnection = (HttpURLConnection) (new URL(url).openConnection());
            httpConnection.setRequestMethod("HEAD");
            httpConnection.connect();
            responseCode = httpConnection.getResponseCode();

            if (responseCode > 400) {
                System.out.println("ERROR BROKEN LINK :" + url);
                brokenLinks.add(url);
            } else {
                System.out.println("VALID LINK :" + url);
                okLinks.add(url);
            }


        } catch (Exception e) {

        }

        System.out.println("Valid Links :" + okLinks.size());
        System.out.println("Invalid Links" + brokenLinks.size());

        if (brokenLinks.size() > 0) {
            System.out.println("ERROR BROKEN LINKS");
            for (int i = 0; i < brokenLinks.size(); i++) {
                System.out.println(brokenLinks.get(i));
            }
            return false;
        } else {
            return true;
        }
    }
}
