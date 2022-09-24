package POOJava.POO_Encapsulation;

//Clase
public class MethodsObject {

    //Constructor
    public MethodsObject(){
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


    //Encapsulamiento
    String Name = "";

    //getters
    public String getName() {
        return Name;
    }
    //setters
    public void setName(String name) {
        Name = name;
    }


}
