package ejerciciosBucles;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        do{
            mostrarMenu();
            opcion = leer.nextInt();
            ejecutarOpcion(opcion, num1, num2);
        } while (opcion != 5);
    }
    public static void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public static void ejecutarOpcion(int opcion, int num1, int num2){
        switch (opcion){
            case 1:
                System.out.println("Has seleccionado la Opción 1");
                System.out.println(sumar(num1,num2));
                break;
            case 2:
                System.out.println("Has seleccionado la Opción 2");
                System.out.println(restar(num1,num2));
                break;
            case 3:
                System.out.println("Has seleccionado la Opción 3");
                System.out.println(multiplicar(num1,num2));
                break;
            case 4:
                System.out.println("Has seleccionado la Opción 4");
                System.out.println(dividir(num1,num2));
                break;
            case 5:
                System.out.println("Saliendo del programa...");
            default:
                System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                break;
        }
        System.out.println(); // Salto de línea para mayor claridad
    }
    public static int sumar(int num1, int num2){ return num1 + num2;}
    public static int restar(int num1, int num2){ return num1 - num2;}
    public static int multiplicar(int num1, int num2){ return num1 * num2;}
    public static int dividir(int num1, int num2){ return num1 / num2;}
}

