package masctoApp.entidades;

import Interfaces.AccionMascota;

//final corta la herencia, es decir protejo a mascota que no sea padre de ninguna
public final class Mascota implements AccionMascota {
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;

    public Mascota() {
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }

    public void  setNombre(String nombre){
        if (nombre.length() > 0){
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setCola(boolean cola) {
        this.cola = cola;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApodo() {
        return apodo;
    }
    public String getTipo() {
        return tipo;
    }
    public String getColor() {
        return color;
    }
    public int getEdad() {
        return edad;
    }
    public boolean isCola() {
        return cola;
    }
    public String getRaza() {
        return raza;
    }

    //SobreCarga de metodos, tienen mismo nombre pero reciben diferentes metodos
    public int Pasear(int energiaRestar){
        energia -= energiaRestar;
        return energia;
    }
    /** y apretas espacio y ya se hace solo lo de abajo
    /**
     *
     * @param energiaRestar
     * @param vueltas
     * @return
     */
    public int Pasear(int energiaRestar, int vueltas){
        for (int i = 0 ; i < vueltas; i++){
            energia -= energiaRestar;
        }
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", apodo='" + apodo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", cola=" + cola +
                ", raza='" + raza + '\'' +
                ", energia=" + energia +
                '}';
    }

    @Override
    public void pasear(int metros) {

    }

    @Override
    public int molestarDueno() {
        return 0;
    }

    @Override
    public void comerAlimento(int cantidad) {

    }
}
