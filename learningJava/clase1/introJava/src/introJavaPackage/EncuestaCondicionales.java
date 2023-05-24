package introJavaPackage;
import java.util.Scanner;

//Tema If anidado

public class EncuestaCondicionales {
    public static void main(String[] args){
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 al 5 estrellas");
        opinion = leer.nextInt();

        if (opinion >= 1 && opinion <= 5){
            switch (opinion) {
                case 1, 2 -> System.out.println("Nos Sentimos apenados que no hayas disfrutado la peli..");
                case 3 -> System.out.println("Has calificado la peli como buena");
                case 4 -> System.out.println("Has calificado la peli como muy buena");
                case 5 -> System.out.println("Has calificado la peli como muy muy buena");
            }
        } else if (opinion<0) {
            System.out.println("re mala fue la peli bo");
        } else if (opinion == 0) {
            System.out.println("el valor no es valido " + opinion);
        }else {
            System.out.println("la peli ta goooooooooood");
        }
    }
}
