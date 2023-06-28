package entity;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private char genero;
    private int peso;
    private int altura;

    //constructor por defecto
    public Persona(){}
    //constructor con todos los atributos como parametro
    public Persona(String nombre, int edad, char genero, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public char getGenero() {
        return genero;
    }
    public int getPeso() {
        return peso;
    }
    public int getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public static Persona crearPersona(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        Persona persona = new Persona();

        persona.nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        persona.edad = scanner.nextInt();

        System.out.print("Ingrese el sexo (H/M/O): ");
        persona.genero = scanner.next().charAt(0);

        System.out.print("Ingrese el peso: ");
        persona.peso = scanner.nextInt();

        System.out.print("Ingrese la altura: ");
        persona.altura = scanner.nextInt();
        return persona;
    }

    public int calcularIMC(){
        int pesoIdeal = (this.peso/(this.altura*this.altura));
        if (pesoIdeal <20){
            return -1;
        }
        else if (pesoIdeal <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    public boolean esMayorDeEdad(){
        return this.edad > 18;
    }
}
