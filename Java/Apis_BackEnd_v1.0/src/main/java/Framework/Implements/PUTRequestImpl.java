package Framework.Implements;

import Framework.Base.Constantes;
import Framework.Interfaces.POSTRequestInterface;
import Framework.Interfaces.PUTRequestInterface;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class PUTRequestImpl implements PUTRequestInterface {

            /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - PUTRequestImpl               #
    #  Nos apoya a controlar la generación   #
    #  de metodos en comun y puedan          #
    #  ser reutilizados                      #
    #  en otras clases para la,              #
    #  Actualizar Recursos de tipo           #
    #  JSON / XML Dentro de una BD.          #
    #                                        #
    ##########################################
    */

    //Metodo que Actualiza un Recurso existente de tipo JSON / XML Dentro de una BD.
    //Este Request lo envía mediante "ParamJSON"
    public void PUTRequest(String url){

        int empid = 15410;

        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "Zion"); // Cast
        requestParams.put("age", 23);
        requestParams.put("salary", 12000);

        request.body(requestParams.toJSONString());
        Response response = request.put(url +  empid);

        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
    }
    }
