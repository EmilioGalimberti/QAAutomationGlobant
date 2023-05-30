package ejerciciosCondicionales;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = leer.next();
        if (frase.equals("eureka")){
            System.out.println("correcto");
        } else {System.out.println("incorrecto");}
    }
}
