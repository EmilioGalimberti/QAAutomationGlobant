package introJavaPackage;

import java.util.Scanner;

//Class

//ctrl  + space ultimas cosas utilizadas
//sout + tab autocompleta el System.sout
public class EjemploMetodos {
    //Metodo main, es el primero que se ejecutara al ejecutar la aplicacion
    public static void main(String[] args){
        System.out.println(suma(1,2));
        Scanner leer = new Scanner(System.in);
        saludoPersonalizado(leer.next());

    }

    //static hace que no tenga necesidad de ser instanciado por un objeto, es decir se encunetra estatica en la memoria
    public static int suma(int a, int b){
        //int resultado = a+b;
        //return resultado;
        return a+b;
    }

    public static void saludoPersonalizado(String nombre){
        System.out.println("Hola "+nombre);
    }
}
