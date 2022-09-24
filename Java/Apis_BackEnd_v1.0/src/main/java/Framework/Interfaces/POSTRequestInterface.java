package Framework.Interfaces;

public interface POSTRequestInterface {

    /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    #  Se crean una interface                            #
    #  para la Implementación de metodos y Objetos       #
    #  dentro de la clase POSTRequestImpl                #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades                   #
    #  de los Metodos implemnetados y Objetos            #
    #  con JAVA - Void                                   #
    #                                                    #
    ######################################################
    */

    void POSTRequest();
    void POSTcreateEmployee();
    void POSTRequestJSONobject();
    void POSTEmployeeDataLogin();
    void POSTRestAssuredMAPBody();
    void POSTEmployeeDataRessetPasswd();
    void POSTResponseBody(String body, String urlEndpoint);


}

