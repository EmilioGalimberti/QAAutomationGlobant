import Entity.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.crearCurso();

        System.out.println("La ganancia semanal del curso es: " + curso.calcularGananciaSemanal());
    }
}