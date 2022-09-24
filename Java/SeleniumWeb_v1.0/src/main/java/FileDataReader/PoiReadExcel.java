package FileDataReader;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PoiReadExcel {

    /*
    ##########################################
    #                                        #
    #  Clase - PoiReadExcel                  #
    #  Realiza La lectura del contenido      #
    #  General de un archivo tipo "File.xlsx"#
    #  Parsea los datos del excel con los de #
    #  los Inputs de un formulario           #
    ##########################################
    */

    //Variables -- para definir la lectura de el libro de Excel.xlsx y la hoja de Excel a leer
    public static XSSFWorkbook wb;
    public static XSSFSheet sheet;

    // Se crea un Objeto - que lea el Libro de Archivo "Excel.xlsx" de una Ruta especifica
    public FileInputStream PoiReadExcel(String excelPath) throws IOException {

            FileInputStream file = new FileInputStream(excelPath);
            wb = new XSSFWorkbook(file);
            return file;
    }
     /*
     Se crea un Objeto - que lea las columnas y registros del Archivo "Excel.xlsx"
     tanto pára el dato como para la columna especifica a Obtener en el parseo de los Inputs a Inyectar
     */
    public String readData(int row, int column) {

        sheet = wb.getSheet("Inputs_Test");
        String data = sheet.getRow(row).getCell(column).getStringCellValue();
        System.out.println(data);
        return data;

    }
    public PoiReadExcel(){
        return;
    }
}
