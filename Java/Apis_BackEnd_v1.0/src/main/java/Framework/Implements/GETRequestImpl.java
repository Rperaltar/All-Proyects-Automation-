package Framework.Implements;

import Framework.Interfaces.GETRequestInterface;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class GETRequestImpl implements GETRequestInterface {

    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - GETRequestImpl             #
    #  Nos apoya a controlar la generación   #
    #  de metodos en comun y puedan          #
    #  ser reutilizados                      #
    #  en otras clases para la,              #
    #  Selección de Datos tipo JSON / XML.   #
    #  Dentro de una BD.                     #
    #                                        #
    ##########################################
    */

    //Metodo Selección de Datos tipo JSON / XML Dentro de una BD.
    //    #  Estos  Objetos
    public void GETRequest(){
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        System.out.println("El codigo de Respuesta es :" + response.getStatusCode());
        System.out.println("El Body de JSON de Respuesta es :" + response.body().asString());
    }
    //Metodo Selección de Datos tipo JSON / XML Dentro de una BD.
    public void GETRequestMethod() {
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/Hyderabad");
        String responseBody = response.body().asString();
        System.out.println("Response Body is =>  " + responseBody);
        System.out.println(response.getStatusCode());
    }
    //Metodo Selección de Datos tipo JSON / XML Dentro de una BD.
    public void GEThttpRequest() {
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/Hyderabad");
    }
    //Metodo Selección de Datos tipo JSON / XML Dentro de una BD.
    public void GETRequestAllHeaders() {

        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/Hyderabad");
        // Get all the headers. Return value is of type Headers.
        // Headers class implements Iterable interface, hence we
        // can apply an advance for loop to go through all Headers
        // as shown in the code below
        Headers allHeaders = response.headers();

        // Iterate over all the Headers
        for (
                Header header : allHeaders) {
            System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
        }
    }
    //Metodo Selección de Datos tipo JSON / XML Dentro de una BD.
    public void GETRequestjsonPathEvaluator() {

        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/Hyderabad");
        // First get the JsonPath object instance from the Response interface
        JsonPath jsonPathEvaluator = response.jsonPath();
        System.out.println(response.asString());

        // Then simply query the JsonPath object to get a String value of the node
        // specified by JsonPath: City (Note: You should not put $. in the Java code)
        String city = jsonPathEvaluator.get("City");

        // Let us print the city variable to see what we got
        System.out.println("City received from Response " + jsonPathEvaluator.get("City"));

        // Print the temperature node
        System.out.println("Temperature received from Response " + jsonPathEvaluator.get("Temperature"));

        // Print the humidity node
        System.out.println("Humidity received from Response " + jsonPathEvaluator.get("Humidity"));

        // Print weather description
        System.out.println("Weather description received from Response " + jsonPathEvaluator.get("Weather"));

        // Print Wind Speed
        System.out.println("City received from Response " + jsonPathEvaluator.get("WindSpeed"));

        // Print Wind Direction Degree
        System.out.println("City received from Response " + jsonPathEvaluator.get("WindDirectionDegree"));
    }

    public void GETRequestWithQueryParam() {
        Response response = given().contentType(ContentType.JSON)
                .param("zipcode", "54743")
                .when()
                .get()
                .then().log().all()
                .extract().response();
    }

}
