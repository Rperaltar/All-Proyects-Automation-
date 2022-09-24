package Framework.Base;

public class Constantes {

       /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - Constantes                    #
    #  Nos apoya a controlar los datos que   #
    #  se Tienen en duro y se puedan utilizar#
    #  en otras clases.                      #
    #                                        #
    ##########################################
    */

    //Variables Rutas End-Points
    public static String URL_ENDPOINT_PRUEBA_ONE_USER = "https://jsonplaceholder.typicode.com/users/1";
    public static String URL_ENDPOINT           = "https://demoqa.com/authentication/CheckForAuthentication";
    public static String URL_RESTFULL_TOKEN     = "https://restful-booker.herokuapp.com/auth";
    public static String URL_RESTFULL_CODPOSTAL = "http://54.173.86.66:4000/api/v1/address/";

    //Variables pra generar un PRINT-RESPONSE en consola
    public static String STATUS_CODE    = "Status code:";
    public static String STATUS_MESSAGE = "Status message:";

    //Variables Body Request JSON token
    public static String USER_NAME    = "admin";
    public static String PASSWORD     = "password123:";

    //Variables Message´s Assert´s
    public static String RESULT_SUCCES = "Codigo Esperado";

    //Variables Body Request
    public static String REQUEST_BODY = "";
            /*"{\n" +
            "  \"title\": \"foo\",\n" +
            "  \"body\": \"bar\",\n" +
            "  \"userId\": \"1\" \n}";
            */

    //Variables Assert Estatus de codigo Exitoso
    public static int CODIGO_ACTUAL_OK200 = 200;
    public static int CODIGO_ACTUAL_OK201 = 201;
    public static int CODIGO_ACTUAL_OK202 = 202;
    public static int CODIGO_ACTUAL_OK203 = 203;
    public static int CODIGO_ACTUAL_OK204 = 204;
    public static int CODIGO_ACTUAL_OK205 = 205;

    //Variables Assert Estatus de codigo Esperado Exitoso
    public static int CODIGO_ESPERADO_OK200 = 200;
    public static int CODIGO_ESPERADO_OK201 = 201;
    public static int CODIGO_ESPERADO_OK202 = 202;
    public static int CODIGO_ESPERADO_OK203 = 203;
    public static int CODIGO_ESPERADO_OK204 = 204;
    public static int CODIGO_ESPERADO_OK205 = 205;

    //Variables Assert Estatus de codigo Fallido
    public static int CODIGO_ACTUAL_FAIL400 = 200;
    public static int CODIGO_ACTUAL_FAIL401 = 401;
    public static int CODIGO_ACTUAL_FAIL500 = 500;



}
