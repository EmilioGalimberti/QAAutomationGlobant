package Servicio;

import Entity.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Vendedor altaVendedor(){
        //Intanciamos un objeto tipo vendedor
        Vendedor vendedor = new Vendedor(); // uso el contructor por defector
        System.out.println("Ingrese el nombre del vendedor");
        vendedor.setNombre(leer.next());
        System.out.println("Ingrese el dni del vendedor");
        vendedor.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo basico del vendedor");
        vendedor.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia que comenzo a trabajar el vendedor");
        vendedor.setFechaInicio(new Date(leer.nextInt()-1900, leer.nextInt()-1, leer.nextInt()));
        return vendedor;
    }
    public void sueldoMensual(Vendedor vendedor){
        System.out.println("Ingrese las ventas totales del vendedor");
        double ventas = leer.nextDouble();
        vendedor.setComisiones(ventas*0.15);
        vendedor.setSueldoMensual(vendedor.getSueldoBasico()+vendedor.getComisiones());
    }
    public void diasVacaciones(Vendedor vendedor){
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - vendedor.getFechaInicio().getYear();
        if (antiguedad<5){
            System.out.println("corresponden 14 dias de vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("corresponden 21 dias de vacaciones");
        } else if (antiguedad < 20 ) {
            System.out.println("corresponden 28 dias de vacaciones");
        }else{System.out.println("corresponden 35 dias de vacaciones");}
    }
}
