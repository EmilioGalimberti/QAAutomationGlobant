import entity.Matematica;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Matematica math = new Matematica();
        math.setNumero1(Math.random());
        math.setNumero2(Math.random());
        System.out.println("El numero mayor entre los dos es: ");
        math.devolverMayor();
        math.calcularPotencia();
        math.calculaRaiz();
    }
}
