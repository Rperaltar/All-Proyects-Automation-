package SeleniumWebDriver.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Model extends Constantes{

    public static WebDriver driver;

    @FindBy(how = How.ID,id = "input-email")
    WebElement User;
    @FindBy(how = How.ID,id = "input-password")
    WebElement Passwd;
    @FindBy(how = How.CSS,css = "#content > div > div:nth-child(2) > div > form > input")
    public WebElement InicioSesion;
    @FindBy(how = How.XPATH,xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
    private WebElement MY_ACOUNT;
    @FindBy(how = How.CSS,css = "#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a")
    private WebElement LOGIN;
    @FindBy(how = How.CSS,css = "#content > h2:nth-child(3)")
    private WebElement ASSERT_TEXT;

    public WebElement getUser() {
        return User;
    }
    public WebElement getPasswd() {
        return Passwd;
    }

    public WebElement getInicioSesion() {
        return InicioSesion;
    }

    public WebElement getMY_ACOUNT() {
        return MY_ACOUNT;
    }

    public WebElement getLOGIN() {
        return LOGIN;
    }

    public WebElement getASSERT_TEXT() {
        return ASSERT_TEXT;
    }

    public void InicioSesion(String user, String pwd) throws InterruptedException {
        Model object = new Model();
        Click(object.MY_ACOUNT);
        Click(object.LOGIN);
        Thread.sleep(5);
        object.User.sendKeys(USER);
        object.Passwd.sendKeys(PASSWORD);
        Thread.sleep(5);
        Click(object.InicioSesion);
    }
    public void AssertSesion(){
        Assert.assertEquals("","");
    }
    public void CloseTest(){
        driver.close();
 }
    public void Click(WebElement element){
        element.click();
    }

}
