import entity.Cadena;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadena cadena = new Cadena();

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        cadena.setFrase(frase);
        System.out.println(cadena.getLongitud());

        cadena.mostrarVocales();
        cadena.invertirFrase();

        System.out.print("Ingrese un carácter: ");
        String letra = scanner.nextLine();
        cadena.vecesRepetido(letra);

        System.out.print("Ingrese otra frase: ");
        String otraFrase = scanner.nextLine();
        cadena.compararLongitud(otraFrase);

        cadena.unirFrases(otraFrase);

        System.out.print("Ingrese una letra: ");
        letra = scanner.nextLine();
        System.out.print("Ingrese el carácter de reemplazo: ");
        String reemplazo = scanner.nextLine();
        cadena.reemplazar(letra, reemplazo);

        System.out.print("Ingrese una letra: ");
        letra = scanner.nextLine();
        boolean contieneLetra = cadena.contiene(letra);
        System.out.println("La frase contiene la letra '" + letra + "': " + contieneLetra);
    }
}

