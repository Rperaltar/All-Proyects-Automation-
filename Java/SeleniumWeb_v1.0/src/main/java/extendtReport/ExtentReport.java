package lskitImpl.extendtReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReport {

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

    //Variables - para definir el Objeto y la configuración del Reporte Extent -Report-HTML
    public static ExtentReports extent;
    public static ExtentTest test;

    //Metodo - Crea un Objeto de tipo htmlReporter para generar un reporte de Resultados en un archivo de tipo Ext.HTML
    public ExtentHtmlReporter initReport() {

        String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
        String path = "C:\\Users\\Usuario\\Documents\\PY-POM Selenium\\Reingenieria\\MultivaTestAutomation\\Reports\\";
        String name = "extentReport_";
        String ext = ".html";

        // initialize the HtmlReporter
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path + name + timestamp + ext);
        // initialize ExtentXReporter (deprecated)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("Prueba Report Login", "Extent Report");

        return htmlReporter;
    }
    public ExtentReport(){
    }
}


