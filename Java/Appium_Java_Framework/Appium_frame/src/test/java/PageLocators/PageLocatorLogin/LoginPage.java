package PageLocators.PageLocatorLogin;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public class LoginPage{

    private AndroidDriver driver;

    //Locators
    @AndroidFindBy(id = "")
    private AndroidElement USER;
    @AndroidFindBy(id = "")
    private AndroidElement PASSWD;
    @AndroidFindBy(id = "")
    private AndroidElement BTNLOGIN;

    //Constructor
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Getters
    public AndroidElement getUSER() {
        return USER;
    }

    public AndroidElement getPASSWD() {
        return PASSWD;
    }

    public AndroidElement getBTNLOGIN() {
        return BTNLOGIN;
    }

    //Methods Generics
    public void click(AndroidElement element){
        element.click();
        return;
    }

    public void sendKey(AndroidElement element, String key){
        element.sendKeys(key);
        return;
    }

    public LoginPage(){
    }
}
