package screenShots;

import Base.Constantes;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CaptureScreen extends Constantes {

    /*
    ##########################################
    #                                        #
    #  Clase - CaptureScreen                 #
    #  Realiza La Ejecución y generación de  #
    #  Imagenes en formato .png              #
    #                                        #
    ##########################################
    */


    static WebDriver driver;

    //Crea un Objeto - Para generar imagenes con formato tipo "File.png"
    public File getScreenShot(String path) throws IOException {

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(path + NAME_ASHOT + EXT_ASHOT));
        return  file;
 }

    public CaptureScreen(){
        return;
    }
}