package arrayMatriz;

public class ej21 {
    public static void main(String[] args) {
        int[][] matrizM = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };

        int[][] matrizP = {
                {23, 24, 25},
                {33, 34, 35},
                {43, 44, 45}
        };

        boolean encontrada = false;
        int filaInicio = -1;
        int columnaInicio = -1;

        // Recorrer todas las submatrices de 3x3 en la matriz M
        for (int i = 0; i <= matrizM.length - matrizP.length; i++) {
            for (int j = 0; j <= matrizM[i].length - matrizP[0].length; j++) {
                // Verificar si la submatriz coincide con la matriz P
                if (verificarSubmatriz(matrizM, matrizP, i, j)) {
                    encontrada = true;
                    filaInicio = i;
                    columnaInicio = j;
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }

        // Mostrar el resultado
        if (encontrada) {
            System.out.println("La matriz P está contenida en la matriz M.");
            System.out.println("La submatriz P comienza en la fila " + filaInicio + ", columna " + columnaInicio + ".");
        } else {
            System.out.println("La matriz P no está contenida en la matriz M.");
        }
    }

    public static boolean verificarSubmatriz(int[][] matrizM, int[][] matrizP, int filaInicio, int columnaInicio) {
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP[i].length; j++) {
                if (matrizM[filaInicio + i][columnaInicio + j] != matrizP[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}