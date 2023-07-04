package Entity;

import java.util.Scanner;

public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo;

    public Movil() {
        codigo = new int[7];
    }

    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void cargarCelular() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca del móvil: ");
        marca = scanner.nextLine();

        System.out.print("Ingrese el precio del móvil: ");
        precio = scanner.nextDouble();

        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el modelo del móvil: ");
        modelo = scanner.nextLine();

        System.out.print("Ingrese la memoria RAM del móvil: ");
        memoriaRam = scanner.nextInt();

        System.out.print("Ingrese el almacenamiento del móvil: ");
        almacenamiento = scanner.nextInt();

        ingresarCodigo();
    }

    public void ingresarCodigo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código del móvil (siete números):");

        for (int i = 0; i < codigo.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            codigo[i] = scanner.nextInt();
        }
    }
}