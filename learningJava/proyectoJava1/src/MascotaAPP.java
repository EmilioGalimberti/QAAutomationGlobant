import masctoApp.entidades.Mascota;

import java.util.Scanner;

public class MascotaAPP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Mascota mascota1 = new Mascota("Fernando chiquito", "pepe", "perro");

        //si los atributos fueran publicos
        //mascota1.nombre = "aka";
        mascota1.setNombre("pepe");
        System.out.println(mascota1.toString());

    }
}
