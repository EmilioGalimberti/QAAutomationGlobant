import services.ServicePaises;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ServicePaises servicePaises = new ServicePaises();

        servicePaises.crearPaises();
        servicePaises.ordenarAlfabeticamente();
        servicePaises.mostrarPaises();

    }
}