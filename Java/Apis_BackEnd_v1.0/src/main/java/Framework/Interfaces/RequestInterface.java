package Framework.Interfaces;

import io.restassured.response.Response;

public interface RequestInterface {

        /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    #  Se crean una interface                            #
    #  para la Implementación de metodos y Objetos       #
    #  dentro de la clase DeployInterface                #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades                   #
    #  de los Metodos implemnetados y Objetos            #
    #  con JAVA - Void                                   #
    #                                                    #
    ######################################################
    */

    void RestAssuredBaseURL(String url);
    void RestAssuredGetUrl(String url);
}
