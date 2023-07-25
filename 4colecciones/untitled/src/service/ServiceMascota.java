package service;
import entity.Mascota;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceMascota {
    private final Scanner leer;
    private final ArrayList<Mascota> mascotas;

    //constructor para inicializarlo
    public ServiceMascota() {
        this.leer =new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList<>();
    }

    public Mascota crearMascota(){
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();

        Mascota m = new Mascota(nombre, apodo, tipo);
        mascotas.add(m);
        return m;
    }


    public void mostrarMascotas(){
        System.out.println("Las mascotas actuales de la Lista Mascoas son");
        for (Mascota aux: mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("canitdad = " + mascotas.size());
    }

    /**
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
     */
    public void fabricaChiquitos(int cantidad){
        for (int i = 0 ; i<cantidad ; i++){
            mascotas.add(new Mascota("Fer","Chiquito","Beagle"));
        }
    }

    public void fabricaMascotas(int cantidad){
        for (int i = 0 ; i < cantidad; i++){
            Mascota mascotaCreada = crearMascota();
            System.out.println(mascotaCreada.toString());

        }
    }
}
