import enumeraciones.RazaPerro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String razaInput = "RAZE3";
        for (RazaPerro aux : RazaPerro.values()) {
            System.out.println(aux);
            if (razaInput == aux.toString()){
                System.out.println("SI");
            }
        }
        }
    }

// Enum https://www.youtube.com/watch?v=C6rM-bqtu0Y&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=6&t=118s