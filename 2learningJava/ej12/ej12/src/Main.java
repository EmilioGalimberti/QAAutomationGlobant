import Entity.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.crearPersona();
        persona.mostrarPersona();

        System.out.println("Ingrese una edad para comparar: ");
        Scanner scanner = new Scanner(System.in);
        int edadComparar = scanner.nextInt();

        boolean esMenor = persona.menorQue(edadComparar);
        if (esMenor) {
            System.out.println("La persona es menor que " + edadComparar + " años.");
        } else {
            System.out.println("La persona no es menor que " + edadComparar + " años.");
        }
    }
}