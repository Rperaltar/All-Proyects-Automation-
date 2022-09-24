package POOJava.POO_Abstraction;

public class Example extends Constants{

    public static void main(String[] args) throws InterruptedException {
        //Ejemplo
        /*Inastancia la Clase Object y crea un objeto llamado "persona" a partir de la
          clase "propertiesObject y la clase Object"
        */
        MethodsObject persona = new MethodsObject();
        //persona del objeto creado
                persona.setName(ROBERTO);
                persona.pais(MEXICO);
                persona.cabello = "Cabello: negro";
                persona.colorPiel = "Piel: morena";
                persona.edad = 30;
                persona.estatura = 1.61;
                persona.s = 'H';
                persona.hombre = true;


        if(persona.estatura > 1.70){
            System.out.println("Si es la estatura correcta de: Roberto");
        }
        else if (persona.hombre != false){
            System.out.println("Es la persona correcta: Roberto");
        }
        else {
            System.out.println("No es la persona correcta");
        }
        if (persona.edad <= 30){
            System.out.println("No es la edad correcta: Roberto");
        }
        else if(persona.ojos.contains("cafes")){
            System.out.println("Si son los ojos de: Roberto");
        }

        //Impresion en consola del resultado de cada valor del objeto persona
        System.out.println(persona.nombre());
        System.out.println(persona.pais("USA"));
        System.out.println(persona.ojos);
        System.out.println(persona.cabello);
        System.out.println(persona.colorPiel);
        System.out.println(persona.edad);
        System.out.println(persona.estatura);
        System.out.println(persona.s);
        System.out.println(persona.hombre);

        }
}
