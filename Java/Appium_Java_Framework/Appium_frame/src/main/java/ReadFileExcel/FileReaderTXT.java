package FileDataReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderTXT {

    /*
    #########################################
    #                                       #
    #  Clase - FileReaderTXT                #
    #  Realiza La lectura del contenido     #
    #  General de un archivo tipo "File.txt"#
    #########################################
    */

    /*
    Crea un Objeto de tipo Read - Este Metodo -
    Realiza - La lectura del contenido General de un archivo tipo "File.txt"
    el result del archivo lo devuelve en una lista en consola
    */
    public static List<String> ReadFile(String rutFile, String delim) throws IOException {
            String bfRead;
            List<String> resultado = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new FileReader(rutFile));
            bfRead=br.readLine();
            do {
                String[] list = bfRead.split(delim);
               for (String inter:list) {
                   resultado.add(inter);
                   System.out.println(inter);
            }
        }while((bfRead = br.readLine())!=null);
            return resultado;
}
}