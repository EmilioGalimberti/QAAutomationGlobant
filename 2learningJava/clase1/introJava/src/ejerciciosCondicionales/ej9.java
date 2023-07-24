package ejerciciosCondicionales;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        if (frase.charAt(0) == 'A'){ //(frase.substring(0, 1).equals("A"))
            System.out.println("correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
}
