package DataDriven;


import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

    /*
    ##########################################
    #                                        #
    #  Clase - data-provider                  #
    #  Realiza La lectura del contenido      #
    #  General de un archivo tipo "File.xlsx"#
    #  Parsea los datos del excel con los de #
    #  los Inputs de un formulario           #
    ##########################################
    */


    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod(String value1, String value2){
        return new Object[][] { { value1 }, { value2 } };
    }
}
