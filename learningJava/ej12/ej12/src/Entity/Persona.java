package Entity;

import java.util.Date;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        setNombre(nombre);

        System.out.print("Ingrese la fecha de nacimiento (formato dd/mm/aaaa): ");
        String fechaStr = scanner.nextLine();
        String[] partesFecha = fechaStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);
        int anio = Integer.parseInt(partesFecha[2]);
        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        setFechaNacimiento(fechaNacimiento);
    }

    public int calcularEdad() {
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear() + 1900;
        int mesActual = fechaActual.getMonth() + 1;
        int diaActual = fechaActual.getDate();

        int anioNacimiento = fechaNacimiento.getYear() + 1900;
        int mesNacimiento = fechaNacimiento.getMonth() + 1;
        int diaNacimiento = fechaNacimiento.getDate();

        int edad = anioActual - anioNacimiento;

        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        return edad;
    }

    public boolean menorQue(int edad) {
        int edadActual = calcularEdad();
        return edadActual < edad;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fecha de Nacimiento: " + getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad() + " años");
    }
}