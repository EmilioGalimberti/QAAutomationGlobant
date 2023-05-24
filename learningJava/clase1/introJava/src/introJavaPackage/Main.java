package introJavaPackage;
import java.util.Scanner;

//Tema helloWorld

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//Class
public class Main {
    //method
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        //System.out.printf("Hello and welcome!");

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
       //for (int i = 1; i <= 5; i++) {
            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
       //     System.out.println("i = " + i);
       // }

        //se crea una variable Scanner que se utiliza para ller datos del usuario
        Scanner leer = new Scanner(System.in);
        //creo un variable tipo String
        String nombre;
        //Muestra mensaje por pantalla (diferencias entre printf, print y println;)
        //println es print + salto de linea
        System.out.println("Ingrese su nombre");
        //Leemos el nobmre de la persona pasado por variable
        nombre = leer.next();
        //Mostramos pro consola
        System.out.println("Hola Mundo! Soy " + nombre+" y esto programando en Java");
    }
}