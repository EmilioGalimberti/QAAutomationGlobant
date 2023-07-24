package service;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceMascota {
    private final Scanner leer;
    private final ArrayList<String> mascotas;
    //private ArrayList<String> mascotas;
    //constructor para inicializarlo
    public ServiceMascota() {
        this.leer =new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList<>();
    }

    public void crearMascota(){
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();

        mascotas.add(nombre+" "+apodo+" "+ tipo);
    }

    public void mostrarMascotas(){
        System.out.println("Las mascotas actuales de la Lista Mascoas son");
        for (String aux: mascotas) {
            System.out.println(aux);
        }
        System.out.println("canitdad = " + mascotas.size());
    }
}
