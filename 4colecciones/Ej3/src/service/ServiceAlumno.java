package service;

import entity.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceAlumno {
    ArrayList<Alumno> alumnos = new ArrayList<>();

    //si me olvido del new, lo puedo incializar asi
//    public ServiceAlumno() {
//        alumnos = new ArrayList<>();
//    }
    Scanner leer = new Scanner(System.in);
    public void newAlumnos(){
        String option;
        do {
            System.out.println("Introducir nombre");
            String nombre = leer.next();
            System.out.println("Introducir notas");
            ArrayList<Double> notas = new ArrayList<>();
            for (int i = 0; i < 3; i++) {

                notas.add(leer.nextDouble());

            }
            alumnos.add(new Alumno(nombre, notas));
            System.out.println("Desea ingresar otro alumno?");
            option = leer.next();
        }while (!option.equals("no"));
    }

    public void mostrarAlumnos(){
        for (Alumno alumno : alumnos){
            System.out.println(alumno.toString());
        }
    }

    public Alumno buscarAlumno(String nombreAlumno){
        for (Alumno alumno : alumnos){
            if (alumno.getNombre().equals(nombreAlumno)){
                return alumno;
            }
        }
        return  null;
    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno que desa saber su nota final");
        String nombre = leer.next();
        Alumno alumnoEncontrado = buscarAlumno(nombre);
        Double acum = (double) 0;
        for (Double nota : alumnoEncontrado.getNotas()) {
            acum += nota;
        }
        Double notaFinal = acum / 3;
        System.out.println(notaFinal);
    }
}
