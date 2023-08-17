package entity;

public class Dog {
    String nombre;
    String raza;
    int edad;
    int tamaño;


    public Dog(String nombre, String raza, int edad, int tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamaño=" + tamaño +
                '}';
    }
}
