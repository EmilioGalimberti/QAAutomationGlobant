package introJavaPackage;
import java.util.Scanner;

//Tema bucles y sentencias de salto(continue)
public class SumatoriaConSalto {
    public static void main(String[] args){
        int num;
        Scanner leer = new Scanner(System.in);

        do{
            System.out.println("Ingrese un numero entero positivo");
            num = leer.nextInt();
            if(num>1000){
                System.out.println("La ejecucion podria tardar s/n");
                String confirm = leer.next();
                if ( confirm.equals("s")){  //confirm == "s"
                    break;
                }
            }
        }while (num <= 0 || num>1000);

        int j, suma;

        for(int i=1; i<= num ; i++){
            if (i%2 != 0){ continue;} //continue: detiene la iteracion actual y salta a la siguiente
            suma = 0;
            j=1;
            while (j<=i){
                suma += j;
                j++;
            }
            System.out.println("La suma de los "+i+" numeros naturlaes es de: "+suma);
        }

    }
}
