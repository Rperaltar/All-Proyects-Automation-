package Framework.LogConf;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
/*
import org.testng.annotations.BeforeClass;

public class LogConfig {


    //Variables publicas para generar los objetos de tipo LOG
    public static RequestSpecification httpRequest;
    public static Response response;
    public Logger logger;

    //Anotación de TestNG - Esto se ejecuta antes de todos los metodos dentro de una clase
    @BeforeClass
    public void setup(){
        //Construye el Objeto Log4j que este lo que hace es un debug de lo que se esta ejecutando
        //y lo genera como resultado en un archivo "log.txt" esto lo obtiene de la configuración de Log4j.properties
        logger=Logger.getLogger("Fox API");//added Logger
        PropertyConfigurator.configure("Log4j.properties"); //added logger
        logger.setLevel(Level.DEBUG);

    }
}

 */
