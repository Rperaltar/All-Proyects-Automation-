package screenShots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class AshotError {
    /*
    ##########################################
    #                                        #
    #  Clase - AshotError                    #
    #  Realiza La Ejecución y generación de  #
    #  Imagenes en formato .png              #
    #  cuando sale un error/passed/skiped    #
    ##########################################
    */

    //Crea un Objeto - Para generar imagenes con formato tipo "File.png"

    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult, WebDriver driver) throws IOException {
        if (testResult.getStatus() == ITestResult.SUCCESS) {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-"
                    + Arrays.toString(testResult.getParameters()) +  ".jpg"));
        }
        else{
            if (testResult.getStatus() == ITestResult.FAILURE) {
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-"
                        + Arrays.toString(testResult.getParameters()) +  ".png"));
        }
            else{
                if (testResult.getStatus() == ITestResult.SKIP) {
                    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-"
                            + Arrays.toString(testResult.getParameters()) +  ".gif"));
                }
            }
        }
    }
}
