package POOJava.POO_Abstraction;

//Clase MethodsObject y hereda las propiedades y metodos de la clase Properties Object
public class MethodsObject extends PropertiesObject{

    //Constructor
    public MethodsObject(){
    }

    //Encapsulamiento
    String Name;

    //getters
    public String getName() {
        return Name;
    }
    //setters
    public void setName(String name) {
        Name = name;
    }

    //Metodo contiene datos entrada nombre de la persona
    public String nombre(){
           String name = "Nombre: Roberto";
        return name;
    }
    //Metodo contiene datos entrada pais de la persona
    public String pais(String pais){
            String Pais = "Pais:";
            String from = Pais + pais;
        return from;
    }

}
