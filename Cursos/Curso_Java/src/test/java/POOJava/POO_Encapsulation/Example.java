package POOJava.POO_Encapsulation;

public class Example {

    public static void main(String[] args) throws InterruptedException {
        //Ejemplo
        //Instancias de clases para heredar los metodo y caraterostocas de estas mismas
        PropertiesObject carateristicas = new PropertiesObject();

        /*Inastancia la Clase Object y crea un objeto llamado "persona" a partir de la
          clase "propertiesObject y la clase Object"
        */
        MethodsObject persona = new MethodsObject();
        //Carateristicas del objeto creado
                persona.setName("");
                persona.pais("USA");
                carateristicas.cabello = "Cabello: negro";
                carateristicas.colorPiel = "Piel: morena";
                carateristicas.edad = 30;
                carateristicas.estatura = 1.61;
                carateristicas.s = 'H';
                carateristicas.hombre = true;


        if(carateristicas.estatura > 1.70){
            System.out.println("Si es la estatura correcta de: Roberto");
        }
        else if (carateristicas.hombre != false){
            System.out.println("Es la persona correcta: Roberto");
        }
        else {
            System.out.println("No es la persona correcta");
        }
        if (carateristicas.edad <= 30){
            System.out.println("No es la edad correcta: Roberto");
        }
        else if(carateristicas.ojos.contains("cafes")){
            System.out.println("Si son los ojos de: Roberto");
        }

        //Impresion en consola del resultado de cada valor del objeto persona
        System.out.println(persona.nombre());
        System.out.println(persona.pais("USA"));
        System.out.println(carateristicas.ojos);
        System.out.println(carateristicas.cabello);
        System.out.println(carateristicas.colorPiel);
        System.out.println(carateristicas.edad);
        System.out.println(carateristicas.estatura);
        System.out.println(carateristicas.s);
        System.out.println(carateristicas.hombre);

        }
}
