package Servicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Entidades.Producto;
import Entidades.Tienda;

public class ServicioTienda {

	public ArrayList<Tienda> listStores = new ArrayList<>();
	// HashMap<Producto, Integer> carritoCliente = new HashMap<>();
	ArrayList<Producto> carritoCliente = new ArrayList<>();

	Scanner leer = new Scanner(System.in);

	Tienda store = new Tienda();

	//Tienda tiendaSeleccionada = seleccionarTiendaPorId();

//	public void crearProducto(Tienda tienda) {
//
//		Producto producto = new Producto(1, "Pasta", 2000, 20);
//		Producto producto2 = new Producto(2, "Arroz", 2000, 10);
//		Producto producto3 = new Producto(3, "Chocolate", 2000, 1);
//		Producto producto4 = new Producto(4, "Milo", 2000, 2);
//		Producto producto5 = new Producto(5, "Leche", 2000, 15);
//
//		tienda.agregarProducto(producto);
//		tienda.agregarProducto(producto2);
//		tienda.agregarProducto(producto3);
//		tienda.agregarProducto(producto4);
//		tienda.agregarProducto(producto5);
//
//	}

//	public void mostrarProductos(Tienda tienda) {
//
//		tienda.getListaProductos().forEach(System.out::println);
//
//	}

	public void crearTienda() {

		Tienda store = new Tienda(1, null, "carrera 30 con calle 15", "Stephany");
		Tienda store2 = new Tienda(2, null, "carrera 10 con calle 10", "Lola");

		listStores.add(store);
		listStores.add(store2);

	}
	public void mostrarTiendas() {
			listStores.forEach(System.out::println);
	}

	public void modificarTienda(ArrayList<Tienda> tiendas) {
		System.out.println("Ingrese el nombre del Tienda a modificar:");
		String representanteModificar = leer.nextLine();

		for (Tienda tienda : tiendas) {
			if (tienda.getRepresentante().equalsIgnoreCase(representanteModificar)) {
				System.out.println("Ingrese el nuevo Representante:");
				String  nuevoRepresentante = leer.next();
				tienda.setRepresentante(nuevoRepresentante);
				System.out.println("Representante modificado.");
				break; // Terminamos el bucle una vez que encontramos el producto
			}
		}

		System.out.println("Lista de tiendas actualizada:");
		for (Tienda tienda : tiendas) {
			System.out.println(tiendas);
		}

	}

//	public void modificarProducto() {
//
//		Producto product = buscarProducto();
//
//		// product != null
//
//		if (product.getNombre() != null) {
//			System.out.println("¿Qué atributo quieres modificar ?");
//			System.out.println("1: Nombre");
//			System.out.println("2: Precio");
//			System.out.println("3: Stock");
//			int opcion = leer.nextInt();
//
//			switch (opcion) {
//			case 1:
//				leer.nextLine();
//				System.out.println("Ingresa el nuevo nombre");
//				product.setNombre(leer.next());
//				break;
//			case 2:
//				System.out.println("Ingresa el nuevo precio");
//				product.setPrecio(leer.nextInt());
//				break;
//			case 3:
//
//				System.out.println("Ingresa la cantidad del producto");
//				product.setStockProducto(leer.nextInt());
//				break;
//
//			default:
//				System.out.println("No seleccionaste una opción válida");
//				break;
//			}
//
//		} else {
//			System.out.println("No existe un producto con ese nombre ");
//		}
//	}
//	public void eliminarProducto() {
//
//		Producto product = buscarProducto();
//
//		tiendaSeleccionada.getListaProductos().remove(product);
//
//	}

//	public void eliminarTienda() {
//
//		listStores.remove(tiendaSeleccionada);
//	}

//	public void agregarProductosCarrito() {
//
//		Producto product = buscarProducto();
//
//		System.out.println("Ingresa la cantidad que deseas comprar");
//		int cant = leer.nextInt();
//
//		product.setStockProducto(cant);
//
//		carritoCliente.add(product);
//
//	}

//	public void venderProductos() {
//
//		ArrayList<Producto> productosLista = tiendaSeleccionada.getListaProductos();
//
//		for (int i = 0; i < productosLista.size(); i++) {
//			if (productosLista.get(i).equals(carritoCliente.get(i))
//					&& productosLista.get(i).getStockProducto() >= carritoCliente.get(i).getStockProducto()) {
//				productosLista.get(i).setStockProducto(
//						productosLista.get(i).getStockProducto() - carritoCliente.get(i).getStockProducto());
//			}
//		}
//
//		System.out.println("su compra a sido exitosa ");

//		ArrayList<Producto> productosLista= tiendaSeleccionada.getListaProductos();
//		
//		
//		for (int i = 0; i < tiendaSeleccionada.getListaProductos().size(); i++) {
//			if(carritoCliente.containsKey(productosLista.get(i))) {
//				
//				productosLista.get(i).setStockProducto(productosLista.get(i).getStockProducto()-);
//				
//			}
//			
//		}

//	}

//	public void stockProductos() {
//
//		for (Producto producto : tiendaSeleccionada.getListaProductos()) {
//			System.out.println(
//					"El producto " + producto.getNombre() + "Tiene un stock de: " + producto.getStockProducto());
//		}
//
//	}

	public ArrayList<Tienda> getListStores() {
		return listStores;
	}

	public void setListStores(ArrayList<Tienda> listStores) {
		this.listStores = listStores;
	}

}
