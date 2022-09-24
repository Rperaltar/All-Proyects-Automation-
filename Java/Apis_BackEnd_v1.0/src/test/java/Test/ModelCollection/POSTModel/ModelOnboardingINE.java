package Test.ModelCollection.POSTModel;

import Framework.Base.Constantes;
import Framework.Base.ConstantesModelPOST;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class ModelOnboardingINE {

     //Body JSON Request Model

    public static String MAN = "";
    public static String BFN = "";
    public static String BLN = "";
    public static String NATIONALITY = "MX";
    public static String BS = "Ciudad de Mexico";
    public static String DOB = "1997-01-10";
    public static String BGD = "M";
    public static String ASNN = "mx:PECN970110HTLRHX07";
    public static String TEA = "";
    public static String PHN = "+525511183416";
    public static String BSN = "Jose Maria Facha";
    public static String SSN = "Jose Maria Facha 2066";
    public static String BNBH= "Santa Martha Acatitla";
    public static String BZ = "09510";
    public static String BC = "Ciudad de Mexico";
    public static String CLAT = "19.3606853";
    public static String CLONG = "-99.0216193";
    public static String VOTERID = "mx:PRCHNO97071029H900";
    public static String BCO = "MX";
    public static String DOCTYPE = "ID";
    public static String MEMO = "Noe Isai Perez";
    public static String MEMO1 = "iztapalapa";
    public static String MEMO2 = "programador";
    public static String MEMO3 = "no";
    public static String MEMO4 = "no";
    public static String MEMO5 = "";
    public static String MEMO6 = "";
    public static String MEMO7 = "";
    public static String MEMO8 = "no";
    public static String MEMO9 = "memo10";
    public static String MEMO10 = "";
    public static String MEMO11 = "";
    public static String MEMO12 = "$10,001 - $50,000";
    public static String MEMO13 = "";
    public static String MEMO14 = "";
    public static String MEMO15 = "";
    public static String MEMO16 = "";
    public static String MEMO17 = "";
    public static String MEMO18 = "";
    public static String MEMO19 = "";
    public static String MEMO20 = "";
    public static String MEMO21 = "";
    public static String MEMO22 = "";
    public static String MEMO23= "";
    public static String MEMO24 = "";
    public static String MEMO25 = "";
    public static String MEMO26 = "";


    //Metodo que parsea el BodyJSON
    public void POSTOnboardingINE() {

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
