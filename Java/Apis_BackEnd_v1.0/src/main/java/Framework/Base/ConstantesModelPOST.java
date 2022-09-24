package Framework.Base;

public class ConstantesModelPOST {

    //URL -End-Point obtenerAplicacionImages
    public static String APISalirSesion   = "http://54.173.86.66:4000/api/v1/sign_up";
    //URL -End-Points
    public static String APIiniciarSesion = "http://54.173.86.66:4000/api/v1/sign_in";
    //URL -End-Points
    public static String APIValidarEmail  = "http://54.173.86.66:4000/api/v1/validations/email";
    //URL -End-Points
    public static String APIValidarPhone  = "http://54.173.86.66:4000/api/v1/validations/phone";
    //URL -End-Points
    public static String APIValidarSms    = "http://54.173.86.66:4000/api/v1/validations/verify_code";
    //URL -End-Points
    public static String APIValidarPassword  = "http://54.173.86.66:4000/api/v1/card_holders/change_password";

    //Variables para BodyRequestJSON "Iniciar Sesión"
    public static String CORREO        = "email";
    public static String PASSWORD      = "password";
    public static String CORREO_USER   = "noeisaipc2@live.com.mx";
    public static String PASSWORD_USER = "$argon2id$v=19$m=16,t=2,p=1$Z0o2bGhHMDVkbFBJb3BBeQ$R4FosPT9jkX8QfvI9VNg8Q";

    //Variables para BodyRequestJSON "Cerrar Sesión"
    public static String EMAIL         = "email";
    public static String PHONE         = "phone";
    public static String EMAIL_USER    = "noeisaipc2@live.com.mx";
    public static String PHONE_USER    = "+5211183412";
    public static String PASSWORD_HASH = "password_hash";
    public static String ID_TRANSACTION = "f8ffc0458a35417c969cf7190639fb96";
    public static String COD_PASSWORD_HASH     = "$argon2id$v=19$m=16,t=2,p=1$Z0o2bGhHMDVkbFBJb3BBeQ$R4FosPT9jkX8QfvI9VNg8Q";
    public static String ACUANT_TRANSACTION_ID = "acuant_trasation_id";

    //Variables para BodyRequestJSON "ValidarSms"
    public static String CODE           = "code";
    public static String SECRET         = "secret";
    public static String VERIFY_CODE_SMS       = "972937";
    public static String VERIFY_SECRET_SMS     = "4JIHLD3XYARZ7CI66ELJEFMFQ3XGLB7DFNPL7KIVP6M2T6Q3AJESDNCGBSXKZMQQ3NDIRN7JWEDWSIBZQIWHDINKSEQ5P4GGHRDZSMQ";

    //Variables para BodyRequestJSON "ValidarEmail"
    public static String VERIFY_EMAIL = "noeisaipc2@live.com.mx";

    //Variables para BodyRequestJSON "ValidarPhone"
    public static String PHONE_NUMBER = "phone_number";
    public static String VERIFY_PHONE = "+5211183412";

    //Variables para BodyRequestJSON "ValidarPassword"
    public static String VERIFY_PASSWORD = "Test";



}
