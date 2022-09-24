package ExtentReporting;

import Base.Constantes;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ExtentReportUtil extends ExtentReport{

    /*
    ####################################
    #                                  #
    #  Clase - ExtentReport            #
    #  el metodo crea un reporte       #
    #  de tipo HTML con el resultado   #
    #  de las pruebas ejecutadas       #
    #                                  #
    ####################################
     */

    String fileName = Constantes.PATH_EXTENT_REPORT + Constantes.PATH_NAME + Constantes.PATH_EXTENSION;

    //Crea extent report - object
    public ExtentHtmlReporter ExtentReport(){

        extent = new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Reporte de Pruebas");
        htmlReporter.config().setEncoding("uft-8");
        htmlReporter.config().setReportName("QA");

        extent.attachReporter(htmlReporter);
        return htmlReporter;
    }

    //Crea captura de pantalla dentro - Extent report - object
    public File ExtentReportAshot() throws IOException {

        File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(image.toPath(),new File(Constantes.PATH_ASHOT + Constantes.EXT_ASHOT + Constantes.NAME_ASHOT).toPath());
        return image;
    }
    //Cierra y finaliza - Extent report - object
    public void FlushReport(){
        extent.flush();
    }

    public ExtentReportUtil(){
        return;
    }
}
