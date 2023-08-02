package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {
    private final Map<String, Double> productos;

    public TiendaService() {
        productos = new HashMap<>();
    }

    public void agregarProducto(String nombreProducto, double precio) {
        productos.put(nombreProducto, precio);
    }

    public void modificarPrecio(String nombreProducto, double nuevoPrecio) {
        if (productos.containsKey(nombreProducto)) {
            productos.put(nombreProducto, nuevoPrecio);
            System.out.println("Precio del producto '" + nombreProducto + "' modificado correctamente.");
        } else {
            System.out.println("El producto '" + nombreProducto + "' no existe en la tienda.");
        }
    }

    public void eliminarProducto(String nombreProducto) {
        if (productos.containsKey(nombreProducto)) {
            productos.remove(nombreProducto);
            System.out.println("Producto '" + nombreProducto + "' eliminado correctamente.");
        } else {
            System.out.println("El producto '" + nombreProducto + "' no existe en la tienda.");
        }
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("La tienda no tiene productos registrados.");
        } else {
            System.out.println("Productos en la tienda:");
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                System.out.println(entry.getKey() + " - Precio: " + entry.getValue());
            }
        }
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextLine().charAt(0);

            switch (opcion) {
                case '1' -> {
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precioProducto = Double.parseDouble(scanner.nextLine());
                    agregarProducto(nombreProducto, precioProducto);
                }
                case '2' -> {
                    System.out.print("Ingrese el nombre del producto a modificar: ");
                    String productoModificar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    double nuevoPrecio = Double.parseDouble(scanner.nextLine());
                    modificarPrecio(productoModificar, nuevoPrecio);
                }
                case '3' -> {
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String productoEliminar = scanner.nextLine();
                    eliminarProducto(productoEliminar);
                }
                case '4' -> mostrarProductos();
                case '0' -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != '0');
    }
}
