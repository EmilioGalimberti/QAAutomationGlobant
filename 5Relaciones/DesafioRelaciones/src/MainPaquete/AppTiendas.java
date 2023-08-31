package MainPaquete;

import Servicio.ServicioTienda;

public class AppTiendas {
	
	public static void main(String[] args) {
		
		ServicioTienda servicioTienda = new ServicioTienda();


		servicioTienda.crearTienda();
		System.out.println("Tiendas creadas");
		servicioTienda.mostrarTiendas();
		//st.crearProducto(st.getListStores().get(0));



		//st.modificarProducto();
		
		
		
	}
	

}
