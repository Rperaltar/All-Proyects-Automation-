package PageLocators.PageModelMethods;

import Core.Constant;
import GetDriver.Rdriver;
import PageLocators.PageLocatorLogin.LoginPage;
import ScreenShot.Ashot;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.net.MalformedURLException;

public class PageModelLogin {

    static AndroidDriver driver;
    Rdriver rdriver;


    public Logger logger() throws MalformedURLException {
            Logger Log = Logger.getLogger(PageModelLogin.class.getClass());
       return Log;
    }
    public void setUpRdriver() throws MalformedURLException {
            //Capabilities Inicializa el Driver
            driver = rdriver.Android("","","","");
      return;
    }
    public LoginPage LoginUser(){
            //Objects
            LoginPage login = new LoginPage(driver);
            login.sendKey(login.getUSER(), Constant.USER_INPUT);
            login.sendKey(login.getPASSWD(),Constant.PASSWD_INPUT);
            login.click(login.getBTNLOGIN());
      return login;
    }
    public void printTResult(){
            System.out.println("");
    }
    public void AssertResult(){
            Assert.assertEquals("","");
            //log.info("")
    }
    public void closeTest(){
            driver.close();
    }
public PageModelLogin(AndroidDriver driver){
        PageModelLogin.driver = driver;
        PageFactory.initElements(driver,this);
    return;
  }
}
