package Test.ModelCollection.POSTModel;

import Framework.Base.ConstantesModelPOST;
import Framework.Base.Constantes;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class ModelinicioSesion {

     /* Body JSON Request Model
    {
    "email":"noeisaipc2@live.com.mx",
    "password":"$argon2id$v=19$m=16,t=2,p=1$Z0o2bGhHMDVkbFBJb3BBeQ$R4FosPT9jkX8QfvI9VNg8Q"
    }
    */

    //Metodo que parsea el BodyJSON
    public void POSTInicioSesion() {

        JSONObject jsonObject  = new JSONObject();
        jsonObject.put(ConstantesModelPOST.CORREO, ConstantesModelPOST.CORREO_USER);
        jsonObject.put(ConstantesModelPOST.PASSWORD, ConstantesModelPOST.PASSWORD_USER);

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
