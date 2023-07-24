package ejerciciosBucles;

import java.util.Scanner;

public class ej13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del cuadrado: ");
        int tamano = scanner.nextInt();

        dibujarCuadrado(tamano);
    }

    public static void dibujarCuadrado(int tamano) {
        for (int i = 0; i < tamano; i++) { // Iterar sobre las filas
            for (int j = 0; j < tamano; j++) { // Iterar sobre las columnas
                if (i == 0 || i == tamano - 1 || j == 0 || j == tamano - 1) {
                    // Si la posición actual está en uno de los bordes
                    System.out.print("* ");
                } else {
                    // Si la posición actual no está en uno de los bordes
                    System.out.print("  "); //imprime dos espacios blancos
                }
            }
            System.out.println();
        }
    }
}