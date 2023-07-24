package arrayMatriz;
import java.util.Scanner;

public class CuadradoMagico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] cuadrado = new int[3][3];

        System.out.println("Ingrese los números del cuadrado mágico (del 1 al 9):");

        // Leer los números del cuadrado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el número para la posición [" + i + "][" + j + "]: ");
                int numero = scanner.nextInt();

                // Verificar que el número esté en el rango válido (1 al 9)
                if (numero < 1 || numero > 9) {
                    System.out.println("Número inválido. Debe estar entre 1 y 9.");
                    return; // Terminar el programa si se ingresa un número inválido
                }

                cuadrado[i][j] = numero;
            }
        }

        // Calcular la suma de la primera fila (para comparar con las demás sumas)
        int sumaFila = 0;
        for (int j = 0; j < 3; j++) {
            sumaFila += cuadrado[0][j];
        }

        boolean esCuadradoMagico = true;

        // Verificar las filas
        for (int i = 0; i < 3; i++) {
            int sumaActual = 0;
            for (int j = 0; j < 3; j++) {
                sumaActual += cuadrado[i][j];
            }
            if (sumaActual != sumaFila) {
                esCuadradoMagico = false;
                break;
            }
        }

        // Verificar las columnas
        if (esCuadradoMagico) {
            for (int j = 0; j < 3; j++) {
                int sumaActual = 0;
                for (int i = 0; i < 3; i++) {
                    sumaActual += cuadrado[i][j];
                }
                if (sumaActual != sumaFila) {
                    esCuadradoMagico = false;
                    break;
                }
            }
        }

        // Verificar la diagonal principal
        if (esCuadradoMagico) {
            int sumaDiagonalPrincipal = 0;
            for (int i = 0; i < 3; i++) {
                sumaDiagonalPrincipal += cuadrado[i][i];
            }
            if (sumaDiagonalPrincipal != sumaFila) {
                esCuadradoMagico = false;
            }
        }

        // Verificar la diagonal secundaria
        if (esCuadradoMagico) {
            int sumaDiagonalSecundaria = 0;
            for (int i = 0; i < 3; i++) {
                sumaDiagonalSecundaria += cuadrado[i][2 - i];
            }
            if (sumaDiagonalSecundaria != sumaFila) {
                esCuadradoMagico = false;
            }
        }

        // Mostrar el resultado
        if (esCuadradoMagico) {
            System.out.println("El cuadrado ingresado es un cuadrado mágico.");
        } else {
            System.out.println("El cuadrado ingresado no es un cuadrado mágico.");
        }



        scanner.close();
    }
}