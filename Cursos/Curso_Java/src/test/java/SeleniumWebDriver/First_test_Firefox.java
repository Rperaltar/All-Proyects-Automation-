package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class First_test_Firefox {

    public static void main(String[] args) throws InterruptedException {


        //Setting the driver path
        System.setProperty("webdriver.gecko.driver", "/Users/roberto/Documents/Tools_Automation/Java/JAVA_AUTO_SELENIUM/SeleniumWeb/src/main/java/drivers/geckodriver");

        //Creating WebDriver instance
        WebDriver driver = new FirefoxDriver();

        //Navigate to web page
        driver.get("https://134.209.69.242/b2bc-api/api/admin/login/?next=/b2bc-api/api/admin/");

        //Maximizing window
        driver.manage().window().maximize();

        //Retrieving web page title
        String title = driver.getTitle();
        System.out.println("The page title is : " + title);

        //Locating web element
        WebElement uName = driver.findElement(By.id("id_username"));
        WebElement pswd = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.cssSelector(".submit-row > input:nth-child(1)"));


        //Peforming actions on web elements
        Thread.sleep(6);
        uName.sendKeys("test");
        pswd.sendKeys("DAxE6J2A5cdhGZY");
        Thread.sleep(5);
        loginBtn.click();
        Thread.sleep(5);

        //Putting implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {

            //Locating web element
            WebElement messageLogin = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/p"));
            //Validating presence of element
            if(messageLogin.getText() ==
                    "Please enter the correct Username and password " +
                            "for a staff account. " +
                            "Note that both fields may be case-sensitive. "){

                //Performing action on web element
                System.out.println(messageLogin.getText());
            }
        }
        catch (Exception e) {
            System.out.println("Incorrect login....");
        }

        //Closing browser session
       // driver.quit();

    }


  }

