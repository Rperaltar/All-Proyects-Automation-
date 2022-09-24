package POOJava.POO_Polimorphism;

import POOJava.POO_Interface.Bunsan;
import POOJava.POO_Interface.QABecarios;

public class Example {

    public static void main(String[] args) {

        //Instancias de Clases
        SistemaOperativo sistemaOperativo = new SistemaOperativo();
        SistemaOperativo pcDesktop = new PCDesktop();
        SistemaOperativo pcLaptop = new PCLaptop();

        //Ejemplo 1
        sistemaOperativo.Compatible();
        sistemaOperativo.soLinux();
        sistemaOperativo.soWindows();
        sistemaOperativo.soMac();
        //Ejemplo 2
        sistemaOperativo.Compatible();
        pcDesktop.soLinux();
        pcDesktop.soWindows();
        pcDesktop.soMac();
        //Ejemplo 3
        sistemaOperativo.Compatible();
        pcLaptop.soLinux();
        pcLaptop.soWindows();
        pcLaptop.soMac();
    }
}
