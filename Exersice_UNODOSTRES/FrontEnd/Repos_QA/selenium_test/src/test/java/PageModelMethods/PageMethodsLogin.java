package PageModelMethods;


import ActionsImplement.SeleniumImplements.ModelAssertImpl;
import ActionsImplement.SeleniumImplements.ModelWaitsImpl;
import ActionsImplement.SeleniumInterfaces.ModelAssertInterface;
import ActionsImplement.SeleniumInterfaces.ModelWaitsInterface;
import Base.Constant;
import Base.Constantes;
import PageModel.PageLocatorsLogin;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screenShots.Ashot;
import screenShots.GetScreenShot;
import webDriver.Rdriver;

import java.awt.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class PageMethodsLogin extends Constant{

    public static WebDriver driver;
    public static ModelWaitsInterface waits = new ModelWaitsImpl();
    public static ModelAssertInterface Assert = new ModelAssertImpl();
    private static Logger log = LogManager.getLogger(PageMethodsLogin.class.getName());

    public PageLocatorsLogin LoginUser(String user , String pwd) throws AWTException, IOException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        PageLocatorsLogin login = new PageLocatorsLogin(driver);
            waits.timeOutImplicitWaitSegOne(driver);
            login.moveTo(login.SINGIN,driver);
            login.click(login.SINGIN);
            login.sendKeys(login.USERNAME,user);
            login.clear(login.PASSWD);
            login.sendKeys(login.PASSWD, pwd);
            login.click(login.LOGIN);
            Ashot.initScreenShot(PATH_ASHOOT);
            log.info(INICIA_SESION);
        return login;
    }
    public PageLocatorsLogin AssertLoginUser()  {
        PageLocatorsLogin login = new PageLocatorsLogin(driver);
            Assert.assertEquals(login.NAME_SESSION.getText().contains(Constant.SESION_INTO),true);
            System.out.println(login.NAME_SESSION.getText());
            log.info(INICIA_VERIFICACION_OK);
        return login;
    }
    public void CloseTest(){
        PageLocatorsLogin login = new PageLocatorsLogin(driver);
            log.info(CIERRA_SESION);
            System.out.println(MS_CLOSE_TEST  + new Object(){}.getClass().getName());
            login.close(driver);
        return;
    }
    public PageMethodsLogin(WebDriver driver){
            PageMethodsLogin.driver = driver;
            PageFactory.initElements(driver,this);
    }
}

