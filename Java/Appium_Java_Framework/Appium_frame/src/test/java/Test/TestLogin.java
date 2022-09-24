package Test;

import GetDriver.Rdriver;
import PageLocators.PageLocatorLogin.LoginPage;
import Core.Constant;
import PageLocators.PageModelMethods.PageModelLogin;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.net.MalformedURLException;

public class TestLogin {

    static AndroidDriver driver;
    Rdriver rdriver;

    private static Logger Log = Logger.getLogger(TestLogin.class.getClass());

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Capabilities Inicializa el Driver
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
            System.out.println("");
    }
    @Test
    public void testLoginUser()
    {
        //Objects
        PageModelLogin login = new PageModelLogin(driver);
            login.LoginUser();
            login.AssertResult();
            login.printTResult();
    }
    @AfterClass
    public void closeUp()
    {
        //Objects
        PageModelLogin login = new PageModelLogin(driver);
            login.closeTest();
    }
}
