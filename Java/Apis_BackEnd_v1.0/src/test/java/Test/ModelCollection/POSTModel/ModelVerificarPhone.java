package Test.ModelCollection.POSTModel;

import Framework.Base.Constantes;
import Framework.Base.ConstantesModelPOST;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class ModelVerificarPhone {

     /* Body JSON Request Model
   {
   "phone_number":"+5211183412"
   }
    */

    //Metodo que parsea el BodyJSON
    public void POSTVerificarPhone() {

        JSONObject jsonObject  = new JSONObject();
        jsonObject.put(ConstantesModelPOST.PHONE_NUMBER, ConstantesModelPOST.PHONE_USER);

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
