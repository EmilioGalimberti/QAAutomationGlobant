import Entity.Movil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Movil movil = new Movil();
        movil.cargarCelular();

        System.out.println("Información del móvil:");
        System.out.println("Marca: " + movil.getMarca());
        System.out.println("Precio: " + movil.getPrecio());
        System.out.println("Modelo: " + movil.getModelo());
        System.out.println("Memoria RAM: " + movil.getMemoriaRam());
        System.out.println("Almacenamiento: " + movil.getAlmacenamiento());
        System.out.println("Código: " + Arrays.toString(movil.getCodigo()));
    }
}