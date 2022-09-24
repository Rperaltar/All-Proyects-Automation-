package Framework.Implements;

import Framework.Base.Constantes;
import Framework.Interfaces.DELETERequestInterface;
import Framework.Interfaces.POSTRequestInterface;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class DELETERequestImpl implements DELETERequestInterface {


	/*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - DELETERequestImpl             #
    #  Nos apoya a controlar la generación   #
    #  de metodos en comun y puedan          #
    #  ser reutilizados                      #
    #  en otras clases para la Eliminación   #
    #  de Objetos tipo JSON / XML.           #
    #                                        #
    ##########################################
    */

     //Metodo Eliminación de Objetos en BD de tipo JSON / XML.
    public void  DELETERequest(String url){

        int empid = 15410;

        RequestSpecification request = RestAssured.given();

        // Add a header stating the Request body is a JSON
        request.header("Content-Type", "application/json");

        // Delete the request and check the response
        Response response = request.delete("/delete/" + empid);

        int statusCode = response.getStatusCode();
        System.out.println("Cuerpo de Respuesta " + ":" + response.asString());

        //Assert.assertEquals(statusCode, 200);
        System.out.println("Codigo de Respuesta OK " + ":" + response.getStatusCode());

        String jsonString = response.asString();
        Assert.assertEquals(jsonString.contains("15410"), true);
 }
}
