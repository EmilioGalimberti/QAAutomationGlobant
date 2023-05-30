package ejerciciosBucles;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite = leer.nextInt();
        int acum = 0;
        while (limite>acum){
            int suma = leer.nextInt();
            acum += suma;
        }
    }
}
