package ejerciciosVariables;


import java.util.Scanner;

//Tema ej1

public class ej1{
    //method
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        System.out.println("El resultado de la suma es:");
        System.out.println(suma(num1,num2));
    }
    public static int suma(int a, int b){
        return a+b;
    }
}