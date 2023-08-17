package service;

import entity.Dog;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ServiceDog {

    /*
   Hemos proporcionado un comparador dentro del constructor de TreeSet para ordenar las personas por nombre
   Tambien habia otra forma de hacerlo que lo vimos en un video
   es lo mismo que la de persona
    */
    private final Set<Dog> Dogs = new TreeSet<>(Comparator.comparing(Dog::getNombre));

    public void createDog(){
        String nombre = "asd";
        String raza = "a";
        int edad = 12;
        int tamanio = 44805312;
        Dogs.add(new Dog(nombre,raza,edad,tamanio));
        nombre = "dsa";
        raza = "b";
        edad = 13;
        tamanio = 421332;
        Dogs.add(new Dog(nombre,raza,edad,tamanio));
    }

    public void showDogs(){
        for (Dog aux : Dogs){
            System.out.println(aux);
        }
    }

    public Set<Dog> getDogs() {
        return Dogs;
    }
}
