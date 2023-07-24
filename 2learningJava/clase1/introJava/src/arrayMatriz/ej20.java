package arrayMatriz;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = 0;
        int columnas = 1;

        while (filas != columnas) {
            System.out.print("Filas: ");
            filas = scanner.nextInt();
            System.out.print("Columnas: ");
            columnas = scanner.nextInt();
        }

        int[][] matriz = new int[filas][columnas];

        rellenarMatriz(matriz, filas, columnas);

        mostrarMatriz(matriz, filas, columnas);

        int valorMaximo = 0;

        // suma de la primera fila
        for (int j = 0; j < columnas; j++) {
            valorMaximo += matriz[0][j];
        }

        System.out.println("Todas las sumas deben ser iguales a " + valorMaximo);

        boolean sumaIncorrecta = true;

        // Filas
        for (int x = 1; x < filas; x++) {
            int result = sumarFila(matriz, columnas, x);
            System.out.println("La suma de la fila " + x + " es de " + result);
            if (valorMaximo != result) {
                sumaIncorrecta = false;
            }
        }

        System.out.println("La suma de todas las filas fue igual? " + sumaIncorrecta);

        // Columnas
        for (int x = 0; x < columnas; x++) {
            int result = sumarColumna(matriz, filas, x);
            System.out.println("La suma de la columna " + x + " es de " + result);
            if (valorMaximo != result) {
                sumaIncorrecta = false;
            }
        }

        System.out.println("La suma de todas las columnas fue igual? " + sumaIncorrecta);

        // Sumar diagonal principal
        int result = sumarDiagonalPrincipal(matriz, filas, columnas);
        if (valorMaximo != result) {
            sumaIncorrecta = false;
        }
        System.out.println("La suma de la diagonal principal es igual al resto? " + sumaIncorrecta);

        // Sumar diagonal secundaria
        result = sumarDiagonalSecundaria(matriz, filas, columnas);
        if (valorMaximo != result) {
            sumaIncorrecta = false;
        }
        System.out.println("La suma de la diagonal secundaria es igual al resto? " + sumaIncorrecta);

        scanner.close();
    }

    public static int sumarFila(int[][] matriz, int columnas, int filaASumar) {
        int resultado = 0;
        for (int j = 0; j < columnas; j++) {
            resultado += matriz[filaASumar][j];
        }
        return resultado;
    }

    public static int sumarColumna(int[][] matriz, int filas, int columnaASumar) {
        int resultado = 0;
        for (int i = 0; i < filas; i++) {
            resultado += matriz[i][columnaASumar];
        }
        return resultado;
    }

    public static int sumarDiagonalPrincipal(int[][] matriz, int filas, int columnas) {
        int resultado = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j) {
                    resultado += matriz[i][j];
                }
            }
        }
        return resultado;
    }

    public static int sumarDiagonalSecundaria(int[][] matriz, int filas, int columnas) {
        int resultado = 0;
        for (int i = 0; i < filas; i++) {
            resultado += matriz[i][columnas - 1 - i];
        }
        return resultado;
    }

    public static void rellenarMatriz(int[][] matriz, int filas, int columnas) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese un valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public static void mostrarMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            System.out.print("[");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}