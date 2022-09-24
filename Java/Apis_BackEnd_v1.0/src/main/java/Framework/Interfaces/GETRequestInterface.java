package Framework.Interfaces;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public interface GETRequestInterface {

    /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    #  Se crean una interface                            #
    #  para la Implementación de metodos y Objetos       #
    #  dentro de la clase GETRequestImpl                 #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades                   #
    #  de los Metodos implemnetados y Objetos            #
    #  con JAVA - Void                                   #
    #                                                    #
    ######################################################
    */

    void GETRequest();

    void GETRequestMethod();

    void GEThttpRequest();

    void GETRequestAllHeaders();

    void GETRequestWithQueryParam();
}

