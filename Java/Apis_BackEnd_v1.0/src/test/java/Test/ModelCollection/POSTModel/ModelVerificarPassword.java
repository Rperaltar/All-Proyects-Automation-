package Test.ModelCollection.POSTModel;

import Framework.Base.Constantes;
import Framework.Base.ConstantesModelPOST;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class ModelVerificarPassword {

     /* Body JSON Request Model
    {
    "password":"Test",
    }
    */

    //Metodo que parsea el BodyJSON
    public void POSTVerificaPassword() {

        JSONObject jsonObject  = new JSONObject();
        jsonObject.put(ConstantesModelPOST.PASSWORD, ConstantesModelPOST.VERIFY_PASSWORD);

        //GIVEN
        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(jsonObject)
                .log()
                .all()
                // WHEN
                .when()
                .post()
                // THEN
                .then()
                .assertThat().statusCode(Constantes.CODIGO_ESPERADO_OK200).log().all()
                .extract().response();
    }

}
