package screenShots;



import Base.Constantes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ashot extends Constantes {

    /*
    ##########################################
    #                                        #
    #  Clase - Ashot                         #
    #  Realiza La Ejecución y generación de  #
    #  Imagenes en formato .png              #
    #                                        #
    ##########################################
    */

    //Crea un Objeto - Para generar imagenes con formato tipo "File.png"
    public static void initScreenShot(String path) throws IOException, AWTException {

        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, ".jpg", new File(path + NAME_ASHOT + TIME_STAMP + EXT_ASHOT));
    }
    public Ashot(){
        return;
    }
}
