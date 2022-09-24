package Framework.ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners extends TestListenerAdapter

	/*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - Listeners                     #
    #  Nos apoya a controlar la generación   #
    #  un reporte Final con distintas        #
    #  Caracteristicas.                      #
    #                                        #
    ##########################################
    */
{
	//Variables publicas para generar los objetos del Reporte
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	//Metodo Que crea un Objeto de tipo htmlReporter
	public void onStart(ITestContext testContext)
	{
		//Localización o Path del Reporte a generar con algunas caracteristicas
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/Reports/foxReport.html");

		//Propiedades del Objeto htmlReporter
		htmlReporter.config().setDocumentTitle("Automation Report"); // Tile of report
		htmlReporter.config().setReportName("Rest API Testing Report"); // name of the report
		htmlReporter.config().setTheme(Theme.STANDARD);

		//Metodo Que crea un Objeto de tipo ExtentReports con algunas caracteristicas para el reporte final
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Project Name","FOX Database API");
		extent.setSystemInfo("Host name","localhost");
		extent.setSystemInfo("Environemnt","QA");
		extent.setSystemInfo("user","hemant");
			
	}
	//Metodo que crea un Objeto de Tipo Result Exitoso
	public void onTestSuccess(ITestResult result)
	{

		test=extent.createTest(result.getName()); // create new entry in the report
				
		test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
	}
	//Metodo que crea un Objeto de Tipo Result Fallido
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName()); // create new entry in the report
		
		test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
		test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent report
	
	}
	//Metodo que crea un Objeto de Tipo Result SKIP
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName()); // create new entry in the report
		test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
	}
	//Metodo que crea un Objeto de Contexto de Resultado y muestra un resultado Final en el Reporte ExtentHtmlReporter
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}
	
	}
