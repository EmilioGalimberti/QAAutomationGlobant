package introJavaPackage;


import java.util.Scanner;

//tema matrices y vectores
/*
Realizar la multiplicacion de NxM el resultado del producto es 1xM
ej. vector 1x2 * matriz 2x3 = producto 1x3
v[3,5] * m=[4,8,6] = [3x4+5x2,3x8+5x1,3x6+5x7] = [22,29,53]
           [2,1,7]
 */
public class ProductArrayMatrix {
    public static void main(String[] args){
        //declaracion y creacion array
        //tipo[] nombreArray = new tipo[Dimension]

        //declarar un arreglo de una deimension
        int[] array;
        //crear en memoira (construir/dimensionar) con el valor por defecto (cero para los enteros)
        array = new int[2];
        //declarar y dimensionar en una sola linea
        int [] producto = new int[3];


        //matriz
        //tipo[][] nombreMatriz = new tipo[Filas][Columnas]
        int[][] matriz = {{4,8,6},{2,1,7}};

        System.out.println("Ingrese los valores del vector de tamaño"+array.length+":");
        Scanner leer = new Scanner(System.in);
        //int = 0 ; porque los subindeces de los arrays empiezan en cero
        //cargar valores en el array
        for (int i = 0 ; i< array.length; i++){
            System.out.println("v["+i+"]=");
            //accede al vlaor i del array
            array[i] = leer.nextInt();
        }
        //multiplicamos matriz con vector
        int sum;
        //...para cada columna de la matriz..
        //.lengt = Cardinalidad del array
        for (int j=0;j< matriz[0].length; j++){
            sum = 0;
            //.. recorro el array y multiplico
            for (int i = 0; i < array.length; i++){
                sum += array[i]*matriz[i][j];
            }
            producto[j] = sum;
        }

        StringBuilder aux = new StringBuilder();
        //Mostrar array
        System.out.println("* Vector:");
        //bucle for "mejorado" (enhanced)
        //for (tipo elemton :arraglo)
        //recorremos elemntos por elementos como en python for i in array
        for (int elemento: array){
            //aux = aux+" "+ elemento;
            aux.append(" ").append(elemento);
        }
        System.out.println(aux);

        //Mostrar matriz
        System.out.println("\n*Matriz:");

        //n dimension = n cantida de bucles
        //para cada fila de la matriz
        for(int[] fila: matriz){
            aux = new StringBuilder();
            //para cada elemento de la fila
            for (int elemento: fila){
                //aux += " "+elemento;
                aux.append(" ").append(elemento);
            }
            System.out.println(aux);
        }

        //Mostrar resultado
        aux = new StringBuilder();
        System.out.println("\n* Vector x Matriz:");
        for (int elemento: producto){
            //aux += " "+elemento;
            aux.append(" ").append(elemento);
        }
        System.out.println(aux);
    }
}
