package coreJava.POO;

public class Concepts {

    /*
    ¿Qué es un Objeto en Java?

    En la programación orientada a objetos (POO), un objeto es una instancia de una clase.
    Un objeto puede ser considerado como una cosa, que realiza un conjunto de actividades.
    Un objeto puede ser cualquier cosa y, en el mundo real, un objeto puede ser un perro, una mesa, una ventana, un automóvil, etc.

    Pero los objetos siempre comparten dos características, todos tienen estado y todos tienen comportamientos.
    Por ejemplo, un automóvil tiene estado (marca, marca, color, modelo) y tiene comportamiento (frenar, acelerar, desacelerar, cambiar de marcha).
    De la misma manera, un objeto en cualquier lenguaje de programación también tiene estado y comportamiento.
    Un objeto de software mantiene su estado en variables e implementa su comportamiento con métodos.
    Entonces, del ejemplo anterior del objeto automóvil, podemos decir que el objeto es una colección de métodos
    (comportamiento: frenado, aceleración, desaceleración, cambio de marchas) y variables (estado: marca, marca, color, modelo).

    ¿Qué es Clase en Java?
    Las clases son las plantillas para la creación de objetos. Cuando decimos una plantilla, significa que siempre tiene la misma estructura e implementación.
    Establecen reglas sobre cómo pueden comportarse los objetos que contienen.
    Entonces, todos los objetos creados a partir de una sola clase comparten el mismo comportamiento y estado.
    La diferencia entre una clase y un objeto es que las clases se crean cuando se crea el programa, pero los objetos se crean en tiempo de ejecución.
    Por ejemplo, si creamos una clase 'Auto' y creamos un objeto 'Toyota' a partir de esa clase de auto,
    entonces podemos decir que el objeto Toyota car es una instancia de la clase de objetos conocida como Car.
    Los automóviles Toyota tienen algunos estados y comportamientos. No obstante, cada marca de coche tendrá su propio estado y comportamientos.

    ¿Cómo crear una Clase en Java?
    Una clase puede tener solo una variable o un grupo de variables.
    Para crear una clase, comienza con la palabra clave class seguida de un nombre y su cuerpo delimitado por corchetes.


    //Clase
       class car{
    }

    //Object
        //Use the Car keyword to declare Car Class variable
		Car Toyota;
		//Initialize the Toyota variable with a new Car object
		Toyota = new Car();

	//Fields
        //Class Member Variables & Fields
        String sModel;
        int iGear;
        int iHighestSpeed;
        String sColor;
        int iMake;
        boolean bLeftHandDrive;
        String sTransmission;
        int iTyres;
        int iDoors;

    //Object Method
        //Use the Car keyword to declare Car Class variable
        Car Toyota = new Car();;

        Toyota.bLeftHandDrive = true;
        Toyota.iDoors = 4;
        Toyota.iGear = 5;
        Toyota.iHighestSpeed = 200;
        Toyota.iMake = 2014;
        Toyota.iTyres = 4;
        Toyota.sColor = "Black";
        Toyota.sTransmission = "Manual";
        Toyota.sModel = "Camry";
     */

}
