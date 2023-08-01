package services;

import entity.Pais;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ServicePaises {

    Scanner scanner = new Scanner(System.in);

    private final Set<Pais> paises;

    public ServicePaises() {
        this.paises = new HashSet<>();
    }


    public void crearPaises(){
        String option;
        do{
            System.out.println("Ingrese un titulo");
            String nombre = scanner.next();
            paises.add(new Pais(nombre));
            System.out.println("Desea crear otra pelicula?(si/no): ");
            option = scanner.next();
        }while(!option.equals("no"));
        mostrarPaises();
    }

    public void mostrarPaises(){
        System.out.println("Las mascotas actuales de la Lista Mascoas son");
        for (Pais aux: paises){
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + paises.size());
    }

    public void ordenarAlfabeticamente(){
        ArrayList<Pais> paisesListea = new ArrayList<>(paises);
        paisesListea.sort(Pais.compararNombre);
    }
}
