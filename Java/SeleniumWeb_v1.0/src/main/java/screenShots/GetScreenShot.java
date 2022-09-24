package screenShots;

//import org.apache.commons.io.FileUtils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class GetScreenShot {

    /*
    ##########################################
    #                                        #
    #  Clase - CaptureScreen                 #
    #  Realiza La Ejecución y generación de  #
    #  Imagenes en formato .png              #
    #                                        #
    ##########################################
    */

    //Crea un Objeto - Para generar imagenes con formato tipo "File.png"
    public static String capture(WebDriver driver, String screenShotName) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") + "ErrorScreenshots" + screenShotName + ".png ";
        File destination = new File(dest);
        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dest;
    }
    public GetScreenShot(){
        return;
    }
}

