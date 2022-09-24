package Test.ModelCollection.POSTModel;

import Framework.Base.Constantes;
import Framework.Base.ConstantesModelPOST;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class ModelVerificarSMS {

     /* Body JSON Request Model

    {
    "secret":"4JIHLD3XYARZ7CI66ELJEFMFQ3XGLB7DFNPL7KIVP6M2T6Q3AJESDNCGBSXKZMQQ3NDIRN7JWEDWSIBZQIWHDINKSEQ5P4GGHRDZSMQ=",
    "code":"972937"}
    }
    */

    //Metodo que parsea el BodyJSON
    public void POSTVerificaSMS() {

        JSONObject jsonObject  = new JSONObject();
        jsonObject.put(ConstantesModelPOST.SECRET, ConstantesModelPOST.VERIFY_SECRET_SMS);
        jsonObject.put(ConstantesModelPOST.CODE, ConstantesModelPOST.VERIFY_CODE_SMS);

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
