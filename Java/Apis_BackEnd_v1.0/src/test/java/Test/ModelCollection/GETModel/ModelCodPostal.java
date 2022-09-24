package Test.ModelCollection.GETModel;

import Framework.Base.Constantes;
import Framework.Base.ConstantesModelGET;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class ModelCodPostal extends ConstantesModelGET {

    //Metodo que parsea por parametros el BodyJSON
    public void GETCodigoPostal() {
        Response response = given().contentType(ContentType.JSON)
                .param(ZIPCODE, CODIGO_POSTAL)
                .when()
                .get()
                .then().log().all()
                .extract().response();

        //Validaciones del BodyJSON a consumir.
        Assert.assertEquals(Constantes.CODIGO_ACTUAL_OK200, response.statusCode());
    }
}
