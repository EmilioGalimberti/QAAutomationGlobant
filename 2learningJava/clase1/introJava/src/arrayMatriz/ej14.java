package arrayMatriz;
import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la canitdad que desa convertir: ");
        int euro = scanner.nextInt();

        double[] valoresMonedas = {0.86,1.28,129.85};
        String[] nombreCambio = {"libra","Dolar","Yenes"};



        for (int i = 0; i < valoresMonedas.length; i++){
            double cambio = valoresMonedas[i] * euro;
            System.out.println(cambio+ " " + nombreCambio[i]);
        }
    }
}
