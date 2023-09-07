package masctoApp.entidades;

import java.util.Date;

public class User {
    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;

    public User(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
}
