package Entity;

import java.util.Scanner;

public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso() {
        alumnos = new String[5];
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        alumnos = new String[5];
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los nombres de los alumnos:");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
        }
    }

    public void crearCurso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = scanner.nextLine();

        System.out.print("Ingrese la cantidad de horas por día: ");
        cantidadHorasPorDia = scanner.nextInt();

        System.out.print("Ingrese la cantidad de días por semana: ");
        cantidadDiasPorSemana = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el turno (mañana o tarde): ");
        turno = scanner.nextLine();

        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = scanner.nextDouble();

        cargarAlumnos();
    }

    public double calcularGananciaSemanal() {
        int cantidadAlumnos = 0;
        for (String alumno : alumnos) {
            if (alumno != null) {
                cantidadAlumnos++;
            }
        }

        return cantidadHorasPorDia * precioPorHora * cantidadAlumnos * cantidadDiasPorSemana;
    }
}