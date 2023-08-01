package services;

import entity.Pais;

import java.util.*;

public class ServicePaises {

    Scanner scanner = new Scanner(System.in);

    private final Set<Pais> paises;

    public ServicePaises() {
        this.paises = new HashSet<>();
    }


    public void crearPaises() {
        String option;
        do {
            System.out.println("Ingrese un pais");
            String nombre = scanner.next();
            paises.add(new Pais(nombre));
            System.out.println("Desea crear otro pais?(si/no): ");
            option = scanner.next();
        } while (!option.equals("no"));
        mostrarPaises();
    }

    public void mostrarPaises() {
        System.out.println("Los paises actuales de la set paises son");
        for (Pais aux : paises) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + paises.size());
    }

    public void eliminarPaisPorNombre(String nombrePais) {
        Iterator<Pais> iterator = paises.iterator();
        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                iterator.remove();
                System.out.println("País eliminado: " + pais.getNombre());
                return;
            }
        }
        System.out.println("País no encontrado en el conjunto.");
    }

}
