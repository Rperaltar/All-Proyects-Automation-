package PageModel;

import ActionsImplement.SeleniumImplements.ModelActionsImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageLocatorsLogin extends ModelActionsImpl {

    public static WebDriver driver;

    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.LINK_TEXT, linkText = "Sign In")
    public WebElement SINGIN;
    @FindBy(how = How.NAME, name = "username")
    public WebElement USERNAME;
    @FindBy(how = How.NAME, name = "password")
    public WebElement PASSWD;
    @FindBy(how = How.NAME, name = "signon")
    public WebElement LOGIN;

    //Assert
    @FindBy(how = How.LINK_TEXT, linkText = "Sign Out")
    public WebElement NAME_SESSION;

    //Constructor
    public PageLocatorsLogin(WebDriver driver) {
        PageLocatorsLogin.driver = driver;
        PageFactory.initElements(driver, this);
    }
}



