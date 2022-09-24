package Test.ModelCollection.GETModel;

import Framework.Base.Constantes;
import Framework.Base.ConstantesModelGET;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class ModelonboardingObtenerFirmaDigitalid extends ConstantesModelGET {

    //Metodo que parsea por parametros el BodyJSON
    public void GETonboardingObtenerFirmaDigitalid() {
        Response response = given().contentType(ContentType.JSON)
                .param(GRAPH_SCORE_RESPONSE, false)
                .when()
                .get()
                .then().log().all()
                .extract().response();

        //Validaciones del BodyJSON a consumir.
        Assert.assertEquals(Constantes.CODIGO_ACTUAL_OK201, response.statusCode());

    }
}
