package TestMethods.Firefox;


import ActionsImplement.SeleniumImplements.ModelActionsImpl;
import ActionsImplement.SeleniumInterfaces.ModelActionsInterface;
import Base.Constant;
import Base.Constantes;
import PageModelMethods.PageMethodsLogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screenShots.Ashot;
import webDriver.Rdriver;


import java.awt.*;
import java.io.IOException;

public class TestMethodsLoginUser {

    public static WebDriver driver;
    public static ModelActionsInterface actions = new ModelActionsImpl();

    @BeforeTest
    public void setUpEach() {
        driver = Rdriver.CreateFireFox(Constantes.DRIVER_PATH, false);
        actions.getUrl(Constant.SITE_WEB, driver);
        actions.maximize(driver);
    }
    @Test
    public void Test() throws IOException, AWTException {
        PageMethodsLogin login = new PageMethodsLogin(driver);
            login.LoginUser(login.USER,login.PASSWORD);
            login.AssertLoginUser();
    }
    @AfterTest
    public void closeBrowser() {
        PageMethodsLogin login = new PageMethodsLogin(driver);
            login.CloseTest();
    }
}