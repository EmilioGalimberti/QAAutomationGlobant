package Servicio;

import Entidades.Producto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServiceProduct {

    public static Producto crearProducto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID del producto:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del producto:");
        int precio = scanner.nextInt();

        System.out.println("Ingrese el stock de ese producto:");
        int stock = scanner.nextInt();

        return new Producto(id, nombre, precio,stock);
    }

    public static void mostrarProductos(ArrayList<Producto> productos){
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static void modificarProducto(ArrayList<Producto> productos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto a modificar:");
        String nombreModificar = scanner.nextLine();

        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreModificar)) {
                System.out.println("Ingrese el nuevo precio:");
                int nuevoPrecio = scanner.nextInt();
                producto.setPrecio(nuevoPrecio);
                System.out.println("Precio modificado.");
                break; // Terminamos el bucle una vez que encontramos el producto
            }
        }

        System.out.println("Lista de productos actualizada:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static boolean EleminarProducto(ArrayList<Producto> productos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto a modificar:");
        String nombreEleminar = scanner.nextLine();

        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getNombre().equalsIgnoreCase(nombreEleminar)) {
                iterator.remove();
                return true;
            }
        }
        return false; // Producto no encontrado
    }
}

