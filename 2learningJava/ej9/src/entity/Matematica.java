package entity;

public class Matematica {
    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void devolverMayor(){
        System.out.println(Math.max(this.numero1,this.numero2));
    }

    public void calcularPotencia(){
        System.out.println("Potencia " + Math.pow(Math.round(Math.max(this.numero1,this.numero2)),Math.round(Math.min(this.numero1,this.numero2))));
    }

    public void calculaRaiz() {
        double menorValor = Math.min(Math.abs(this.numero1), Math.abs(this.numero2));
        System.out.println("raiz " + Math.sqrt(menorValor));
    }
}
