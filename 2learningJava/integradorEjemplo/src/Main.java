import Entity.Vendedor;
import Servicio.VendedorService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        VendedorService vendedorService = new VendedorService();
        Vendedor vendedor1 = vendedorService.altaVendedor();
        vendedorService.sueldoMensual(vendedor1);
        vendedorService.diasVacaciones(vendedor1);
        System.out.println(vendedor1);
    }
}