package Framework.Implements;

import Framework.Interfaces.RequestInterface;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RequestImpl implements RequestInterface {

    	/*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - DeployImpl                    #
    #  Nos apoya a controlar la generación   #
    #  de metodos en comun y puedan          #
    #  ser reutilizados                      #
    #  en otras clases para envíar           #
    #  las solicitudes requeridas de los     #
    #  End Points.                           #
    #                                        #
    ##########################################
    */

    //Metodos nos apoyan a contener la url del End-Point y/o APi
    //y nos apoya enviando el Request y/o solictud
    public void RestAssuredBaseURL(String url) {
        RestAssured.baseURI = (url);
        return;
    }
    public void RestAssuredGetUrl(String url) {
        Response response = RestAssured.get(url);
        return;
    }
}
