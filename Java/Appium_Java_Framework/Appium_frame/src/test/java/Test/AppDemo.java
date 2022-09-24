package Test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

public class AppDemo {

        private AndroidDriver driver;

        @BeforeMethod(alwaysRun=true)
        public void setUp() throws Exception {
            // set up appium
            File classpathRoot = new File(System.getProperty("user.dir"));
            File appDir = new File(classpathRoot, "apps");
            File app = new File(appDir, "notepad.apk");
            System.out.println(app.isFile() + "==" + app.exists());
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName","Android Emulator");
            capabilities.setCapability("platformVersion", "23");
            capabilities.setCapability("app", app.getAbsolutePath());
            capabilities.setCapability("appPackage", "com.example.android.notepad");
            capabilities.setCapability("appActivity", "com.example.android.notepad.NotesList");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }


        @Test(groups={"noteTest"})
        public void noteTest1(){

            //Click on the "Add Note" menu entry
            WebElement el = driver.findElement(By.name("Add note"));
            el.click();

            //Enter the note info and save it
            WebElement text = driver.findElementByClassName("android.widget.EditText");
            text.sendKeys("Hello World");

            el = driver.findElement(By.name("Save"));
            el.click();
        }

         @AfterMethod(alwaysRun=true)
         public void tearDown() throws Exception {
            driver.quit();
    }

}
