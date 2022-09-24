package GetDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Rdriver {

    public static AndroidDriver<MobileElement> driver;
    public static URL url;
    public static DesiredCapabilities capabilities;

    public AndroidDriver<MobileElement> Android(
        String AndroidPlataformName, String AndroidPlataformVersion, String AndroidActivity,String AndroidAppPackage) throws  MalformedURLException {
            final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
                    url = new URL(URL_STRING);
                    capabilities = new DesiredCapabilities();
                    final String dir = System.getProperty("user.dir");
                        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, AndroidPlataformName);
                        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,AndroidPlataformVersion);
                        capabilities.setCapability(MobileCapabilityType.APP,AndroidAppPackage);
                        capabilities.setCapability(MobileCapabilityType.APP,AndroidActivity);
                        driver = new AndroidDriver<MobileElement>(url, capabilities);
                        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            return driver;
    }
    //Ejemplo de como implementar el Rdriver desde la clase Test
    /*
    private static final String ANDROID_DEVICE_NAME = "Android Emulator";
	private static final String MATERIAL_LOGIN_APK = "/MaterialLoginExample.apk";
	private static final String APPIUM_AUTOMATION_NAME = "Appium";
	private static final String NEW_COMMAND_TIMEOUT = "60";

	@BeforeSuite
	public void setupDriver() throws MalformedURLException {
		driver = Android(ANDROID_DEVICE_NAME, MATERIAL_LOGIN_APK, APPIUM_AUTOMATION_NAME, NEW_COMMAND_TIMEOUT);
	}
     */
}
