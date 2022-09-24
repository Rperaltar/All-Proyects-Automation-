package Test.ModelCollection.POSTModel;

import Framework.Base.Constantes;
import Framework.Base.ConstantesModelPOST;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class ModelSalirSesion {

     /* Body JSON Request Model
    {
    "email":"noeisaipc2@live.com.mx",
    "phone":"+5211183412",
    "acuant_trasation_id":"f8ffc0458a35417c969cf7190639fb96",
    "password_hash":"$argon2id$v=19$m=16,t=2,p=1$Z0o2bGhHMDVkbFBJb3BBeQ$R4FosPT9jkX8QfvI9VNg8Q"
    }
    */

    //Metodo que parsea el BodyJSON
    public void POSTInicioSesion() {

        JSONObject jsonObject  = new JSONObject();
        jsonObject.put(ConstantesModelPOST.EMAIL, ConstantesModelPOST.EMAIL_USER);
        jsonObject.put(ConstantesModelPOST.PHONE, ConstantesModelPOST.PHONE_USER);
        jsonObject.put(ConstantesModelPOST.ACUANT_TRANSACTION_ID, ConstantesModelPOST.ID_TRANSACTION);
        jsonObject.put(ConstantesModelPOST.PASSWORD_HASH, ConstantesModelPOST.COD_PASSWORD_HASH);

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
