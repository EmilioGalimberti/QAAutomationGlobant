import service.ServiceAlumno;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ServiceAlumno serviceAlumno = new ServiceAlumno();
        serviceAlumno.newAlumnos();
        serviceAlumno.mostrarAlumnos();
        serviceAlumno.notaFinal();
        }
    }
