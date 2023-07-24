package mascotaApp.Service;

import masctoApp.entidades.Mascota;

import java.util.Scanner;

public class MascotaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //DeLimiter para poder usar los espacio
    public Mascota crearMascota(){
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("Ingrese apodo");
        String apodo = leer.next();
        System.out.println("Ingrese tipo");
        String tipo = leer.next();
        return new Mascota(nombre, apodo, tipo);
    }
}
