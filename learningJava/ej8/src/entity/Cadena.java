package entity;

import java.util.Scanner;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
        // Constructor por defecto
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void mostrarVocales() {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < frase.length(); i++) {
            if (vocales.contains(String.valueOf(frase.charAt(i)))) {
                contador++;
            }
        }

        System.out.println("Cantidad de vocales: " + contador);
    }

    public void invertirFrase() {
        StringBuilder builder = new StringBuilder(frase);
        frase = builder.reverse().toString();

        System.out.println("Frase invertida: " + frase);
    }

    public void vecesRepetido(String letra) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (String.valueOf(frase.charAt(i)).equalsIgnoreCase(letra)) {
                contador++;
            }
        }

        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(String otraFrase) {
        int longitudOtraFrase = otraFrase.length();

        if (longitud == longitudOtraFrase) {
            System.out.println("La longitud de la frase es igual a la longitud de la otra frase.");
        } else if (longitud < longitudOtraFrase) {
            System.out.println("La longitud de la frase es menor que la longitud de la otra frase.");
        } else {
            System.out.println("La longitud de la frase es mayor que la longitud de la otra frase.");
        }
    }

    public void unirFrases(String otraFrase) {
        frase = frase + " " + otraFrase;

        System.out.println("Frase resultante: " + frase);
    }

    public void reemplazar(String letra, String reemplazo) {
        frase = frase.replace(letra, reemplazo);

        System.out.println("Frase resultante: " + frase);
    }

    public boolean contiene(String letra) {
        return frase.contains(letra);
    }
}