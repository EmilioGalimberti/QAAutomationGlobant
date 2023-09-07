import mascotaApp.Service.MascotaService;
import masctoApp.entidades.Mascota;

import java.util.Scanner;

public class MascotaAPP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Mascota mascota1 = new Mascota("Fernando chiquito", "pepe", "perro");

        //si los atributos fueran publicos
        //mascota1.nombre = "aka";
        //mascota1.setNombre("pepe");
        //mascota1.Pasear(100);
        //mascota1.Pasear(100, 2);

        MascotaService servicioMascota = new MascotaService();
        Mascota mascota1 = servicioMascota.crearMascota();

        System.out.println(mascota1.toString());

    }
}
