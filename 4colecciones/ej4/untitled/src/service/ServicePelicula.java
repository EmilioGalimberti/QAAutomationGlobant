package service;

import entity.Pelicula;

import java.util.*;

public class ServicePelicula {
    Scanner scanner = new Scanner(System.in);

    private final List<Pelicula> peliculas;

    public ServicePelicula() {
        this.peliculas = new ArrayList<>();
    }


    public void crearPelicula(){
        String option;
        do{
            System.out.println("Ingrese un titulo");
            String titulo = scanner.next();
            System.out.println("Ingrese un director");
            String director = scanner.next();
            System.out.println("Ingrese un duracion");
            int duracion = scanner.nextInt();
            peliculas.add(new Pelicula(titulo,director,duracion));
            System.out.println("Desea crear otra pelicula?(si/no): ");
            option = scanner.next();
        }while(!option.equals("no"));
    }

    public void mostrarPeliculas(){
        System.out.println("Las mascotas actuales de la Lista Mascoas son");
        for (Pelicula aux: peliculas){
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + peliculas.size());
    }

    public void mostrarPeliculasMasUnaHora(){
        System.out.println("Las mascotas actuales de la Lista Mascoas son");
        for (Pelicula aux: peliculas){
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        }
        System.out.println("Cantidad = " + peliculas.size());
    }

    public void ordenarPeliculasPorDuracionMayorAMenor() {
        peliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorDuracionMenorAMayor() {
        peliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion));
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorTitulo() {
        peliculas.sort(Comparator.comparing(Pelicula::getTitulo));
        System.out.println("Películas ordenadas por título:");
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorDirector() {
        peliculas.sort(Comparator.comparing(Pelicula::getDirector));
        System.out.println("Películas ordenadas por director:");
        mostrarPeliculas();
    }

}
