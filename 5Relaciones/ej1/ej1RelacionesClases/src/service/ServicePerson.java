package service;

import entity.Person;
import entity.Dog;


import java.util.*;

public class ServicePerson {

    /*
    Hemos proporcionado un comparador dentro del constructor de TreeSet para ordenar las personas por nombre
    Tambien habia otra forma de hacerlo que lo vimos en un video
     */
    private final Set<Person> people = new TreeSet<>(new Comparator<Person>() {
        @Override
        public int compare(Person persona1, Person persona2) {
            return persona1.getNombre().compareTo(persona2.getNombre());
        }
    });


    public void createPerson(){
        String nombre = "emilio";
        String apellido = "Galimberti";
        int edad = 12;
        int dni = 44805312;
        people.add(new Person(nombre,apellido,edad,dni));
        nombre = "agustin";
        apellido = "Galimberti";
        edad = 13;
        dni = 44845112;
        people.add(new Person(nombre,apellido,edad,dni));
    }

    public void showPeople(){
        for (Person aux : people){
            System.out.println(aux);
        }
    }

    public void  adoptDog(String personName,String dogName , Set<Dog> dogs ){
        for (Person aux : people){
            if (aux.getNombre() == personName){
                for (Dog aux2 : dogs ){
                    if (aux2.getNombre() == dogName){
                        System.out.println("A");
                        aux.setDog(aux2);
                    }
                }
            }
        }
    }

}
