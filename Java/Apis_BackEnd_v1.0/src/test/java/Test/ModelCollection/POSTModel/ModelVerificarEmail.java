package Test.ModelCollection.POSTModel;

import Framework.Base.Constantes;
import Framework.Base.ConstantesModelPOST;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class ModelVerificarEmail {

     /* Body JSON Request Model

    {"email":"noeisaipc2@live.com.mx"}

    */

    //Metodo que parsea el BodyJSON
    public void POSTVerificaEmail() {

        JSONObject jsonObject  = new JSONObject();
        jsonObject.put(ConstantesModelPOST.EMAIL, ConstantesModelPOST.EMAIL_USER);

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
