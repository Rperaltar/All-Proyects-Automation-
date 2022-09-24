package ScreenShot;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ashot {

    //Metodo que ayuda a generar archivos de tipo (png)
    public FileOutputStream ScreenshotFile(AndroidDriver driver, File screenshot) throws IOException {
        FileOutputStream screenshotStream = new FileOutputStream(screenshot);
                screenshotStream.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
                screenshotStream.close();
            return screenshotStream;

    }
    public Ashot(){
        return;
    }
}


