package Test;

import Core.Constant;
import GetDriver.Rdriver;
import PageLocators.PageLocatorLogin.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;


import java.awt.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TestLoginExtent {

    AndroidDriver driver;
    Rdriver rdriver;

    private String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
    private String path = "C:\\Users\\Consultor\\Documents\\Py_Selenium\\cocktailCoppelPyme_TestNG\\src\\Reports\\htmlReport\\";
    private String name = "extentReport_";
    private String ext = ".html";

    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;

    private static Logger log = LogManager.getLogger(TestLoginExtent.class.getName());


    @AfterTest
    public void closeExtent(){
        extent.flush();
    }

    @AfterTest
    public void close(){
        driver.quit();
    }

    @BeforeTest
    public void setUpEach() throws IOException, AWTException, IOException, AWTException {

        htmlReporter = new ExtentHtmlReporter(path + name + timestamp + ext);

        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("W2A Automation Reports");
        htmlReporter.config().setReportName("Automation Test Results");
        htmlReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("Automation Tester", "Roberto Carlos");
        extent.setSystemInfo("Orgainzation", "Cocktail");
        extent.setSystemInfo("Build No", "W2A-1234");

        driver = rdriver.Android("","","","");

    }

    @Test
    public void testLogin(){

        //Objects
        LoginPage login = new LoginPage(driver);
        login.sendKey(login.getUSER(), Constant.USER_INPUT);
        login.sendKey(login.getPASSWD(),Constant.PASSWD_INPUT);
        login.click(login.getBTNLOGIN());

        Assert.assertEquals("","");
        //log.info("")

        System.out.println("");

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {

            String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());
            test.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
                    + "</font>" + "</b >" + "</summary>" + excepionMessage.replaceAll(",", "<br>") + "</details>"
                    + " \n");

            String failureLogg = "TEST CASE FAILED";
            Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
            test.log(Status.FAIL, m);

        } else if (result.getStatus() == ITestResult.SKIP) {

            String methodName = result.getMethod().getMethodName();

            String logText = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + "  SKIPPED" + "</b>";

            Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
            test.skip(m);

        } else if (result.getStatus() == ITestResult.SUCCESS) {

            String methodName = result.getMethod().getMethodName();

            String logText = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + "  PASSED" + "</b>";

            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            test.pass(m);

        }
    }
}
