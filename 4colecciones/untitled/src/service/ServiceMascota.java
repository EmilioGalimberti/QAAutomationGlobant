package service;
import entity.Mascota;

import java.util.*;

public class ServiceMascota {
    private final Scanner leer;

    //HASTA AHORA LO QUE VOY ENTENDIENDO ES QUE ESTO SERIA UN ARRAY DE OBJETOS
    // LISTA
    //private final ArrayList<Mascota> mascotas;
    //conjuntos
    // La defirencia entre las listas y los conjuntos es que los conjuntos no permiten elementos duplicados
    //HashSet y TreeSet no aceptan duplicados
    //Los treeSet tienen la naturaleza de ordenar cosas
    private final TreeSet<Mascota> mascotas;

    //constructor para inicializarlo
    public ServiceMascota() {
        this.leer =new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new TreeSet<>();
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
//    public void actualizarApodoMascota(int index){
//        if (index <= (mascotas.size()-1)) {
//            System.out.println("Actualizara el apodo de la mascota que esta en la posicion " + index);
//            Mascota m = mascotas.get(index);
//            m.setApodo("Roberto");
//        }else {
//            System.out.println("El indice es erroneo");
//        }
//    }
    //public void actualizarMascota(int index){
//        if (index <= (mascotas.size()-1)) {
//            System.out.println("Actualizara la mascota que esta en la posicion " + index);
//            Mascota m = crearMascota();
//            mascotas.set(index, m);
//        } else {
//            System.out.println("El indice es erroneo");
//        }
//    }

    public void eliminarMasocta(int index){
        if (index <= (mascotas.size()-1)) {
            System.out.println("Se eliminara la mascota que esta en la posicion " + index);
            mascotas.remove(index);
        }else {
            System.out.println("El indice es erroneo");
        }
    }

    public void eliminarPorNombre(String nombre){
        System.out.println("Se elimiinira la mascota con nombre " + nombre);
        //En verdad no podria usar el foreach porque ConcurrentModificationExpetion
//        for (Mascota aux : mascotas){
//            if(aux.getNombre().equals(nombre)){
//                mascotas.remove(aux);
//            }
//        }
        mascotas.removeIf(aux -> aux.getNombre().equals(nombre));
    }

    //public void ordenar(){
    //    Collections.sort(mascotas , ordernarPorNombreDescd); //NI IDEA NO ME FUNCIONA
    //}

    public static Comparator<Mascota> ordernarPorNombreDescd = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota o1, Mascota o2) {
            return o2.getNombre().compareTo(o1.getNombre());
        }
    };
}
