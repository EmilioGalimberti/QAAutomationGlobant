package ejerciciosVariables;

//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//       Math.sqrt().

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("El doble del numero ingresado es de: " + num1*2);
        System.out.println("El triple del numero ingresado es de: "+ num1*3);
        System.out.println("La raiz cuadrada del numero ingresado es de: " +  Math.sqrt(num1));
    }
}
