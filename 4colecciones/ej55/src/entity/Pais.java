package entity;

import java.util.Objects;

public class Pais{
    String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pais pais)) return false;
        return Objects.equals(getNombre(), pais.getNombre());
    } // Le enseña a la clase a compararse consimo mismo Este caso me sirve para el tema de los sets que no son treeset
    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    } // Le da un hash a cada objeto creado y se evitan los repetidos

    //tambien se puede usar el compareTo con el implemnets https://youtu.be/3Y1eMAySVeM?t=457
    //no tiene  tanta libertar como el comparatero pero solo implica un sola forma de comparar Mas utilizado para los treeset


    /*
    equals se utiliza para verificar la igualdad entre objetos basándose en su contenido o valores.
compareTo se utiliza para definir el orden natural de los objetos de una clase basándose en un criterio específico.
     */

}
