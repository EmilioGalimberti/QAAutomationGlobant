package service;
import entity.Mascota;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceMascota {
    private final Scanner leer;

    //HASTA AHORA LO QUE VOY ENTENDIENDO ES QUE ESTO SERIA UN ARRAY DE OBJETOS
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

        return new Mascota(nombre, apodo, tipo);
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
            mascotas.add(mascotaCreada);
            System.out.println(mascotaCreada.toString());
        }
    }

    //TO dO añadir try and catth
    public void actualizarApodoMascota(int index){
        if (index <= (mascotas.size()-1)) {
            System.out.println("Actualizara el apodo de la mascota que esta en la posicion " + index);
            Mascota m = mascotas.get(index);
            m.setApodo("Roberto");
        }else {
            System.out.println("El indice es erroneo");
        }
    }
    public void actualizarMascota(int index){
        if (index <= (mascotas.size()-1)) {
            System.out.println("Actualizara la mascota que esta en la posicion " + index);
            Mascota m = crearMascota();
            mascotas.set(index, m);
        } else {
            System.out.println("El indice es erroneo");
        }
    }

    public void eliminarMasocta(int index){
        if (index <= (mascotas.size()-1)) {
            System.out.println("Se eliminara la mascota que esta en la posicion " + index);
            mascotas.remove(index);
        }else {
            System.out.println("El indice es erroneo");
        }
    }
}
