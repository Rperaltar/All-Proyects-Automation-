package SeleniumWebDriver.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static SeleniumWebDriver.POM.Constantes.PASSWORD;
import static SeleniumWebDriver.POM.Constantes.USER;

public class Test {

    public WebDriver driver;

    @BeforeTest
    public void SetUp(){
        //Setting the driver path
        System.setProperty
                ("webdriver.chrome.driver","C:\\Users\\HP-PAV\\Documents\\Rober\\PANZURA_proyect\\Automatización\\Frameworks\\SeleniumWeb_v1.0\\src\\main\\java\\drivers\\chromedriver.exe");
        //Creating WebDriver instance
        WebDriver driver = new ChromeDriver();
        //Navigate to web page
        driver.get("http://opencart.abstracta.us/index.php?route=common/home");
        //Maximizing window
        driver.manage().window().maximize();
    }
    @org.testng.annotations.Test
    public void Test() throws InterruptedException {
        Model object = new Model();
        Thread.sleep(10);
        object.Click(object.getMY_ACOUNT());
        Thread.sleep(10);
        object.Click(object.getLOGIN());
        Thread.sleep(10);
        object.User.sendKeys(USER);
        object.Passwd.sendKeys(PASSWORD);
        Thread.sleep(10);
        object.Click(object.InicioSesion);

        Assert.assertEquals("Sesion Iniciada",true);
    }
    @AfterTest
    public void CloseUp(){
    driver.close();
    }
}
