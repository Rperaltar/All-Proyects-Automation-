package Framework.Implements;

import Framework.Base.Constantes;
import Framework.Interfaces.GETRequestInterface;
import Framework.Interfaces.POSTRequestInterface;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class POSTRequestImpl implements POSTRequestInterface {

        /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - POSTRequestImpl                #
    #  Nos apoya a controlar la generación   #
    #  de metodos en comun y puedan          #
    #  ser reutilizados                      #
    #  en otras clases para la,              #
    #  Generar Nuevos Recursos de Datos tipo #
    #  JSON / XML Dentro de una BD.          #
    #                                        #
    ##########################################
    */

    //Metodo que Generar Nuevo Recurso de tipo JSON / XML Dentro de una BD.
    //Este Request lo envía mediante "Parametros"
    public void POSTRequest() {

        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("username", "admin"); // Cast
        requestParams.put("password", "password123");

        request.body(requestParams.toJSONString());
        Response response = request.post();
        System.out.println(response.getStatusCode());
        System.out.println(response.body().asString());

    }

    //Metodo que Generar Nuevo Recurso de tipo JSON / XML Dentro de una BD.
    //Este Request lo envía mediante "BodyJSON"
    public void POSTRestAssuredMAPBody() {
    /* Body JSON Request
    {
    "password": "password123",
    "username": "admin"
    }
    */
        Map<String, String> authPayload = new HashMap<String, String>();
        authPayload.put("username", "admin");
        authPayload.put("password", "password123");

        //GIVEN
        RestAssured
                .given()
                .baseUri(Constantes.URL_RESTFULL_TOKEN)
                .contentType(ContentType.JSON)
                .body(authPayload)
                .log()
                .all()
                // WHEN
                .when()
                .post()
                // THEN
                .then()
                .assertThat().statusCode(Constantes.CODIGO_ESPERADO_OK200).log().all().extract().response();

    }

    //Metodo que Generar Nuevo Recurso de tipo JSON / XML Dentro de una BD.
    //Este Request parsea los parametros requeridos y lo envía mediante "BodyJSON"
    public void POSTRequestJSONobject() {

        JSONObject request = new JSONObject();
        request.put("username", "admin");
        request.put("password", "password123");

        //GIVEN
        given().
                body(request.toJSONString())
                .log()
                .all()
                // WHEN
                .when()
                .post()
                // THEN
                .then()
                .assertThat().statusCode(Constantes.CODIGO_ESPERADO_OK200).log().all();
    }

    //Metodo que Generar Nuevo Recurso de tipo JSON / XML Dentro de una BD.
    //Este Request parsea los parametros y Headers requeridos y lo envía mediante "ParamJSON"
    public void POSTcreateEmployee() {
        RequestSpecification httpRequest;
        Response response;

        String email = "hemant18@fox.com";
        String password = "abcdef";
        String gender = "M";
        String firstName = "Hemanta";
        String lastName = "Testa";

        // logger.info("********* Started TC001_REG_user  **********");

        RestAssured.baseURI = "https://api2.fox.com/v2.0";

        httpRequest = RestAssured.given();
        // JSONObject is a class that represents a simple JSON. We can add Key-Value pairs using the put method
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", email); // Cast
        requestParams.put("password", password);
        requestParams.put("gender", gender);
        requestParams.put("firstName", firstName);
        requestParams.put("lastName", lastName);

        // Add a header stating the Request body is a JSON
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("Cache-Control", "no-cache");
        httpRequest.header("Postman-Token", "a74249b3-97f1-45c0-999c-66d7841bed8a");
        httpRequest.header("x-api-key", "62d64c84d8a1242ed4483cad7d316be0");

        // Add the Json to the body of the request
        httpRequest.body(requestParams.toJSONString());

        response = httpRequest.request(Method.POST, "/register");

        //Thread.sleep(5000);

        String responseBody = response.getBody().asString();
        System.out.println("responseBody is :" + responseBody);
        Assert.assertEquals(responseBody.contains(email), true);
        Assert.assertEquals(responseBody.contains(gender), true);
        Assert.assertEquals(responseBody.contains(firstName), true);
        Assert.assertEquals(responseBody.contains(lastName), true);

    }

    //Metodo que Generar Nuevo Recurso de tipo JSON / XML Dentro de una BD.
    //Este Request parsea los parametros y Headers requeridos y lo envía mediante "ParamJSON"
    public void POSTEmployeeDataLogin() {
        RequestSpecification httpRequest;
        Response response;
        String email = "hemant12@fox.com";
        String password = "abcdef";

        //logger.info("********* Started TC002_LOGIN_user **********");

        RestAssured.baseURI = "https://api2.fox.com/v2.0";
        httpRequest = RestAssured.given();

        // JSONObject is a class that represents a simple JSON. We can add Key-Value pairs using the put method
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", email); // Cast
        requestParams.put("password", password);

        // Add a header stating the Request body is a JSON
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("Cache-Control", "no-cache");
        httpRequest.header("Postman-Token", "dd063a04-d4fa-4ed4-aa6f-363a887f94e3");
        httpRequest.header("x-api-key", "c7d8fa9220f040358f64e472e850458e");

        // Add the Json to the body of the POST LOGIN request
        httpRequest.body(requestParams.toJSONString());
        response = httpRequest.request(Method.POST, "/login");
        //Thread.sleep(7000);


    }

    //Metodo que Generar Nuevo Recurso de tipo JSON / XML Dentro de una BD.
    //Este Request parsea los parametros y Headers requeridos y lo envía mediante "ParamJSON"
    public void POSTEmployeeDataRessetPasswd() {

        RequestSpecification httpRequest;
        Response response;

        String email = "hemant14@fox.com";
        String message = "Reset Email Sent";
        String detail = "Please check your inbox";
        //logger.info("********* Started TC003_RESET_password **********");

        RestAssured.baseURI = "https://api2.fox.com/v2.0";
        httpRequest = RestAssured.given();

        // JSONObject is a class that represents a simple JSON. We can add Key-Value pairs using the put method
        JSONObject requestParams = new JSONObject();
        //add only email for reset password
        requestParams.put("email", email);

        // Add a header stating the Request body is a JSON
        httpRequest.header("Cache-Control", "no-cache");
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("Postman-Token", "748af4cc-40e6-4c03-a601-a604ac0ae966");
        httpRequest.header("x-api-key", "vHeTnXOe984VBvC0ud8lPpSbsxJ0c7kQ");

        // Add the Json to the body of the POST Reset request
        httpRequest.body(requestParams.toJSONString());
        response = httpRequest.request(Method.POST, "/reset");
        //Thread.sleep(7000);

        String responseBody = response.getBody().asString();
        System.out.println("Response body as string" + responseBody);
        Assert.assertEquals(responseBody.contains(message), true);
        Assert.assertEquals(responseBody.contains(detail), true);

    }

    //Metodo que Generar Nuevo Recurso de tipo JSON / XML Dentro de una BD.
    //Este Request parsea los Headers requeridos y lo envía mediante "BodyJSON"
    public void POSTResponseBody(String body, String urlEndpoint) {

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(body)
                .when()
                .post(urlEndpoint)
                .then()
                .extract().response();

        //Validaciones del BodyJSON a consumir.
        Assert.assertEquals(Constantes.CODIGO_ACTUAL_OK201, response.statusCode());
        Assert.assertEquals("foo", response.jsonPath().getString("title"));
        Assert.assertEquals("bar", response.jsonPath().getString("body"));
        Assert.assertEquals("1", response.jsonPath().getString("userId"));
        Assert.assertEquals("101", response.jsonPath().getString("id"));
    }

    public void POSTResponseBody_() {

        Response response = given()
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        //Validaciones del BodyJSON a consumir.
        Assert.assertEquals("foo", response.jsonPath().getString("title"));
        Assert.assertEquals("bar", response.jsonPath().getString("body"));
        Assert.assertEquals("1", response.jsonPath().getString("userId"));
        Assert.assertEquals("101", response.jsonPath().getString("id"));
    }
}
