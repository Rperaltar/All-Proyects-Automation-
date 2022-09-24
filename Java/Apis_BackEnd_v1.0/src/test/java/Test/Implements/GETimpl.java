package Test.Implements;


import Framework.Base.Constantes;
import Framework.Base.ConstantesModelGET;
import Test.Interface.GETInt;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import org.json.simple.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class GETimpl implements GETInt {

    //Metodo que parsea por parametros el BodyJSON
    public void GETCodPostal() {
        Response response = given().contentType(ContentType.JSON)
                .param(ConstantesModelGET.ZIPCODE, ConstantesModelGET.CODIGO_POSTAL)
                .when()
                .get()
                .then().log().all()
                .extract().response();

        //Validaciones del BodyJSON a consumir.
        Assert.assertEquals(Constantes.CODIGO_ACTUAL_OK200, response.statusCode());
    }
}
