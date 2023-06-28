import java.util.Arrays;
import java.util.Random;

public class Arreglos {
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        // Inicializar el arreglo A con números aleatorios
        Random random = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextDouble() * 100;  // Números aleatorios entre 0 y 100
        }

        System.out.println("Arreglo A (desordenado):");
        System.out.println(Arrays.toString(arregloA));

        // Ordenar el arreglo A de menor a mayor
        Arrays.sort(arregloA);

        // Copiar los primeros 10 números ordenados al arreglo B
        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        // Rellenar los 10 últimos elementos del arreglo B con el valor 0.5
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);

        System.out.println("Arreglo A (ordenado):");
        System.out.println(Arrays.toString(arregloA));

        System.out.println("Arreglo B:");
        System.out.println(Arrays.toString(arregloB));
    }
}